package leetcode;

public class IndexNumberFinder {
	public static void main(String[] args) {
		int index = -1;
		int[] nums = {1,3,5,6,7};
		int target = 6;
	   for(int i=0; i<nums.length;i++){
	          if(target == nums[i]){
	              index = i;
	          }
	      }
	        if(index == -1){
	            for(int i=0; i<nums.length; i++){
	                if(i!=nums.length -1 && (target >nums[i] && target <nums[i+1])){
	                    index = i+1;
	                    break;
	                }
	                else if(target <nums[i]){
	                    index =0;
	                    break;
	                }
	                else if (target > nums[nums.length -1]){
	                    index = nums.length;
	                    break;
	                }
	            }
	        }
	        System.out.println(index);
	      
	}
}
