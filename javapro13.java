Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.

You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

 

Example 1:

Input: nums = [1,2,1,3,2,5]
Output: [3,5]
Explanation:  [5, 3] is also a valid answer.
Example 2:

Input: nums = [-1,0]
Output: [-1,0]
Example 3:

Input: nums = [0,1]
Output: [1,0]


SOLUTION:
class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int arr[]=new int[2];
        int i=0;
        int index=0;
        while(i<nums.length){
            if(i==nums.length-1 || nums[i]!=nums[i+1]){
                arr[index]=nums[i];
                index++;
                i++;
            }else{
                i+=2;
            }
        }    
          return arr; 
    }
}
