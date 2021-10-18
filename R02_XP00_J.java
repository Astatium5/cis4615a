/*
 * Compilation: javac R02_XP00_J.java Execution: java R02_XP00_J
 * 
 * Rule 02. Expressions (EXP)
 * Example EXP00-J
 * Do not ignore values returned by methods
 * 
 * Noncompliant code example
*/

import java.io.File;

public class R02_XP00_J {
  public static void main(String[] args) {
    deleteFile("someFileName.txt");
  }

  public static void deleteFile(String fileName) {
    File someFile = new File(fileName);
    // Do something with someFile
    someFile.delete();
  }
}
