/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeekOfCode29;

/**
 *
 * @author ducnt3
 */
public class Day3 {

        static int w = 10, h = 10;
        static int xc = 5, yc = 5, r = 0;
        static int x1 = 2, y1 = 6, x2 = 8, y2 = 4;

        public static void main(String[] args) {

                for (int i = 0; i <= w; i++) {
                        for (int j = 0; j <= h; j++) {
                                check(i, j);
                        }
                        System.out.println("");
                }
        }

        public static void check(int i, int j) {
                if (checkCircle(i, j) || checkRectangle(i, j)) {
                        System.out.print("#");
                } else {
                        System.out.print(".");
                }

        }

        public static boolean checkCircle(int i, int j) {

                double d = getdistance(i, j, xc, yc);
                if (d > r) {
                        return false;
                }

                return true;
        }

        public static boolean checkRectangle(int i, int j) {
                double drec = getdistance(x1, y1, x2, y2);
                double d1 = getdistance(i, j, x1, y1);
                double d2 = getdistance(i, j, x2, y2);

                if ((d1 * d1 + d2 * d2) > (drec * drec)) {
                        return false;
                }

                return true;
        }

        public static double getdistance(int x1, int y1, int x2, int y2) {
                int hx = x1 - x2;
                int hy = y1 - y2;

                double d = Math.sqrt(hx * hx + hy * hy);

                return d;
        }
}
