package DSA;

public class TappingRainWater {
	 public static int trappingRainwater(int height[]) { //O(n) time complexity
	        // Calculate left max boundary
	        int leftmax[] = new int[height.length];
	        leftmax[0] = height[0];
	        for (int i = 1; i < height.length; i++) {
	            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
	        }
	        // Calculate right max boundary
	        int rightmax[] = new int[height.length];
	        rightmax[height.length - 1] = height[height.length - 1];
	        for (int i = height.length - 2; i >= 0; i--) {
	            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
	        }
	        // Loop to calculate the total trapped water
	        int trappedwater = 0;
	        for (int i = 0; i < height.length; i++) {
	            // water level = min(left max boundary, right max boundary)
	            int waterlevel = Math.min(leftmax[i], rightmax[i]);
	            // trapped water = water level - height[i]
	            trappedwater += waterlevel - height[i];
	        }
	        return trappedwater ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int height[] = {4, 2, 0, 6, 3, 2, 5};// bar height
        System.out.println(trappingRainwater(height));

	}

}
