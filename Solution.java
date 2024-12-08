import java.util.Arrays;
import java.util.HashMap;
class Solution {
//    static public int[] twoSum(int[] nums, int target) {
//        int length = nums.length;
//        for(int i = 0 ; i < length - 1 ; i++){
//            for(int j = i + 1 ; j < length ; j++){
//                if(nums[i] + nums[j] == target){
//                    return new int[] {i,j};
//                }
//            }
//        }
//        return new int[] {};
//    }

//    static public int[] twoSum(int[] nums, int target) {
//        HashMap<Integer, Integer> map = new HashMap<>(); // (value, index)
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i]; // Find the number needed to reach the target
//            if (map.containsKey(complement)) { // Check if the complement exists in the map
//                return new int[] { map.get(complement), i }; // Return the pair of indices
//            }
//            map.put(nums[i], i); // Store the current number and its index in the map
//        }
//        return null;
//    }

    public static void main(String[] args) {
        int[] array = {1,5,6,2};
        System.out.println(Arrays.toString(twoSum(array,6)));
    }
}