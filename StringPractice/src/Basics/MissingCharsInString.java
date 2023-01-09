package Basics;

import java.util.ArrayList;

public class MissingCharsInString {
		public static ArrayList<Character> missingChars(String s) {
			final int MAX_CHAR = 26;
			
			 boolean[] present = new boolean[MAX_CHAR];
			    ArrayList<Character> charsList = new ArrayList<>();
			for(int i=0; i < s.length();i++) {
				if(s.charAt(i) >= 'a' &&s.charAt(i) <= 'z')
					present[s.charAt(i) - 'a'] = true;
				else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
					present[s.charAt(i) - 'A'] = true;
			}
			
			
			for(int i = 0; i< MAX_CHAR;i++) {
				if(present[i] == false) 
					charsList.add((char)(i + 'a'));
				
			}
			return charsList;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "The quick brown fox jumps " +
                 "over the dog";
                  
    ArrayList<Character> missing = MissingCharsInString.missingChars(
        str);
         
    if (missing.size() >= 1)
    {
        for(Character character : missing)
        {
            System.out.print(character);
        }
    }
	}

}
