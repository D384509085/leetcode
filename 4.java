public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sum = nums1.length + nums2.length;
        if(sum % 2 == 0) {
            return (find(nums1, nums2, sum/2)+find(nums1, nums2, sum/2+1))/2;
        }
        else {
            return find(nums1, nums2, (sum+1)/2);
        }
    }

    double find(int[] nums1, int[] nums2, int k) {
        int[] count = new int[3];
        count[1] = 0;
        count[2] = 0;
        int flag = 0;
        while(count[1] + count[2]<k) {
            if(count[1] == nums1.length) {
                count[2]++;
                flag = 2;
            }
            else if(count[2] == nums2.length) {
                count[1]++;
                flag = 1;
            }
            else if(nums1[count[1]]<nums2[count[2]]) {
                count[1]++;
                flag = 1;
            }
            else if(nums1[count[1]]>=nums2[count[2]]){
                count[2]++;
                flag = 2;
            }
            
        }
        if(flag == 1) {
            return (double)nums1[count[1]-1];
        }
        else if(flag == 2) {
            return (double)nums2[count[2]-1];
        }
        return (double) 0;
    }
}
