/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeekOfCode29;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ducnt3
 */
public class Day2 {

        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                List<BigInteger> input = new ArrayList<>();
                for (int unsorted_i = 0; unsorted_i < n; unsorted_i++) {
                        input.add(new BigInteger(in.next()));
                }

                Collections.sort(input);

                input.stream().forEach(System.out::println);
        }
}
