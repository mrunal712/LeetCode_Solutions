//34. Find First and Last Position of Element in Sorted Array

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int firstPosition=-1;
        int index=-1;
        int lastPosition=-1;

        int n=nums.length;
        int[] res=new int[2];

        for(int i=0;i<n;i++)
        {
               if(nums[i]==target)
               {
                if(index==-1)
                {
                    index=1;
                    firstPosition=i;
                    lastPosition=i;
                }

                else{
                    lastPosition=i;
                }
               }
        }
        res[0]=firstPosition;
        res[1]=lastPosition;
        

        return res;
    }
}
