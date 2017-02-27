/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hkr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/truck-tour
 * @author ducnt3
 */
public class TruckTour {

        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int N = in.nextInt(), f, d;
                List<Integer> list = new ArrayList<>();

                for (int i = 0; i < N; i++) {
                        f = in.nextInt();
                        d = in.nextInt();
                        list.add(f - d);
                }
                int size = N;
                for (int i = 0; i < size; i++) {
                        if (list.get(i) > 0) {
                                int s = list.get(i);
                                for (int j = 1; j < size; j++) {
                                        s = s + list.get((i + j) % size);

                                        if (s < 0) {
                                                break;
                                        }
                                }
                                if (s > 0) {
                                        System.out.println(i);
                                        return;
                                }

                        }
                }
        }
}
