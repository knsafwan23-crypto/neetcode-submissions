class Solution {
    public int missingNumber(int[] nums) {
        boolean flag=false;
            for (int j=0 ;j<=nums.length; j++) {
                for (int i=0; i<nums.length; i++) {
                if(nums[i]==j) {flag=false; break;}
                else {flag=true; }
        }
        if(flag==true)
         {return j;}
    }
    return 0;
}
}
