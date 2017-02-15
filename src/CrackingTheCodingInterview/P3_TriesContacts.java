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
 * @author ducnt3 Script: https://www.hackerrank.com/challenges/ctci-contacts?h_r=next-challenge&h_v=zen
 */
public class P3_TriesContacts {
        
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuilder str = new StringBuilder();
        
        Node root = new Node(null);
        
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            
            switch (op) {
                case "add": {
                    root.addWord(contact);
                    break;
                }
                case "find": {
                    System.out.println(root.findWord(contact));
                    break;
                }
            }
        }
    }
    
    static class Node {
        Character value;
        int num = 1;
        Map<Character, Node> map = new HashMap<>();

        public Node(Character ch) {
            this.value = ch;
        }

        public Node find(Character c) {
            return map.get(c);
        }

        public Node put(Character c) {
            Node ret = new Node(c);
            map.put(c, ret);

            return ret;
        }

        public Node findOrPut(Character c) {
            Node ret = map.get(c);

            if(ret == null) {
                return put(c);
            } else {
                ret.num++;
            }

            return ret;
        }

        public void addWord(String word) {
            if(word == null) {
                return;
            }
            char[] chArr = word.toCharArray();
            Node node = this;
            for(char c : chArr) {
                node = node.findOrPut(c);
            }
        }

        public int findWord(String word) {
            if(word == null) {
                return 0;
            }
            char[] chArr = word.toCharArray();
            Node node = this;
            for(char c : chArr) {
                node = node.find(c);
                if(node == null) {
                    return 0;
                }
            }

            return node.num;
        }
    }
}
