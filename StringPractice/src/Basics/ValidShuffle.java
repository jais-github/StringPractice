package Basics;

class ValidShuffle{
    public static void main(String[] args){
        String s1="xy";
        String s2="12";
        
        String res="xy12";
        
        int l1=s1.length();
        int l2=s2.length();
        int lr=res.length();
        
        char[] ch=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        char[] ch3=res.toCharArray();
        
        if((l1+l2) != lr)
            System.out.println("No");
        else {
            int f=0;
            int i=0,j=0,k=0;
            
            while(k<lr){
                if(i<l1 && ch[i] == ch3[k]) 
                    i++;
                    
                else if(j<l2 && ch2[j] == ch3[k])
                    j++;
                
                else{
                    f=1;
                    break;
                }
                k++;
            }
            if(i<l1 || j<l2)
                System.out.println("No");
            else
                 System.out.println("Yes");
        }
    }
}