class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        Queue<int[]> temp = new ArrayDeque<>();
        Map<Character, Integer> map = new HashMap<>();
        Integer time = 0;
        for(char c: tasks) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(Integer val: map.values() ) {
            maxHeap.offer(val);
        }

        while(!maxHeap.isEmpty() || !temp.isEmpty()) {
            time += 1;
            if(maxHeap.isEmpty()) {
                time=temp.peek()[1];
            } 
            else{                
                Integer v = maxHeap.poll();
                v -= 1;
                if(v>0) {
                    temp.offer(new int[]{v, time + n});
                    // maxHeap.offer(v);
                }
            }
            if(!temp.isEmpty() && temp.peek()[1]==time) {
                maxHeap.offer(temp.poll()[0]);
            }
        }

        return time;
    }
}
