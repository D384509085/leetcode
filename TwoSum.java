package com;

/**
 * Created by enbodu on 7/4/17.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int desk[] = new int[target+1+100000];
        for (int num:nums) {
                desk[num+50000] = 1;
        }
        for (int num:nums) {
                if (desk[target - num+50000] == 1) {
                    return new int[]{find(nums,num,target), find(nums,target - num,target) };
                }
        }
        return null;
    }
    int find(int[] nums, int num, int target){
        for(int i=0; i<target; i++){
            if(nums[i]==num){
                return i;
            }
        }
        return 0;
    }
}
