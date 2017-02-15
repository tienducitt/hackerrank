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
public class Hackonacci_Matrix_Rotations {

        public static boolean[] IS_EVENT = {false, true, false, true, true, false, false};

        public static boolean isEven(long n) {
                n = (n - 1) % 7;

                return IS_EVENT[(int) n];
        }

        public static void main(String[] args) {
                int n = 4;
                int q = 3;
                int[] angle = new int[]{90, 180, 270};

                // build array of H
                int nn = n * n + 1;

                // build matrix n x n of H
                boolean[][] H = new boolean[n][n];
                for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                                long m = (i + 1) * (j + 1);
                                m = m * m;
                                H[i][j] = isEven(m);
                        }
                }

                // torate matrix
                boolean[][] rotate90 = rotateMatrix(H, n);
                boolean[][] rotate180 = rotateMatrix(rotate90, n);
                boolean[][] rotate270 = rotateMatrix(rotate180, n);

                // check diferent
                int[] result = new int[4];
                result[0] = 0;
                result[1] = checkDif(H, rotate90, n);
                result[2] = checkDif(H, rotate180, n);
                result[3] = checkDif(H, rotate270, n);
                
                // print results
                for (int a : angle) {
                        a = a / 90;
                        a = a % 4;
                        System.out.println(result[a]);
                }

        }

        static int checkDif(boolean[][] a, boolean[][] b, int n) {
                int ret = 0;
                for (int i = 0; i < n; ++i) {
                        for (int j = 0; j < n; ++j) {
                                if ((a[i][j] ^ b[i][j])) {
                                        ret++;
                                }
                        }
                }

                return ret;
        }

        static boolean[][] rotateMatrix(boolean[][] matrix, int n) {
                boolean[][] ret = new boolean[n][n];

                for (int i = 0; i < n; ++i) {
                        for (int j = 0; j < n; ++j) {
                                ret[i][j] = matrix[n - j - 1][i];
                        }
                }

                return ret;
        }

}
