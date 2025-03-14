public class LongestPaliStr {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return "";

        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindrome
            String odd = expand(s, i, i);
            // Check for even-length palindrome
            String even = expand(s, i, i + 1);
            
            // Update longest palindrome
            if (odd.length() > longest.length()) longest = odd;
            if (even.length() > longest.length()) longest = even;
        }
        return longest;
    }

    private static String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right); // Extract palindrome substring
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad")); // Output: "bab" or "aba"
        //System.out.println(longestPalindrome("cbbd"));  // Output: "bb"
    }
}
