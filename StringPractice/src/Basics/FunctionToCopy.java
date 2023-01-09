package Basics;

import java.util.Scanner;

public class FunctionToCopy
{
   public static void main(String[] args)
   {
      String strOrig, strCopy;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the String: ");
      strOrig = scan.nextLine();
      
      strCopy = strOrig;
      
      System.out.println("\nstrOrig = " +strOrig);
      System.out.println("strCopy = " +strCopy);
   }
}