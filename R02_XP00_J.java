/*
 * Compilation: javac R02_XP00_J.java Execution: java R02_XP00_J
 * 
 * Rule 02. Expressions (EXP)
 * Example EXP00-J
 * Do not ignore values returned by methods
 * 
 * Compliant code example
*/

import java.io.File;
import java.io.IOException;

public class R02_XP00_J {
  public static void main(String[] args) {
    try {
      deleteFile("someFileName.txt");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void deleteFile(String fileName) throws IOException {
    File someFile = new File(fileName);

    if (!someFile.delete()) {
      throw new IOException("File deletion failure");
    }
  }
}
