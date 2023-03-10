package Basics;

class InitialsOfname {
    
    static void printInitials(String name)
    {
        if (name.length() == 0)
            return;
 
        // Since toupper() returns int,
        // we do typecasting
        System.out.print(Character.toUpperCase(
            name.charAt(0)));
 
        
        // print the characters after spaces.
        for (int i = 1; i < name.length() - 1; i++)
            if (name.charAt(i) == ' ')
                System.out.print(" " + Character.toUpperCase(
                                        name.charAt(i + 1)));
    }
 
   
    public static void main(String args[])
    {
        String name = "Ayush Jaiswal";
        printInitials(name);
    }
}
