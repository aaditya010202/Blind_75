class Solution {
    public boolean isAlphaNum(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c<= '9');
    }
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length()-1;
        while(i<=j) {
            if(!isAlphaNum(s.charAt(i))) {
                i++;
            } else if (!isAlphaNum(s.charAt(j))) {
                j--;
            } else if (s.charAt(i) != s.charAt(j)) {
                System.out.println(s.charAt(i) + ":" + s.charAt(j));
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
