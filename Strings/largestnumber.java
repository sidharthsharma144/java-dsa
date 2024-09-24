import java.util.*;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        // Convert the integer array to a string array using Integer.toString()
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = Integer.toString(nums[i]);
        }

        // Sort the string array with a custom comparator
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

        // If the largest number is "0", just return "0"
        if (strNums[0].equals("0")) {
            return "0";
        }
        StringBuilder largestNum = new StringBuilder();
        for (String num : strNums) {
            largestNum.append(num);
        }

        return largestNum.toString()
    }

    public static void main(String[] args) {
        LargestNumber ln = new LargestNumber();
        int[] nums1 = {10, 2};
        System.out.println(ln.largestNumber(nums1)); // Output: "210"
        int[] nums2 = {3, 30, 34, 5, 9};
        System.out.println(ln.largestNumber(nums2)); // Output: "9534330"
    }
}
