/*
 * Compilation: javac R00_IDS03_J.java Execution: java R00_IDS03_J
 * 
 * Rule 00. Input Validation and Data Sanitization (IDS)
 * Example IDS03-J
 * Do not log unsanitized user input
 * 
 * Compliant code example
*/

import java.util.logging.Logger;
import java.util.regex.Pattern;

public class R00_IDS03_J {
  public void main(String[] args) {
    final Logger logger = Logger.getLogger("IDS03");
    String username = "user123";
    boolean loginSuccessful = false;

    if (loginSuccessful) {
      logger.severe("User login succeeded for: " + sanitizeUser(username));
    } else {
      logger.severe("User login failed for: " + sanitizeUser(username));
    }

    loginSuccessful = true;

    if (loginSuccessful) {
      logger.severe("User login succeeded for: " + sanitizeUser(username));
    } else {
      logger.severe("User login failed for: " + sanitizeUser(username));
    }
  }

  public String sanitizeUser(String username) {
    return Pattern.matches("[A-Za-z0-9_]+", username) ? username : "unauthorized user";
  }
}
