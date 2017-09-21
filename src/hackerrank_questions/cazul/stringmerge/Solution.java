package hackerrank_questions.cazul.stringmerge;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * merge two strings
 * @author almeida
 *
 */
public class Solution {

	public static String mergeStrings(String a, String b){
        String mergeStrings = "";
        int i = 0;
        while (i < a.length() && i < b.length()){
            mergeStrings += a.charAt(i) +""+ b.charAt(i); 
            i++;
        }
        while (i < a.length() ){
            mergeStrings += a.charAt(i); 
            i++;
        }
        while (i < b.length()){
            mergeStrings += b.charAt(i); 
            i++;
        }
        return mergeStrings;
    }
    public static void main(String[] args){
        String a = "ab", b = "zsd";
        String s = Solution.mergeStrings(a,b);
        System.out.println(s);
    }
}
