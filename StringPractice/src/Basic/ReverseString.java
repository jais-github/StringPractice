package Basic;

public class ReverseString {

	public static String ans(String s) { 
		int i = s.length() - 1;
        String ans = "";
        
        while(i >= 0){
            while(i >= 0 && s.charAt(i) ==' ')
                i--;
            
            int j = i;
            
            if(i < 0) 
                break;
            
            while(i >= 0 && s.charAt(i) != ' ')
                i--;
            
            if(ans.isEmpty()){
               ans = ans.concat(s.substring(i+1, j+1));
            }else{
                ans = ans.concat(" "+s.substring(i+1, j+1));
            }
        }
        return ans;
    }
	
	public static void main(String[] args) {
		String s = "sky is blue";
		System.out.println(" String Before Reversing");
		System.out.println(s);
		System.out.println("After Reversing a string");
		String str = ans(s);
		System.out.println(str);
	}

}
