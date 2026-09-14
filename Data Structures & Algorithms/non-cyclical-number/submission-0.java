class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        
        while(n!=1) {
            Integer temp = n;
            Integer t = 0;
            while(temp>0){
                t+=(int)Math.pow(temp%10, 2);
                temp = temp/10;
            }
            n=t;
            if(set.contains(n)) return false;
            set.add(t);
        }

        return true;
    }
}
