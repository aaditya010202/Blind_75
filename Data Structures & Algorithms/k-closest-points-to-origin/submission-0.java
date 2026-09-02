class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<Map<Integer, int[]>> minHeap = new PriorityQueue<>((m1, m2) -> {
            Integer key1 = m1.keySet().iterator().next();
            Integer key2 = m2.keySet().iterator().next();
            return Integer.compare(key2, key1);
        });

        for(int[] coord: points) {
            Integer distance = (int) Math.pow(coord[0], 2) + (int) Math.pow(coord[1], 2);
            Map<Integer, int[]> map = new HashMap<>();
            map.put(distance, coord);
            minHeap.offer(map);
            if(minHeap.size()>k) minHeap.poll();
        }
        int[][] result = new int[k][2];
        for(int i =0;i<k;i++) {
            result[i] = minHeap.poll().values().iterator().next();
        }
        return result;
    }
}
