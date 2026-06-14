class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] output= new int [nums.length] ;
        for(int i=0 ; i<nums.length ; i++ ) {
            int product=1;
            for (int j=i ;j<nums.length ;j++) {
                if(j==i) {continue;}
                product*=nums[j];
            }
            for (int j=i ;j>=0 ;j--) {
                if(j==i) { continue;  }
                product*=nums[j];
            }
output[i]=product;
    }
    return output;
}  
}