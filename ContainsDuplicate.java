package DSA;

public class ContainsDuplicate {
	public static boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,3,1,4,5,6,7,};
		System.out.println(hasDuplicate(nums));
	}

}
