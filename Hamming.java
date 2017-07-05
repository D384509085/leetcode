package com;

/**
 * Created by enbodu on 7/5/17.
 */
public class Hamming {
        public int hammingDistance(int x, int y) {
            int i = x^y;
            //判断i有几个1即可
            int count=0;
            while(i!=0){
                count+=i%2;
                i/=2;
            }
            return count;
        }

}
