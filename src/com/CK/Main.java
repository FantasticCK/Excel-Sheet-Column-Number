package com.CK;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Solution {
    public int titleToNumber(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++){
            int num = (int) s.charAt(i) - 64;
            res = res * 26 + num;
        }
        return res;
    }
}