/*
 * Compilation: javac R49_MSC01_J.java Execution: java R49_MSC01_J
 * 
 * Rule 49. Miscellaneous (MSC)
 * Example MSC01-J
 * Do not use an empty infinite loop
 * 
 * Compliant code example
*/

// Rule 49. Miscellaneous (MSC)
// Example MSC01-J
// Do not use an empty infinite loop

public class R49_MSC01_J {
  public static final int DURATION = 10000;

  public static void main(String[] args) {
    try {
      nop();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void nop() throws InterruptedException {
    while (true) {
      // Useful operations
      Thread.sleep(DURATION);
    }
  }
}
