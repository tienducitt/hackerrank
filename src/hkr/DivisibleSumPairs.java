/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hkr;

import java.util.Scanner;

/**
 *
 * @author ducnt3
 */
public class DivisibleSumPairs {

        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                int k = in.nextInt();
                int a[] = new int[n];
                for (int a_i = 0; a_i < n; a_i++) {
                        a[a_i] = in.nextInt();
                }

                int ret = 0;
                for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                                int s = a[i] + a[j];
                                if (s % k == 0) {
                                        ret++;
                                }
                        }
                }
                System.out.println(ret);
        }
}
