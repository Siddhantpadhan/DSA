package DSA;
import java.util.*;
public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Step 1: Sort the array
        Arrays.sort(nums);
        
        // Step 2: Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for the 'i' pointer
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int left = i + 1;
            int right = nums.length - 1;
            
            // Step 3: Use two-pointer technique
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicates for 'left' and 'right' pointers
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    
                    // Move both pointers after finding a valid triplet
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++; // We need a larger sum, move the 'left' pointer to the right
                } else {
                    right--; // We need a smaller sum, move the 'right' pointer to the left
                }
            }
        }
        
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
