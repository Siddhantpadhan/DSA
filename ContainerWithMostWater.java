package DSA;

public class ContainerWithMostWater {
	 public int maxArea(int[] height) {
	        int left = 0;
	        int right = height.length - 1;
	        int maxArea = 0;
	        
	        // Two-pointer approach
	        while (left < right) {
	            // Calculate the current area
	            int width = right - left;
	            int currentArea = width * Math.min(height[left], height[right]);
	            
	            // Update the maximum area
	            maxArea = Math.max(maxArea, currentArea);
	            
	            // Move the pointer pointing to the shorter line
	            if (height[left] < height[right]) {
	                left++;
	            } else {
	                right--;
	            }
	        }
	        
	        return maxArea;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
