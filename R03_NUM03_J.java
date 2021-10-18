/*
 * Compilation: javac R03_NUM03_J.java Execution: java R03_NUM03_J
 * 
 * Rule 03. Numeric Types and Operations (NUM)
 * Example NUM03-J
 * Use integer types that can fully represent the possible range of unsigned data
 * 
 * Noncompliant code example
*/

import java.io.DataInputStream;
import java.io.IOException;

public class R03_NUM03_J {
  public static void main(String[] args) {
    DataInputStream is = new DataInputStream(System.in);

    try {
      int i = getInteger(is);
      is.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static int getInteger(DataInputStream is) throws IOException {
    return is.readInt();
  }
}
