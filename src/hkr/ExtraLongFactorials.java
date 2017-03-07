/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hkr;

        import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ducnt3
 */
public class ExtraLongFactorials {

        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                int n = in.nextInt();
                BigInteger result = new BigInteger("1");
                for (int i = 2; i <= n; i++) {
                        result = result.multiply(new BigInteger(i + ""));
                }
                
                System.out.println(result.toString());
        }
}
