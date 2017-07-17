public class Solution {
    
    public String reverseWords(String s) {
    String[] strs = s.split(" ");
    StringBuffer sb = new StringBuffer();
    for(String str : strs){
        StringBuffer temp = new StringBuffer(str);
        sb.append(temp.reverse());
        sb.append(" ");
    }
    sb.setLength(sb.length()-1);
    return sb.toString();
}
}
