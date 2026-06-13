class Solution {
    public boolean isPalindrome(String s) {
        String forwardresult=""; s=s.toLowerCase(); String backwardresult="";
          for (int i=0 ; i<s.length(); i++) {
 if (((s.charAt(i)>='a') && (s.charAt(i)<='z')) ||((s.charAt(i)>='0') && (s.charAt(i)<='9') ) ) {
     forwardresult=forwardresult +s.charAt(i);
 }
          }
     for ( int i=0 ; i<s.length(); i++) {
 if (((s.charAt(i)>='a') && (s.charAt(i)<='z')) ||((s.charAt(i)>='0') && (s.charAt(i)<='9') ) ) {
     backwardresult=s.charAt(i) +backwardresult; 
        }
     }         
      if(forwardresult.equals(backwardresult)){return true;} 
      else {return false; }
    }
}
