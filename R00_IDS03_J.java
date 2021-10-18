/*
 * Compilation: javac R00_IDS03_J.java Execution: java R00_IDS03_J
 * 
 * Rule 00. Input Validation and Data Sanitization (IDS)
 * Example IDS03-J
 * Do not log unsanitized user input
 * 
 * Noncompliant code example
*/

import java.util.logging.Logger;

public class R00_IDS03_J {
  public void main(String[] args) {
    final Logger logger = Logger.getLogger("IDS03");
    String username = "user123";
    boolean loginSuccessful = false;

    if (loginSuccessful) {
      logger.severe("User login succeeded for: " + username);
    } else {
      logger.severe("User login failed for: " + username);
    }

    loginSuccessful = true;

    if (loginSuccessful) {
      logger.severe("User login succeeded for: " + username);
    } else {
      logger.severe("User login failed for: " + username);
    }
  }
}