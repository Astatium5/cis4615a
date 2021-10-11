// Rule 07. Exceptional Behavior (ERR)
// Example ERR07-J
// Do not throw RuntimeException, Exception, or Throwable

// Noncompliant Code Example
boolean isCapitalized(String s) {
  if (s == null) {
    throw new RuntimeException("Null String");
  }
  if (s.equals("")) {
    return true;
  }
  String first = s.substring(0, 1);
  String rest = s.substring(1);
  return (first.equals(first.toUpperCase()) &&
          rest.equals(rest.toLowerCase()));
}

// Compliant Solution
boolean isCapitalized(String s) {
  if (s == null) {
    throw new NullPointerException();
  }
  if (s.equals("")) {
    return true;
  }
  String first = s.substring(0, 1);
  String rest = s.substring(1);
  return (first.equals(first.toUpperCase()) &&
          rest.equals(rest.toLowerCase()));
}
