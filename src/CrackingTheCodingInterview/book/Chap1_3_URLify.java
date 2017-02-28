package CrackingTheCodingInterview.book;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at
 * the end to hold the additional characters, and that you are given the "true" length of the string.
 *
 * @author ducnt3
 */
public class Chap1_3_URLify {

        public static void main(String[] args) {
                String inputStr = "Mr John Smith    ";
                int n = 13;
                char[] input = inputStr.toCharArray();

                int beforeIndex = n - 1;
                int moveIndex = inputStr.length() - 1;

                while (beforeIndex >= 0) {
                        if(input[beforeIndex] != ' ') {
                                input[moveIndex--] = input[beforeIndex];
                        } else {
                                input[moveIndex--] = '0';
                                input[moveIndex--] = '2';
                                input[moveIndex--] = '%';
                        }
                        
                        beforeIndex--;
                }
                
                String output = new String(input);
                System.out.println(output);
        }

}
