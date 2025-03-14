class LeePali {
    public boolean isPalindrome(int x) {
        // If x is negative or ends with zero (but is not zero), it's not a palindrome
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        int s = 0;
        int temp = x;
        
        // Reverse the second half of the number and compare
        while (x > s) {
            s = s * 10 + x % 10;
            x = x / 10;
        }
        
        // If the number is a palindrome, the reversed half will be equal to the remaining half (or equal if the length is odd)
        return x == s || x == s / 10;
    }

    public static void main(String args[]) {
    	LeePali s = new LeePali();
        int num = 121;
        boolean b = s.isPalindrome(num);
        System.out.println(b);
    }
}
