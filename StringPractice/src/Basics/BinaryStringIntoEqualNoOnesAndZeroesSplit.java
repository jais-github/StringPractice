package Basics;

import java.util.Scanner;

public class BinaryStringIntoEqualNoOnesAndZeroesSplit {
	
		public static void main(String[] args) {
		//String str="0011010101";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your binary String");
		String str=sc.nextLine();
		 int countz=0;
	       int counto=0;
	       
	       //char[] ch=str.toCharArray();
	       int cnt=0;
	       
	       for(int i=0;i<str.length();i++){
	           if(str.charAt(i) == '0'){
	               countz++;
	           }
	           else if(str.charAt(i) == '1'){
	               counto++;
	           }
	           
	           if(countz == counto){
	               cnt++;
	           }
	          
	       }
	       if (countz != counto){
	               System.out.println("Not equal numbers of ones and zeroes");
	           }
	          else
	       System.out.println("The total number of binary String after aplitting into equal number of part is: "+cnt);
		}
		 
	}


