package hw9_Tasks;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,5,4,11}, 6)));
        System.out.println(Arrays.toString(twoSum1(new int[]{2,5,4,11}, 6)));
    }

    // 2 ms    On
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

    //On
    public static int[] twoSum2(int[] nums, int target) {
        Arrays.sort(nums);
        // 2 8 10 15 17 19 23 25     -> 29
        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            int sum = nums[left] + nums[right];
            if (sum > target)
                left++;
            else if (sum < target)
                right--;
            else return new int[]{left, right};

        }
        return new int[]{};
    }

    // 34 ms     On^2
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