package DSA;
import java.util.*;
public class SearchinRotatedAndSorted {
	private static int findMinDiff(int[] arr, int m) {
        int n = arr.length;
        if (m == 0 || n == 0) return 0;

        Arrays.sort(arr);

        if (n < m) return -1;

        int min = Integer.MAX_VALUE;

        for (int i = 0; i + m - 1 < n; i++) {
            int diff = arr[i + m - 1] - arr[i];
            if (diff < min) min = diff;
        }
        return min;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        int noOfStudents = 5;
        System.out.println(findMinDiff(arr, noOfStudents));

	}

}
