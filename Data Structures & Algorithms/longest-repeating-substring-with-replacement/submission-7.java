class Solution {
    public int characterReplacement(String s, int k) {

        int res = 0;
        int maxFreq = 0;
        int i = 0;

        HashMap<Character, Integer> count = new HashMap<>();

        for (int j = 0; j < s.length(); j++) {

            // Add s[j] to the HashMap
            char ch = s.charAt(j);

            if (count.containsKey(ch)) {
                count.put(ch, count.get(ch) + 1);
            } else {
                count.put(ch, 1);
            }

            // Update maximum frequency
            maxFreq = Math.max(maxFreq, count.get(ch));

            // If window is invalid, move i forward
            while ((j - i + 1) - maxFreq > k) {

                char left = s.charAt(i);

                count.put(left, count.get(left) - 1);

                // If frequency becomes 0, remove the character
                if (count.get(left) == 0) {
                    count.remove(left);
                }

                i++;
            }

            // Update answer
            res = Math.max(res, j - i + 1);
        }

        return res;
    }
}