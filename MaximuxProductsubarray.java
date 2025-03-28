package DSA;

public class MaximuxProductsubarray {
	public int maxProduct(int[] nums) {
        int pre=1,suf=1;
		int ans= Integer.MIN_VALUE;
		int n= nums.length;
		for(int i=0; i< n; i++) {
			if(pre==0)pre=1;
			if (suf==0)suf=1;
			
			pre = pre*nums[i];
			suf= suf * nums[n-i-1];
			ans= Math.max(ans, Math.max(pre,suf));
		}
		return ans;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
