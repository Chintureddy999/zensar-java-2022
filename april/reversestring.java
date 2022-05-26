package april;
import java.util.Scanner;
public class reversestring {


    public static void main(String[] args) {
        String original;
        String rev="";

        System.out.println("Enter String:");
        Scanner sc=new Scanner(System.in);
        original=sc.nextLine();

        int len=original.length();

        for(int i =len-1;i>=0;i--)
           rev=rev+original.charAt(i);
    
         System.out.println("original string is: "+original);
         System.out.println("Reverse of string is: "+rev);
    }
       
}
