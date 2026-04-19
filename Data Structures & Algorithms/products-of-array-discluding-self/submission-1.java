class Solution {
    public int[] productExceptSelf(int[] nums) {
        // BRUTE FORCE O(n2)
        // int[] ans = new int[nums.length];
        // for(int i = 0;i<nums.length;i++) {
        //     Integer product = 1;
        //     for(int j=0;j<nums.length; j++) {
        //         if(i!=j) {
        //             product *= nums[j];
        //         }
        //     }
        //     ans[i] = product;
        // }
        // return ans;

        List<Integer> zeroes = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zeroes.add(i);
        }
        if(zeroes.size()>=2) return new int[nums.length];
        Integer product = 1;
        int[] ans = new int[nums.length];
        if(zeroes.size()==1) {
            Integer index = zeroes.get(0);
            for(int i=0;i<nums.length;i++){
                if(i!=index) product *= nums[i];
            }
            ans[index] = product;
            return ans;
        }


        for(int i:nums) {
            product *= i;
        }
        for(int i=0;i<nums.length;i++) {
            ans[i] = product/nums[i];
        }
        return ans;
    }
}  
