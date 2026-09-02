class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length<1) return 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: stones) {
            queue.offer(i);
        }

        while(queue.size()!=1) {
            Integer big = queue.poll();
            Integer small = queue.poll();
            
            if(small == big && queue.size() == 2) {
                queue.offer(0);
            } else {
                Integer left = Math.abs(small-big);
                queue.offer(left);
            }
        }

        return queue.peek();

    }
}
