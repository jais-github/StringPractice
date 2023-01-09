package Basic;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
	public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet();
        
        int left = 0, right = 0;
        int n = s.length();
        int max = 0;
        while(right < n){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                max = Math.max(set.size(),max);
            }else{
                set.remove(s.charAt(left));
                left++;
            }
               
        }
        return max;
    }
	public static void main(String[] args) {
		String s = "geeksforgeeks";
		System.out.println("The input string is " + s);
		 int length =lengthOfLongestSubstring(s);
		 System.out.println("The length of the ongest non- repeating character substring is: " + length);
	}

}
