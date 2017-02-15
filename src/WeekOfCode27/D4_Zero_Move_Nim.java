/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeekOfCode27;

/**
 *
 * @author ducnt3
 */
public class D4_Zero_Move_Nim {

        public static void main(String[] args) {
//                long[] piles = {1, 1, 8};
//
//                boolean isFirstWin = isFirstWinZeroNimGame(piles);
//                System.out.println(isFirstWin ? "W" : "L");

                outerloop:
                for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                                if (i * j > 6) {
                                        System.out.println("Breaking");
                                        break outerloop;
                                }
                                System.out.println(i + " " + j);
                        }
                }
                System.out.println("Done");
        }

        public static boolean isFirstWinZeroNimGame(long[] piles) {
                long sumNim = calNimSum(piles);

                if (sumNim == 0) {
                        if (piles.length % 2 == 1) {
                                return true;
                        } else {
                                return false;
                        }
                }

                if (piles.length % 2 == 0) {
                        return true;
                }

                for (int i = 0; i < piles.length; i++) {
                        long sumNimI = calNimSumExceptI(piles, i);
                        if (sumNimI == 0) {
                                return true;
                        }
                }

                return false;
        }

        public static long calNimSumExceptI(long[] piles, int index) {
                long ret = 0;
                for (int i = 0; i < piles.length; i++) {
                        if (i != index) {
                                ret = ret ^ piles[i];
                        }
                }

                return ret;
        }

        public static long calNimSum(long[] piles) {
                if (piles.length > 1) {
                        long ret = piles[0] ^ piles[1];
                        for (int i = 2; i < piles.length; i++) {
                                ret = ret ^ piles[i];
                        }

                        return ret;
                }

                return 0;
        }
}
