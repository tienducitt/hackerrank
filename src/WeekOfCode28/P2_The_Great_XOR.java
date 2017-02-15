/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeekOfCode28;

/**
 *
 * @author ducnt3
 */
public class P2_The_Great_XOR {

        public static void main(String[] args) {
                long x = 10;
                System.out.println((x >> 64) & 1);
                int lastIndex = 64;
                for (int i = 0; i < 64; i++) {
                        long bit = ((x >> i) & 1);
                        if(bit == 1) {
                                lastIndex = i;
                        }
                }
                
                int result = 0;
                int m = 1;
                
                for (int i = 0; i < lastIndex; i++) {
                        long bit = ((x >> i) & 1);
                        if (bit == 0) {
                                result += m;
                        }

                        m *= 2;
                }
                
                System.out.println(result);
        }

}
