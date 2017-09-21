package hackerrank_question.java.statics;

import java.util.Scanner;

public class Solution {

	//Write your code here

	static Boolean flag = true;
	static Integer B,H;

	{
	    
	    Scanner scan = new Scanner(System.in);
	    B = scan.nextInt();
	    H = scan.nextInt();
	    
	    System.out.println("B : " + B + " H " + H);
	    
	    if(B <= 0 || H <= 0){
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
	        flag = false;
	    }
	}
	
	public static void main(String[] args) {
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}
}
