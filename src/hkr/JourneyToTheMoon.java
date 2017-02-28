/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hkr;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * https://www.hackerrank.com/domains/algorithms/graph-theory
 *
 * @author ducnt3
 */
public class JourneyToTheMoon {

        public static void main(String[] args) throws FileNotFoundException {
                List<List<Integer>> map = new ArrayList<>();
                Scanner scanner = new Scanner(System.in);
                int N = scanner.nextInt();
                int P = scanner.nextInt();
                for (int i = 0; i < N; i++) {
                        map.add(new ArrayList<>());
                }

                int A, B;
                for (int i = 0; i < P; i++) {
                        A = scanner.nextInt();
                        B = scanner.nextInt();

                        map.get(A).add(B);
                        map.get(B).add(A);
                }

                Map<Integer, Boolean> vis = new HashMap<>();
                List<Integer> r = new ArrayList<>();
                long result = 0, s = 0;
                for (int i = 0; i < N; i++) {
                        if (vis.get(i) == null) {
                                Stack<Integer> st = new Stack<>();
                                int count = 0;
                                st.push(i);
                                while (!st.isEmpty()) {
                                        int node = st.pop();
                                        if (vis.get(node) == null) {
                                                count++;
                                        }

                                        vis.put(node, Boolean.TRUE);
                                        for (int edge : map.get(node)) {
                                                if (vis.get(edge) == null) {
                                                        st.push(edge);
                                                }
                                        }
                                }
                                r.add(count);
                                result = result + s * count;
                                s += count;
                        }
                }

                System.out.println(result);
        }
}
