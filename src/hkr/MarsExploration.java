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
public class MarsExploration {

        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                String S = in.next();
                char[] arr = S.toCharArray();
                int ret = 0;
                for (int i = 0; i <= arr.length - 3; i += 3) {
                        if (arr[i] != 'S') {
                                ret++;
                        }
                        if (arr[i + 1] != 'O') {
                                ret++;
                        }
                        if (arr[i + 2] != 'S') {
                                ret++;
                        }
                }
                System.out.println(ret);
        }
}
