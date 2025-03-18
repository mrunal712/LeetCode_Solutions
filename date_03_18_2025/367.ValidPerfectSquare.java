//367. Valid Perfect Square

class Solution {
    public boolean isPerfectSquare(int num) {

        int left=1;
        int right=num/2;

    if(num==1)
    {
    return true;
    }
        while(left<=right)
        {
            int mid=(left+right)/2;
            long square=(long)mid*mid;

            if(square==num)
            {
                return true;
            }

            else if(square<num)
            {
                left=mid+1;
            }
            
            else
            {
                right=mid-1;
            }
        }
        
        return false;
    }
}
