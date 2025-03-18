//350. Intersection of Two Arrays II

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        int[] frequency=new int[1001];

        for(int num:nums1)
        {
            frequency[num]++;
        }

        List<Integer> numbers=new ArrayList<>();

        for(int num:nums2)
        {    
            if(frequency[num]>0)
            {
                numbers.add(num);
            frequency[num]--;
            }
        }

int[] result=new int[numbers.size()];
int index=0;

for(int res:numbers)
{
    result[index]=res;
    index++;

}

return result;
        
    }
}
