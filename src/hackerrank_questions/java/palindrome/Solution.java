package hackerrank_questions.java.palindrome;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        
	        boolean palindrome = false;
	        for(int i = 0; i <= (A.length() / 2); i++){
	        	if(! (A.charAt(i) == A.charAt(A.length() - (i+1) ) ) ){
	        		break;
	        	}
	        	if(i >= (A.length() / 2)){
	        		palindrome = true;
	        	}
	        }
	     
	        System.out.println(palindrome ? "Yes" : "No");
	    }

}
