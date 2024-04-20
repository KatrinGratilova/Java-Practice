package hw9_Tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicateStream(new int[]{1,2,3,1}));
        System.out.println(containsDuplicateArray(new int[]{1,2,3,1}));
        System.out.println(containsDuplicateSet(new int[]{1,2,3,1}));
    }

    // 27 ms
    public static boolean containsDuplicateStream(int[] nums) {
        return (nums.length - Arrays.stream(nums).distinct().toArray().length) != 0;
    }

    // 20 ms   O log n
    public static boolean containsDuplicateArray(int[] nums) {
        Arrays.sort(nums);    //
        for (int i = 0; i < nums.length - 1; i++) {     // On
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }

    // 9 ms    On
    public static boolean containsDuplicateSet(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        for (Integer i : nums) {
            if (uniqueNums.contains(i)) return true;
            uniqueNums.add(i);
        }
        return false;
    }
}