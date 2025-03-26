//15. 3Sum

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List < List < Integer >> ans=new ArrayList<List<Integer>>();
            Arrays.sort(nums);
            int n=nums.length;

            for(int i=0;i<n;i++)
            {
            if(i>0 && nums[i]==nums[i-1]){continue;}

            int j=i+1;
            int k=n-1;

            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];

            if(sum<0)
            {
                j++;
                }

                else if(sum>0)
            {
                k--;
                }

            else
            {
                List < Integer > triplet=new ArrayList<>();

                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    ans.add(triplet);

                    while(j<k && nums[j]==nums[j+1])j++;
                while(j<k && nums[k]==nums[k-1]) k--;

                j++;
                k--;
                }
            }
        }
        return ans;
   }
}
