package Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Permutation {
	
	public static void main(String[] args) {
	
		String S = "abc";
		List<String> ls=new ArrayList<String>();
	       method(S,ls,"");
	       Collections.sort(ls);
	        
	       System.out.println(ls);
	}
	
    public static List<String> find_permutation(String S) {
       List<String> ls=new ArrayList<String>();
       method(S,ls,"");
       Collections.sort(ls);
       return ls;
    }
    
    public static void method(String s,List<String>lst,String ans){
        if(s.length() == 0){
            if(!lst.contains(ans)){
                lst.add(ans);
            }
            return ;
        }
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String ros=s.substring(0,i)+s.substring(i+1);
            method(ros,lst,ans+ch);
        }
    }
}



