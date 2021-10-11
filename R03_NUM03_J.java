// Rule 03. Numeric Types and Operations (NUM)
// Example NUM03-J
// Use integer types that can fully represent the possible range of unsigned data

// Noncompliant Code Example
public static int getInteger(DataInputStream is) throws IOException {
  return is.readInt(); 
}

// Compliant Solution
public static long getInteger(DataInputStream is) throws IOException {
  return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
}
