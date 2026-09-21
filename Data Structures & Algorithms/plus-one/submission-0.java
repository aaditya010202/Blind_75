class Solution {
    public int[] plusOne(int[] digits) {
        Integer size = digits.length;
        Integer carry = 1;
        
        for(int i = size-1;i>=0;i--) {
            if(carry == 1) {
                if(digits[i] == 9) digits[i] = 0;
                else {
                    digits[i] = digits[i]+carry;
                    carry = 0;
                }       
            }
        }
        if(digits[0]==0 && carry==1) {
            int[] res = new int[size + 1];
            res[0] = 1;
            System.out.println(res[0]);
            Integer cIndex = 1;
            Integer index = 0;
            while(size!=0) {
                res[cIndex] = digits[index];
                System.out.println(res[cIndex]);
                cIndex++;
                index++;
                size--;
            }
            return res;
        }
        return digits;
    }
}
