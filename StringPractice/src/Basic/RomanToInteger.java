package Basic;

public class RomanToInteger {
	
		static int value(char c) {
			if(c == 'l')
				return 1;
			if(c == 'V')
				return 5;
			if(c == 'X')
				return 10;
			if(c == 'L')
				return 50;
			if(c == 'C')
				return 100;
			if(c == 'D')
				return 500;
			if(c == 'M')
				return 1000;
			return -1;
		}
		
		static int RomanToInteger(String str) {
		int result = 0;
		for(int i=0;i<str.length();i++) {
			
			int s1 = value(str.charAt(i));
			if(i+1 < str.length()) {
				
				int s2 = value(str.charAt(i+1));
			if(s1 >= s2) {
				result = result + s1;
			}else {
				result = result - s1;
			}
		}else {
			result = result + s1;
		}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 RomanToInteger rti = new RomanToInteger();
		String str = "LXVMC";
		
		
		System.out.println("the inter value for the given roman value is: "+ RomanToInteger.RomanToInteger(str));
		
	}

}
