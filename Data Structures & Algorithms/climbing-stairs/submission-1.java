class Solution {
    public int climbStairs(int n) {
        Integer one = 1;
        Integer two = 1;

        for(int i=0;i<n-1;i++) {
            Integer temp = one;
            one = one + two;
            two = temp ;
            
        }
        return one;
    }
}
