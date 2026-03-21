class Solution {
    public String reorderSpaces(String text) {
        int totalSpaces = 0;
    for (char c : text.toCharArray()) {
        if (c == ' ') totalSpaces++;
    }
    String[] words = text.trim().split("\\s+");
    int numWords = words.length;
    StringBuilder sb = new StringBuilder();

    if (numWords == 1) {
        sb.append(words[0]);
        for (int i = 0; i < totalSpaces; i++) sb.append(' ');
        return sb.toString();
    }
    int gap = totalSpaces / (numWords - 1);
    int remainder = totalSpaces % (numWords - 1);

    for (int i = 0; i < numWords; i++) {
        sb.append(words[i]);
        // Add gap spaces between words (but not after the last word)
        if (i < numWords - 1) {
            for (int j = 0; j < gap; j++) sb.append(' ');
        }
    }
    for (int i = 0; i < remainder; i++) {
        sb.append(' ');
    }

    return sb.toString();
    }
}