/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrackingTheCodingInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ducnt3
 */
/*
 Problem statement: https://www.hackerrank.com/challenges/ctci-ransom-note
 */
public class Hash_Tables_Ransom_Note {

        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int m = in.nextInt();
                int n = in.nextInt();
                Map<String, Integer> map = new HashMap<>();
                String magazine[] = new String[m];
                for (int magazine_i = 0; magazine_i < m; magazine_i++) {
                        magazine[magazine_i] = in.next();
                }
                String ransom[] = new String[n];
                for (int ransom_i = 0; ransom_i < n; ransom_i++) {
                        ransom[ransom_i] = in.next();
                }

                Integer count = null;
                for (String t : magazine) {
                        count = map.get(t);
                        if (count == null) {
                                count = 0;
                        }
                        count++;
                        map.put(t, count);
                }

                for (String word : ransom) {
                        count = map.get(word);
                        if (count == null || count == 0) {
                                System.out.println("No");
                                return;
                        }
                        count--;
                        map.put(word, count);
                }
                System.out.println("Yes");
        }
}
