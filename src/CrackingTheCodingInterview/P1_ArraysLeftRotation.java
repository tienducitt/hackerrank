/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrackingTheCodingInterview;

import java.util.Scanner;

/**
 *
 * @author ducnt3
 */
public class P1_ArraysLeftRotation {

        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                int k = in.nextInt();
                int a[] = new int[n];
                for (int a_i = 0; a_i < n; a_i++) {
                        a[a_i] = in.nextInt();
                }

                for (int i = 0; i < n; i++) {
                        int index = (i + k) % n;
                        System.out.print(a[index] + " ");
                }

                System.out.println();
        }
}
