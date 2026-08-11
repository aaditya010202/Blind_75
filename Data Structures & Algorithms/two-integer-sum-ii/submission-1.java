class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Set<Integer> s = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        Integer size = numbers.length;
        Integer sum = 0;
        for(int i=0;i<size;i++) {
            sum += numbers[i];
            s.add(numbers[i]);
        }

        for(int i=0;i<size;i++) {
            if(s.contains(target-numbers[i])) {
                for(int j=i+1;j<size;j++) {
                    if(numbers[j]==target-numbers[i]) return new int[]{i+1, j+1};
                }
            }
        }

        return new int[0];
    }
}
