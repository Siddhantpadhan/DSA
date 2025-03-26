package DSA;
import java.util.*;
public class KthLargestElement {
	public int findKthLargest(int[] nums, int k) {
        // Min-Heap to store the top k largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        
        for (int num : nums) {
            minHeap.add(num);
            
            // If the heap size exceeds k, remove the smallest element
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        
        // The root of the heap is the kth largest element
        return minHeap.peek();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
