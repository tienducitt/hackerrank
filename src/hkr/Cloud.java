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
public class Cloud {

        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                int k = in.nextInt();
                int c[] = new int[n];
                for (int c_i = 0; c_i < n; c_i++) {
                        c[c_i] = in.nextInt();
                }
                int e = 100;
                for (int i = k % n; i < n; i = (i + k) % n) {
                        
                        e = (c[i] == 0) ? e - 1 : e - 3;
                        if (i == 0) {
                                break;
                        }
                }
                System.out.println(e);
        }
}
