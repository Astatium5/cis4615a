/*
 * Compilation: javac R49_MSC01_J.java Execution: java R49_MSC01_J
 * 
 * Rule 49. Miscellaneous (MSC)
 * Example MSC01-J
 * Do not use an empty infinite loop
 * 
 * Noncompliant code example
*/

// Rule 49. Miscellaneous (MSC)
// Example MSC01-J
// Do not use an empty infinite loop

public class R49_MSC01_J {
  public static void main(String[] args) {
    nop();
  }

  public static int nop() {
    while (true) {
    }
  }
}
