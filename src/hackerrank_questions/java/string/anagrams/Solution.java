package hackerrank_questions.java.string.anagrams;

import java.util.Scanner;

public class Solution {
	
    static boolean isAnagram(String a, String b) {
    	
    	if(a.length() != b.length()){
    		return false;
    	}
    	
    	for(int s = 0; s < a.length(); s++){
    		String letter = String.valueOf(a.charAt(s));
    		if(!b.toLowerCase().contains(letter.toLowerCase()) || !(countOcurrences(letter, a) == countOcurrences(letter, b)) ){
    			return false;
    		}
    	}
    	
		return true;
    }
    
	private static Integer countOcurrences(String letter, String entireString) {

		Integer count = 0;
		
		for (int i = 0; i < entireString.length(); i++) {
			if(String.valueOf(entireString.charAt(i)).equalsIgnoreCase(letter)){
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
}
