package Basic;

import java.util.Scanner;

public class NumberOfVowelsAndConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
	//	str = str.toLowerCase();
		System.out.println("Enter your string ");
		Scanner sc = new Scanner (System.in);
		str=sc.nextLine();
		int consonants = 0;
		int vowels = 0;
		
		for(int i =0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c == 'a' ||c == 'e'||c == 'i'||c =='o'||c =='u') 
				vowels++ ;
				else 
			   consonants++;
			
		}
		System.out.println("Total number of vowels in the string is: "+vowels);
		System.out.println("Total number of consonants in the string is: "+consonants);
	}

}
