package Basic;

public class LargestCommonPrefix {
	public static String commonnPrefix(String str1, String str2) {
		int n1 = str1.length();
		int n2= str2.length();
		String result = "";
		for(int i =0,j=0;i <= n1-1 &&j <= n2 - 1;i++,j++) {
			if(str1.charAt(i) != str2.charAt(j)) {
				break;
			}
			result += str1.charAt(i);			
		}
		return result;
	}
	static String commonPrefix(String[] str, int n) {
		String prefix = str[0];
		for(int i = 0;i<str.length;i++) {
			prefix = commonnPrefix(prefix,str[i]);
		}
		return prefix;
	}
	public static void main(String[] args) {
		String[] str = {"geeksforgeeks","geeks","geeksfor"};
		int n = str.length;
		String commPre = commonPrefix(str,n);
		System.out.println("common prefic is: "+ commPre);
	}

}
