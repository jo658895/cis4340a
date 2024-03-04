// Rule 01. Declarations and Initialization (DCL)
// ERR50-J. Use exceptions only for exceptional conditions

public String processSingleString(String string) {
    // ...
    return string;
}
public String processStrings(String[] strings) {
    String result = "";
    int i = 0;
    try {
        while (true) {
            result = result.concat(processSingleString(strings[i]));
            i++;
        }
    } catch (ArrayIndexOutOfBoundsException e) {
        // Ignore, we're done
    }
    return result;
}
