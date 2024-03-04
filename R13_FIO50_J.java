// Rule 13. Input Output (FIO)
// FIO50-J. Do not make assumptions about file creation

public void createFile(String filename)
    throws FileNotFoundException{
  OutputStream out = new FileOutputStream(filename);
  // Work with file
}
