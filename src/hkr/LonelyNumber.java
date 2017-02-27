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
 * https://www.hackerrank.com/challenges/lonely-integer
 * @author ducnt3
 */
public class LonelyNumber {

        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                        list.add(in.nextInt());
                }
                System.out.println(list.stream().reduce(0, (x, y) -> x ^ y));
        }

}
