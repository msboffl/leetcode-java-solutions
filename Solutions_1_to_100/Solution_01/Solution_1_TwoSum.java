package Solutions_1_to_100.Solution_01;

import java.util.Arrays;

// Brute Force
class Approach1 {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[] {i, j};
                }
            }
        }
        return null;
    }

}
public class Solution_1_TwoSum {
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15}; int target = 9;

        Approach1 approach1 = new Approach1();

        System.out.println(Arrays.toString(approach1.twoSum(nums1, target)));

    }
}
