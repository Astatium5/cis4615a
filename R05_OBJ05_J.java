/*
 * Compilation: javac R05_OBJ05_J.java Execution: java R05_OBJ05_J
 * 
 * Rule 05. Object Orientation (OBJ)
 * Example OBJ05-J
 * Do not return references to private mutable class members
 * 
 * Noncompliant code example
*/

import java.util.Date;

class R05_OBJ05_J {
  private Date d;

  public R05_OBJ05_J() {
    d = new Date();
  }

  public Date getDate() {
    return d;
  }
}
