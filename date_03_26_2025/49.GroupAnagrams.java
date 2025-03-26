//49. Group Anagrams

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String s : strs) {
            char[] sortedChars = s.toCharArray();
            Arrays.sort(sortedChars);
            String sortedString = new String(sortedChars);

            if (!anagrams.containsKey(sortedString)) {
                anagrams.put(sortedString, new ArrayList<>());
            }

            anagrams.get(sortedString).add(s);
        }

        return new ArrayList<>(anagrams.values());
    }
}
