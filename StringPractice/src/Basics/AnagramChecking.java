package Basics;

import java.util.Scanner;
/*
 * This is a Anagram checking program where we check that In a sentence every every 
 * alphabet is present or not
 */
public class AnagramChecking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a sentence\n");
		Scanner sc = new Scanner(System.in);
		
		String s = new String();
		s= sc.nextLine().trim();
		if(s.length() <= 26) {
			System.out.println("This is not a anagram");
			return ;
		}
		for(char ch='a';ch<'z';ch++) {
			if(s.indexOf(ch) == -1) {
				System.out.println("Not a Anagram");
				return;
			}
		}
			
				System.out.println("THis is a Anagram");
			
		
	}

}
