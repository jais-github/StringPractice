package Basic;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello my name is Ayush";
		String reverse ="";
		int length = str.length();
		System.out.println("String before reversing");
		System.out.println(str);
		for(int i=0;i<length;i++) {
			reverse = str.charAt(i) +reverse;
		}
		System.out.println("String after reversing");
		System.out.println(reverse);
	}

}
