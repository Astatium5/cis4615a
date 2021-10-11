// Rule 13. Input Output (FIO)
// Example FIO04-J
// Release resources when they are no longer needed

// Noncompliant Code Example (File Handle)
public int processFile(String fileName)
                       throws IOException, FileNotFoundException {
  FileInputStream stream = new FileInputStream(fileName);
  BufferedReader bufRead =
      new BufferedReader(new InputStreamReader(stream));
  String line;
  while ((line = bufRead.readLine()) != null) {
    sendLine(line);
  }
  return 1;
}

// Compliant Solution
try {
  final FileInputStream stream = new FileInputStream(fileName);
  try {
    final BufferedReader bufRead =
        new BufferedReader(new InputStreamReader(stream));
 
    String line;
    while ((line = bufRead.readLine()) != null) {
      sendLine(line);
    }
  } finally {
    if (stream != null) {
      try {
        stream.close();
      } catch (IOException e) {
        // Forward to handler
      }
    }
  }
} catch (IOException e) {
  // Forward to handler
}