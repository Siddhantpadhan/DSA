package DSA;
import java.util.*;
public class PainSumInSortedRotated {
	static boolean pairInSortedRotated(int[] arr, int target){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {

            // Calculate the complement that added to
            // arr[i], equals the target
            int complement = target - arr[i];

            // Check if the complement exists in the set
            if (set.contains(complement)) {
                return true;
            }

            // Add the current element to the set
            set.add(arr[i]);
        }
        
        // If no pair is found
        return false;}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {11, 15, 6, 8, 9, 10};
	        int target = 16;

	        if (pairInSortedRotated(arr, target))
	            System.out.println("true");
	        else
	            System.out.println("false");

	}

}
