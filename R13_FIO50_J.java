// Rule 13. Input Output (FIO)
// FIO50-J. Do not make assumptions about file creation

public void createFile(String filename)
        throws FileNotFoundException{
    try (OutputStream out = new BufferedOutputStream(
                            Files.newOutputStream(Paths.get(filename),
                                        Standard OpenOption.CREATE_NEW))) {
        // Work with out
    }   catch (IOException x) {
            // File not writable...handle error
    }
}
