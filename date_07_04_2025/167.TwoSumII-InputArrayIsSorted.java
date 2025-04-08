//167. Two Sum II - Input Array Is Sorted

class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int n=numbers.length;

        for(int i=0;i<n;i++)
        {
            int num1=numbers[i];
            int num2=target-num1;

            int low=i+1;
            int high=n-1;

            while(low<=high)
            {
                int mid=(low+high)/2;

                if(numbers[mid]==num2)
                {
                    return new int[]{i+1,mid+1};
                }

                else if(num2<numbers[mid])
                {
                    high=mid-1;
                }

                else
                {
                    low=mid+1;
                }
            }
        }

return new int[]{};
        
    }
}
