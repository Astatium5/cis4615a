/*
 * Compilation: javac R14_SER00_J.java Execution: java R14_SER00_J
 * 
 * Rule 14. Serialization (SER)
 * Example SER00-J
 * Enable serialization compatibility during class evolution
 * 
 * Compliant code example
*/

import java.io.Serializable;

public class R14_SER00_J {
  public static void main(String[] args) {
    Serializable gw = new GameWeapon();

    System.out.println(gw.toString());
  }
}

class GameWeapon implements Serializable {
  private static final long serialVersionUID = 24L;

  int numOfWeapons = 10;

  public String toString() {
    return String.valueOf(numOfWeapons);
  }
}
