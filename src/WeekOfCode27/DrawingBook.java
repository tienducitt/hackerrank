package WeekOfCode27;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ducnt3
 */
public class DrawingBook {

        public static void main(String[] args) {
                int n = 5, p = 4;

                int totalPage = (n - 1) / 2 + ((n - 2) % 2 == 0 ? 1 : 0);
                int targetPage = (p - 1) / 2 + ((p - 2) % 2 == 0 ? 1 : 0);

                int fromFront = targetPage;
                int fromBack = totalPage - targetPage;  
                
                if(fromFront < fromBack) {
                        System.out.println(fromFront);
                } else {
                        System.out.println(fromBack);
                }
        }
}
