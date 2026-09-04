class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        HashMap<Character, Integer> h = new HashMap<>();
        int i = 0, j = 0;
        boolean b = true;

        while (j < s.length()) {

            if (b) {

                if (!h.containsKey(s.charAt(j))) {
                    h.put(s.charAt(j), 1);
                } else {
                    h.put(s.charAt(j), h.get(s.charAt(j)) + 1);
                }

                // Check if current window is invalid
                if (h.size() > 1 &&
                    (j - i + 1) - Collections.max(h.values()) > k) {

                    b = false;
                } else {
                    res = Math.max(j - i + 1, res);
                    j++;
                }
            }

            else {

                h.put(s.charAt(i), h.get(s.charAt(i)) - 1);

                if (h.get(s.charAt(i)) == 0) {
                    h.remove(s.charAt(i));
                }

                i++;

                // Check if window has become valid again
                if (h.size() <= 1 ||
                    (j - i + 1) - Collections.max(h.values()) <= k) {

                    b = true;
                    j++;
                }
            }
        }

        return res;
    }
}