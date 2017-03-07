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
public class BiggerIsGreater {

        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                for (int i = 0; i < n; i++) {
                        String input = in.next();
                        char[] arr = input.toCharArray();
                        if (nextPermutation(arr)) {
                                System.out.println(new String(arr));
                        } else {
                                System.out.println("no answer");
                        }
                }
        }

        public static boolean nextPermutation(char[] array) {
                int i = array.length - 1;
                while (i > 0 && array[i - 1] >= array[i]) {
                        i--;
                }
                if (i <= 0) {
                        return false;
                }

                int j = array.length - 1;
                while (array[j] <= array[i - 1]) {
                        j--;
                }
                char temp = array[i - 1];
                array[i - 1] = array[j];
                array[j] = temp;

                j = array.length - 1;
                while (i < j) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                        i++;
                        j--;
                }
                return true;
        }
}
