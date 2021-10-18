/*
 * Compilation: javac R07_ERR07_J.java Execution: java R07_ERR07_J
 * 
 * Rule 07. Exceptional Behavior (ERR)
 * Example ERR07-J
 * Do not throw RuntimeException, Exception, or Throwable
 * 
 * Noncompliant code example
*/

public class R07_ERR07_J {
  public static void main(String[] args) {
    isCapitalized(null);
  }

  static boolean isCapitalized(String s) {
    if (s == null) {
      throw new RuntimeException("Null String");
    }
    if (s.equals("")) {
      return true;
    }
    String first = s.substring(0, 1);
    String rest = s.substring(1);
    return (first.equals(first.toUpperCase()) && rest.equals(rest.toLowerCase()));
  }
}
