// Rule 05. Object Orientation (OBJ)
// Example OBJ05-J
// Do not return references to private mutable class members

// Noncompliant Code Example
class MutableClass {
  private Date d;
 
  public MutableClass() {
    d = new Date();
  }
 
  public Date getDate() {
    return d;
  }
}

// Compliant Solution (clone())
public Date getDate() {
  return (Date)d.clone();
}
