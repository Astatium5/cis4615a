// Rule 49. Miscellaneous (MSC)
// Example MSC01-J
// Do not use an empty infinite loop

// Noncompliant Code Example
public int nop() {
  while (true) {}
}

// Compliant Solution (Thread.sleep())
public final int DURATION=10000; // In milliseconds

public void nop() throws InterruptedException {
  while (true) {
    // Useful operations
    Thread.sleep(DURATION);
  }
}
