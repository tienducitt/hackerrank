/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrackingTheCodingInterview;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author ducnt3
 */

/* Script: https://www.hackerrank.com/challenges/ctci-find-the-running-median?h_r=next-challenge&h_v=zen
 * Using list with Collections.sort() is not effective here
 * We need a data structure that:
 * - duplicate value
 * - add() + sort
 * - get()
 * 
 * -> Heap ???
 */
public class P5_Heaps_Find_the_Running_Median {

        public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                int n = in.nextInt();

                Median median = new Median();
                for (int a_i = 0; a_i < n; a_i++) {
                        int value = in.nextInt();
                        median.add(value);
                        System.out.println(median.getValue());
                }
        }

        public static class Median {

                PriorityQueue<Integer> minQueue = new PriorityQueue<>(new Comparator<Integer>() {
                        @Override
                        public int compare(Integer o1, Integer o2) {
                                return o2 - o1;
                        }
                });

                PriorityQueue<Integer> maxQueue = new PriorityQueue<>(new Comparator<Integer>() {
                        public int compare(Integer o1, Integer o2) {
                                return o1 - o2;
                        }
                });

                public void add(int number) {
                        if (number < getTopMinQueue()) {
                                minQueue.add(number);
                        } else {
                                maxQueue.add(number);
                        }
                        balanceQueues();
                }

                private void balanceQueues() {
                        if (minQueue.size() - maxQueue.size() > 1) {
                                int num = minQueue.poll();
                                maxQueue.add(num);
                        } else if (maxQueue.size() - minQueue.size() > 1) {
                                int num = maxQueue.poll();
                                minQueue.add(num);
                        }
                }

                private int getTopMinQueue() {
                        if (minQueue.size() > 0) {
                                return minQueue.peek();
                        }

                        return Integer.MAX_VALUE;
                }

                private int getTopMaxQueue() {
                        if (maxQueue.size() > 0) {
                                return maxQueue.peek();
                        }

                        return 0;
                }

                public float getValue() {
                        if ((minQueue.size() + maxQueue.size()) % 2 == 0) {
                                return ((float) (getTopMaxQueue() + getTopMinQueue())) / 2;
                        } else if (minQueue.size() > maxQueue.size()) {
                                return getTopMinQueue();
                        }

                        return getTopMaxQueue();
                }

        }
}
