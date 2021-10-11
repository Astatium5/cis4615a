// Rule 14. Serialization (SER)
// Example SER00-J
// Enable serialization compatibility during class evolution

// Noncompliant Code Example
class GameWeapon implements Serializable {
  int numOfWeapons = 10;
         
  public String toString() {
    return String.valueOf(numOfWeapons);
  }
}

// Compliant Solution (serialVersionUID)
class GameWeapon implements Serializable {
  private static final long serialVersionUID = 24L;
 
  int numOfWeapons = 10;
         
  public String toString() {
    return String.valueOf(numOfWeapons);
  }
}
