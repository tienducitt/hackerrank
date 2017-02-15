/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrackingTheCodingInterview;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author ducnt3 Script: https://www.hackerrank.com/challenges/ctci-balanced-brackets?h_r=next-challenge&h_v=zen
 */
public class P4_Stacks_Balanced_Brackets {

        public static void main(String[] args) {
                Set<Bracket> setBracket = new HashSet<>();
                setBracket.add(new Bracket('{', '}'));
                setBracket.add(new Bracket('(', ')'));
                setBracket.add(new Bracket('[', ']'));

                Scanner in = new Scanner(System.in);
                int t = in.nextInt();
                for (int a0 = 0; a0 < t; a0++) {
                        String expression = in.next();
                        System.out.println((isBalanced(expression, setBracket)) ? "YES" : "NO");
                }
        }

        static boolean isBalanced(String input, Set<Bracket> setBracket) {
                char[] arr = input.toCharArray();

                if (arr.length % 2 == 1) {
                        return false;
                }

                Stack<Character> stack = new Stack<>();
                for (char c : arr) {
                        Character top = stack.isEmpty() ? null : stack.peek();
                        if (top != null && setBracket.contains(new Bracket(top, c))) {
                                stack.pop();
                        } else {
                                stack.push(c);
                        }
                }

                if (stack.isEmpty()) {
                        return true;
                }

                return false;
        }

        static class Bracket {

                char first;
                char second;

                public Bracket(char first, char second) {
                        this.first = first;
                        this.second = second;
                }

                @Override
                public int hashCode() {
                        int hash = 7;
                        hash = 71 * hash + this.first;
                        hash = 81 * hash + this.second;
                        return hash;
                }

                @Override
                public boolean equals(Object obj) {
                        if (obj == null) {
                                return false;
                        }
                        if (getClass() != obj.getClass()) {
                                return false;
                        }
                        final Bracket other = (Bracket) obj;
                        if (this.first != other.first) {
                                return false;
                        }
                        if (this.second != other.second) {
                                return false;
                        }
                        return true;
                }
        }
}
