package Basic;

public class RemoveAllOccurencesOfCharacter {
	public static void removeChar(String str, char c) {
		int count = 0;
		int j;
		char[] ch=str.toCharArray();
		for(int i=j=0;i<str.length();i++) {
			if(ch[i] != c)
				ch[j++] = ch[i];
			else
				count ++;
		}
		
		while(count >0) {
			ch[j++] ='\0';
			count--;
		}
		System.out.println(ch);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Ayush Jaiswal";
		
		
		removeChar(str, 'a');
	}

}
