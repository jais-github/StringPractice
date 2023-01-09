package Basic;

import java.util.Scanner;

public class OccurrenceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str ="This is an applie";
		String str;
		System.out.println("Enter your String");
		Scanner sc= new Scanner(System.in);
		str=sc.nextLine();
		char search = 'a';
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==search) {
			  	count++;
			}
			
		}
		System.out.println("Total count of character that is been searched is :" + count);
	//	System.out.print(count);
	}

}
