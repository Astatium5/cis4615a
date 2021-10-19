/*
 * Compilation: javac R06_MET01_J.java Execution: java R06_MET01_J
 * 
 * Rule 06. Methods (MET)
 * Example MET01-J
 * Never use assertions to validate method arguments
 * 
 * Compliant code example
*/

public class R06_MET01_J {
  public static void main(String[] args) {
    System.out.println(getAbsAdd(Integer.MIN_VALUE, Integer.MIN_VALUE));
  }

  public static int getAbsAdd(int x, int y) {
    if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
      throw new IllegalArgumentException();
    }
    int absX = Math.abs(x);
    int absY = Math.abs(y);
    if (absX > Integer.MAX_VALUE - absY) {
      throw new IllegalArgumentException();
    }
    return absX + absY;
  }
}
