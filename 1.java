public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[]k = new int[2];
        for(int i=0;i<nums.length;i++)
        {
	        for(int j=i+1;j<=nums.length-1;j++)
	            {
		        if(nums[i]+nums[j]==target)
		                {
			          for(int y=0;y<k.length;y++)
			         {
				     k[0]=i;
				     k[1]=j;
			          }
		              }
	                    }
                          }
                        return k;
                                }
                               }
