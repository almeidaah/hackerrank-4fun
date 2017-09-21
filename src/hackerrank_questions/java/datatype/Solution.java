package hackerrank_questions.java.datatype;

import java.util.Scanner;

class Solution{
    public static void main(String []argh)
    {
    	  try(Scanner sc = new Scanner(System.in)){
    		Integer actualLine = 1;
    		while(sc.hasNext()){
    			System.out.println(actualLine + " " + sc.nextLine());
    			actualLine++;
    		}
    	  }
          

        
    }
}
