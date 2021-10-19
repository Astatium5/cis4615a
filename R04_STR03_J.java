/*
 * Compilation: javac R04_STR03_J.java Execution: java R04_STR03_J
 * 
 * Rule 04. Characters and Strings (STR)
 * Example STR03-J
 * Do not encode noncharacter data as a string
 * 
 * Compliant code example
*/

import java.math.BigInteger;

public class R04_STR03_J {
  public static void main(String[] args) {
    BigInteger x = new BigInteger("530500452766");
    String s = x.toString(); // Valid character data
    byte[] byteArray = s.getBytes();
    String ns = new String(byteArray);
    x = new BigInteger(ns);

    System.out.println(x);
  }
}
