import java.lang.reflect.Array;
import java.util.*;
/* 
! First Solution
class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> output = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i]+nums[j] == target){
                    output.add(i);
                    output.add(j);
                }
            }
        }
        int[] primitive = output.stream().mapToInt(Integer::intValue).toArray();
        return primitive;
    }
}
*/

/* 
! Second Solution Didn't work java can't infer the type of the array when convertint to hashset

class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> output = new ArrayList<>();
        List<Integer> numList = new ArrayList<>(Arrays.asList(nums));
        Set<Integer> set = new HashSet<>(numList);
        for(int i = 0; i < nums.length; i++){
            int goal = 9 - nums[i];
            if(set.contains(goal)){
                output.add(i);
            }
            set.add(nums[i]);
        }
        return output.stream().mapToInt(Integer::intValue).toArray();
    }
}
    */
