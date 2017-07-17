package com;

/**
 * Created by enbodu on 7/5/17.
 *
 * 461. Hamming Distance
 *
 * The Hamming distance between two integers is the number of positions at which the
 * corresponding bits are different.
 Given two integers x and y, calculate the Hamming distance.
 Note:
 0 ≤ x, y < 231.
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
