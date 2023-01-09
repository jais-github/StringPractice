package Basic;

public class IndexOfFirstOccurrenceInString {
	/*
	 * public int strStr(String haystack, String needle) { if(haystack == null ||
	 * needle == null || needle.length() > haystack.length()) return -1;
	 * 
	 * if(needle.length() == 0) return 0;
	 * 
	 * int strSubstring= haystack.indexOf(needle); return strSubstring; }
	 */
       

	 /*if(needle.length() > haystack.length())
	        return -1;
	    
	    int i = 0;
	    int j = needle.length()-1;
	    
	    while(j < haystack.length())
	    {
	        String str = haystack.substring(i, j+1);
	        
	        if(str.equals(needle))
	            return i;
	        
	        i++;
	        j++;
	    } 
	    return -1;*/
	
	
	
	
		/*
		 * public int strStr(String haystack, String needle) {
		 * if(haystack.contains(needle)){ return haystack.indexOf(needle); } return -1;
		 * } }
		 */
	
	
		/*
		 * public int strStr(String haystack, String needle) { return
		 * haystack.indexOf(needle); }
		 */
}
 