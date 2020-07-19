import java.util.Arrays;

/**
 * 遍历nums 枚举每一次结果
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int i1 = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (i1 == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }
}


public class demo1 {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        Arrays.stream(result).forEach(System.out::println);
    }
    
    //111

}
