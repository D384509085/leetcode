package com;
/**
 * Created by enbodu on 7/2/17.
 */
      /*  564. Find the Closest Palindrome
        Given an integer n, find the closest integer (not including itself), which is a palindrome.
        The 'closest' is defined as absolute difference minimized between two integers.
        Note:
        The input n is a positive integer represented by string, whose length will not exceed 18.
        If there is a tie, return the smaller one as answer.*/

public class testclass {
    public static void main(String[] args) {
    //test
    }

    public String nearestPalindromic(String n) {
        if(Long.valueOf(n)<=Long.valueOf(10)){
            long answer = Long.valueOf(n)-1;
            String last = String.valueOf(answer);
            return last;
        }
        else if (Long.valueOf(n)==Long.valueOf(11)){
            return "9";
        }
        else{
            long[] PotentialAnswer = potencialAnswer(n);
            return find(PotentialAnswer, n);
        }
    }

    //fanzhuanzifuchuan
    String reverse(String previous) {
        char[] a = previous.toCharArray();
        String NewString = "";
        for(int i=previous.length()-1; i>=0; i--) {
            NewString += previous.charAt(i);
        }
        return NewString;
    }
    //dedao n de jin si fan zhuan shuzu
    //
    //
    long[] potencialAnswer(String n) {
        long newStrngmiddle=1;
        long newStrngforward=1;
        long newStrngback=1;
        long HarfLong;
        long ForwardeLong;
        long backLong;
        String min = "";
        String max = "1";
        long[] array = new long[5];
        //oushufanzhuanqianbanbufen
        if(n.length()%2==0){
            String HalfString = n.substring(0,n.length()/2);
            HarfLong = Long.valueOf(HalfString);
            ForwardeLong = HarfLong-1;
            backLong = HarfLong+1;
            newStrngmiddle =Long.valueOf(HalfString + reverse(HalfString));
            newStrngforward = Long.valueOf(String.valueOf(ForwardeLong) + reverse(String.valueOf(ForwardeLong)));
            newStrngback = Long.valueOf(String.valueOf(backLong) + reverse(String.valueOf(backLong)));
        }
        if(n.length()%2==1){
            String halfString = n.substring(0,(n.length()-1)/2);
            String middle = ""+ n.charAt((n.length()-1)/2);
            HarfLong = Long.valueOf(middle);
            if(HarfLong!=0){
                ForwardeLong = HarfLong-1;
            }
            else ForwardeLong = HarfLong;
            backLong = HarfLong+1;
            newStrngmiddle = Long.valueOf(halfString + middle + reverse(halfString));
            newStrngforward = Long.valueOf(halfString + String.valueOf(ForwardeLong) + reverse(halfString));
            newStrngback = Long.valueOf(halfString + String.valueOf(backLong) + reverse(halfString));
        }
        for(int i=0; i<n.length()-1;i++){
            min += "9";
            max += "0";
        }
        max+="1";

        array[0] = newStrngforward;
        array[1] = newStrngmiddle;
        array[2] = newStrngback;
        array[3] = Long.valueOf(min);
        array[4] = Long.valueOf(max);

        return  array;
    }

    String find(long[] potential, String n){
        Long target = Long.valueOf(n);
        Long min = target+Long.valueOf(30);
        int position1 = 0;
        int position2 = -1;
        for(int i=0; i<potential.length; i++){
            if(Math.abs(target - potential[i])<min && target!=potential[i]){
                min = Math.abs(target - potential[i]);
                position1 = i;
                position2 = -1;
            }
            else if(Math.abs(target - potential[i])==min){
                position2 = i;
            }
        }


        if(position2==-1) {
            return String.valueOf(potential[position1]);
        }
        else if(position2!=-1) {
            if(potential[position1]>potential[position2]){
                return String.valueOf(potential[position2]);
            }
            else return String.valueOf(potential[position1]);
        }
        return null;
    }

}
