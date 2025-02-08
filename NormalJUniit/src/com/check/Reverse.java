package com.check;

public class Reverse {
    public String reverseString(String str){
        int start=0,end=str.length()-1;
        char temp;
        String reversed="";
        for (int i = end; i >=0; i--) {
            reversed+=str.charAt(i);

        }
        return reversed;
    }
}
