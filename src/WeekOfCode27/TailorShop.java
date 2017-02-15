/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeekOfCode27;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ducnt3
 */
public class TailorShop {
        
        public static Map<Integer, Boolean> map = new HashMap<>();
        static boolean[] mark = new boolean[100000];
        
        public static void main(String[] args) {
                int n = 2;
                int p = 3;
                int[] a =  new int[]{4,5};
                
                
                int ret = 0;
                for(int ai : a) {
                        int minButton = (ai / p) + (ai % p != 0 ? 1 : 0);
                        ret += getDistinceCluster(minButton);
                }
                        
                System.out.println(ret);
        }
        
        public static int getDistinceCluster(int min) {
//                while(map.get(min) != null) {
//                        min++;
//                }
//                map.put(min, Boolean.TRUE);
                while(mark[min] == true) {
                        min++;
                }
                mark[min] = true;
                return min;
        }
}
