class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length<1) return 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: stones) {
            maxHeap.offer(i);
        }

        while(maxHeap.size()!=1) {
            Integer big = maxHeap.poll();
            Integer small = maxHeap.poll();
            
            if(small == big && maxHeap.size() == 2) {
                maxHeap.offer(0);
            } else {
                Integer left = Math.abs(small-big);
                maxHeap.offer(left);
            }
        }
        return maxHeap.peek();
    }
}
