public class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();
        if(length<=0)
            return "";
        int max = 0;
        String maxstr="";

        for(int i = 0;i<length;i++){
            String s1 = expandString(s,i,i);
            if(s1.length()>max){
                max = s1.length();
                maxstr = s1;
            }
            String s2 = expandString(s,i,i+1);
            if(s2.length()>max){
                max = s2.length();
                maxstr = s2;
            }
        }
        return maxstr;
    }
    private String expandString(String s,int left,int right){
        while(left>=0 && right<s.length()){
            if(s.charAt(left)!=s.charAt(right))
                break;
            left--;right++;
        }
        return s.substring(left+1,right);
    }
}
