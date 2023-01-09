package Basics;

import java.util.Scanner;

public class LongestCommonSubstring {
	static int LongComSubstring(String S1, String S2, int n, int m){
	       int[][] dp=new int [n+1][m+1];
	       int max=0;
	       
	       for(int i=1;i<=n;i++){
	           for(int j=1;j<=m;j++){
	               char c1=S1.charAt(i-1);
	               char c2=S2.charAt(j-1);
	               
	               if(c1 != c2){
	                   dp[i][j]=0;
	               }else{
	                 //  int val=dp[i-1][j-1] +1;
	                  // dp[i][j]=val;
	                  // max=Math.max(max,val);
	                  dp[i][j]=dp[i-1][j-1] +1;
	               }
	              if(dp[i][j] > max){
	                  max=dp[i][j];
	              }
	           }
	       }
	       return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your 1st String");
		String s1=sc.nextLine();
		System.out.println("Enter your 2nd string");
		String s2=sc.nextLine();
		int n=s1.length();
		int m=s2.length();
		System.out.print(LongComSubstring(s1,s2,n,m));
	}

}
