class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count the frequency of each number.
        // O(N) time complexity, where N is the number of elements in nums.
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a min-heap (PriorityQueue).
        // The heap will store Map.Entry objects.
        // We use a lambda expression to tell the heap to order entries by their frequency (the value).
        // (a, b) -> a.getValue() - b.getValue() creates a min-heap based on frequency.
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = 
            new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        // Step 3: Iterate through the map and maintain the top k elements in the heap.
        // O(N log k) time complexity, as we iterate through N unique elements
        // and each heap operation (add/poll) takes O(log k) time.
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            minHeap.add(entry);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the element with the smallest frequency
            }
        }

        // Step 4: Extract the results from the heap.
        // O(k log k) time complexity.
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            // poll() removes and returns the head of the queue (the element with the lowest frequency)
            // Since we want the result in any order, we can just fill the array.
            result[i] = minHeap.poll().getKey();
        }
        
        return result;
    }
}
