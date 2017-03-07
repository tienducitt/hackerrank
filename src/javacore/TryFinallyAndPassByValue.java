/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacore;

/**
 *
 * @author ducnt3
 */
public class TryFinallyAndPassByValue {

        public static void main(String[] args) throws Exception {
                String a = "something here";

                Integer c = new Integer(1);
                Integer b = new Integer(1);
                System.out.println(c == b);
        }

        public static void testFinally() {
                try {
                        StringBuilder b = setOne();
                        System.out.println(b.toString());
                } catch (Exception e) {
                        System.out.println("Error");
                }
        }

        protected static StringBuilder setOne() {
                StringBuilder builder = new StringBuilder();
                try {
                        builder.append("Cool");
                        return builder.append("Return");
                } finally {
                        builder.append("+1");
                        builder = null;
                }
        }

}
