class Solution {
    public static boolean hasDuplicate(int[] nums) {
        for (int i=0 ;i<nums.length ;i ++) {
            if(i<nums.length-1) {
            for (int j=i+1; j<nums.length ; j++) {
                if(nums[i]==nums[j]) {
                    return true;
                }
            }
        
        }
        }
        return false ;
    
    }
    public static void main (String [] args) {
System.out.print(hasDuplicate(new int [] {1, 2, 3, 3}));
    }
}