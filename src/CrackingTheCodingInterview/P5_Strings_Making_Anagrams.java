/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrackingTheCodingInterview;

import java.util.Scanner;

/**
 *
 * @author ducnt3
 */
/*
 Proplem Statement: https://www.hackerrank.com/challenges/ctci-making-anagrams
 P/s: I dont realy understand this problem, I read the discustion and I saw someone say that
 this problem is count the different chacter between two words,
 so, this is my solution
 */
public class P5_Strings_Making_Anagrams {

        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                String a = in.next();
                String b = in.next();
                System.out.println(numberNeeded(a, b));
        }

        public static int numberNeeded(String first, String second) {
                int result = 0;

                int[] charOccur = new int[26];
                for (char c : first.toCharArray()) {
                        charOccur[c - 'a']++;
                }
                for (char c : second.toCharArray()) {
                        charOccur[c - 'a']--;
                }
                for (int oc : charOccur) {
                        result += Math.abs(oc);
                }

                return result;
        }
}
