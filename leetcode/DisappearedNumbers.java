package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisappearedNumbers {
	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(nums));
	}
	public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> returner = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i=0; i<Math.max(nums.length, nums[nums.length-1]); i++){
            if(nums[i]==i+1){
                continue;
            }
            else{
                returner.add(i+1);
            }
        }
        
        return returner;
    }
}
