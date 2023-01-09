package Basic;

public class ValidPalindrome {
   public static boolean isPalindrome(String s) {
	   s = s.toLowerCase();
	   StringBuilder b = new StringBuilder();
	   for(int i = 0; i < s.length();i++) {
		   if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))) {
			   b.append(s.charAt(i));
		   }
	   }
	   
	   int n = b.length() -1;
	   for(int i = 0; i< b.length()/2;i++) {
		   if(b.charAt(i) != b.charAt(n - i)) return false;
	   }
	   return true;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str = "Too hot to hoot.";
		
	        if( isPalindrome(str))
	          System.out.println("Sentence is palindrome");
	        else
	          System.out.println("Sentence is not" + " " +
	                                         "palindrome");
	}

}
