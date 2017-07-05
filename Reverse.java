package com;

/**
 * Created by enbodu on 7/4/17.
 */

       /* 557. Reverse Words in a String III

        Given a string, you need to reverse the order of characters in each
        word within a sentence while still preserving whitespace and initial word order.

        Note: In the string, each word is separated by single space and there will
        not be any extra space in the string.*/
public class Reverse {

    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for(String str: strs){
            StringBuffer temp = new StringBuffer(str);
            sb.append(temp.reverse());
            sb.append(" ");
        }
        sb.setLength(sb.length()-1);
        return sb.toString();
    }
}
