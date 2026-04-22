class Solution {
    public int hammingWeight(int n) {
        int total = 0;
        String binary = Integer.toBinaryString(n);
        int i =0;
        while(i!=binary.length()) {
            char a = binary.charAt(i);
            if(a=='1') total++;
            i++;
        }
        return total;
    }
}
