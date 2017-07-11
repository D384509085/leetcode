public class Solution {
    //类似维护队列
    public int lengthOfLongestSubstring(String s) {  
    if(s==null || s.length()==0)  
        return 0;  
    HashSet<Character> set = new HashSet<Character>();  
    int max = 0;  
    int low = 0;  
    int fast = 0;  
    while(fast<s.length())  
    {  
        if(set.contains(s.charAt(fast)))  
        {  
            if(max<fast-low)  
            {  
                max = fast-low;  
            }  
            while(s.charAt(low)!=s.charAt(fast))  
            {  
                set.remove(s.charAt(low));  
                low++;  
            }  
            low++;  
        }  
        else  
        {  
            set.add(s.charAt(fast));  
        }  
        fast++;  
    }  
    max = Math.max(max,fast-low);  
    return max;  
}
}

