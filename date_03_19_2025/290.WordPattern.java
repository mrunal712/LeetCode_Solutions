//290. Word Pattern

class Solution {
    public boolean wordPattern(String pattern, String s) {
       String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> charToString = new HashMap<>();
        Map<String, Character> stringToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (charToString.containsKey(c)) {
                if (!charToString.get(c).equals(word)) {
                    return false;
                }
            } 
            else if (stringToChar.containsKey(word)) {
                if (stringToChar.get(word) != c) {
                    return false;
                }
            } 
            else {
                charToString.put(c, word);
                stringToChar.put(word, c);
            }
        }
        return true;  
    }
}
