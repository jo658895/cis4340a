// Rule 01. Declarations and Initialization (DCL)
// ERR50-J. Use exceptions only for exceptional conditions

public String processSingleString(String string) {
    // ...
    return string;
}

public String processStrings(String[] strings) {
    String result = "";
    for (int i = 0; i < strings.length; i++) {
        result = result.concat( processSingleString( strings[i]));
    }
    return result;
}
