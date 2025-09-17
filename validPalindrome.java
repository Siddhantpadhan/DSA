class Solution {
    public boolean isPalindrome(String s) {
        // Two-pointer approach
        int left = 0, right = s.length() - 1;

        while (left < right) {
            // Move left pointer if not alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Move right pointer if not alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare characters (case-insensitive)
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(sol.isPalindrome("race a car"));                     // false
        System.out.println(sol.isPalindrome(" "));                              // true
    }
}

