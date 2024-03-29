/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeekOfCode29;

import java.util.Scanner;

/**
 *
 * @author ducnt3
 */
public class Day1_Day_of_the_Programmer {
        
        //1. First
        // 2. Second
        // 2.6 Changed code
        // 3. Third

        public static boolean isLeapYearAfter1917(int year) {
                return 
                (year % 400 == 0 
                || (year % 4 
                == 0 && year % 100 != 0));
        }

        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int y = in.nextInt();
                if(y == 1918) {
                        System.out.println("31.08.1918");
                        return;
                }
                boolean isLeapYear = false;
                if (y <= 1917) {
                        isLeapYear = isLeapYearBefore1917(y);
                } else {
                        isLeapYear = isLeapYearAfter1917(y);
                }
                String output = (isLeapYear ? "12.09.": "13.09.") + y;
                System.out.println(output);
        }

        public static boolean isLeapYearBefore1917(int year) {
                return year % 4 == 0;
        }


}
