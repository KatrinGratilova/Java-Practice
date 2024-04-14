package hw9_Tasks;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,5,4,11}, 6)));
        System.out.println(Arrays.toString(twoSum1(new int[]{2,5,4,11}, 6)));
    }

    // 2 ms
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexesNums = new HashMap<>();
        int currNum;
        for (int i = 0; i < nums.length; i++) {
            currNum = nums[i];
            if (indexesNums.containsKey(target - currNum))
                return new int[]{i, indexesNums.get(target - currNum)};
            indexesNums.put(currNum, i);
        }
        return new int[]{};
    }

    // 34 ms
    public static int[] twoSum1(int[] nums, int target) {
        int[] twoNums = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    twoNums[0] = i;
                    twoNums[1] = j;
                    break;
                }
            }
        }
        return twoNums;
    }
}