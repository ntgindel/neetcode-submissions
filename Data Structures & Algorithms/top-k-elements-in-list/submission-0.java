class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] buckets = new List[nums.length + 1];
        for(int num : nums){
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for(int n : count.keySet()){
            int freq = count.get(n);
            if(buckets[freq] == null){
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(n);
        }

        int[] res = new int[k];
        int added = 0;

        for(int i = buckets.length - 1; i > 0 && added < k; i--){
            if (buckets[i] == null) continue;
            for (int num : buckets[i]) {
                res[added++] = num;
                if (added == k) break;
            }
        }
        return res; 
    }
}
