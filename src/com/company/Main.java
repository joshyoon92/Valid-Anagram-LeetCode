package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    String s = "ababccd";
	    String t = "dcbcaab";
        boolean tf = isAnagram(s,t);
        System.out.println(tf);
    }

    public static boolean isAnagram(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        char[] sA = s.toCharArray();
        char[] tA = t.toCharArray();
        Arrays.sort(sA);
        Arrays.sort(tA);

        return Arrays.equals(sA, tA);
    }
}
