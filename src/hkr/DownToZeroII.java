/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hkr;

/**
 *
 * @author ducnt3
 */
public class DownToZeroII {

        static int[] ret = new int[1000001];

        public static void main(String[] args) {
                //int N = 4;
                ret[1] = 1;
                ret[2] = 2;
                ret[3] = 3;

                for (int i = 4; i < 1000000; i++) {
                        ret[i] = cal(i);
                }

                System.out.println(ret[812849]);
        }

        public static int cal(int n) {
                int min = 1000000000;
                int sqrt = (int) Math.sqrt(n) + 1;
                for (int i = 2; i < sqrt; i++) {
                        if (n % i == 0) {
                                min = Math.min(min, ret[n / i]);
                        }
                }

                min = Math.min(min, ret[n - 1]);
                min++;
                return min;
        }
}
