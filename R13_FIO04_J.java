/*
 * Compilation: javac R13_FIO04_J.java Execution: java R13_FIO04_J
 * 
 * Rule 13. Input Output (FIO)
 * Example FIO04-J
 * Release resources when they are no longer needed
 * 
 * Noncompliant code example
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class R13_FIO04_J {
  public static void main(String[] args) {
    try {
      processFile("file.txt");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static int processFile(String fileName) throws IOException, FileNotFoundException {
    File myFile = new File(fileName);
    myFile.createNewFile();
    FileInputStream stream = new FileInputStream(fileName);
    BufferedReader bufRead = new BufferedReader(new InputStreamReader(stream));
    String line;
    while ((line = bufRead.readLine()) != null) {
      continue;
    }
    return 1;
  }
}
