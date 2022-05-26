package april;
import java.util.Scanner;
public class leap {
    public static void main(String[] args) {
        int startYear, endYear, i;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the start year:");
        startYear=in.nextInt();
        System.out.println("Enter the end year:");
        endYear=in.nextInt();
        System.out.println("leap years:");
        for(i=startYear; i<=endYear;i++){
            if((0==i%4)&&(0!=i%100)||(0==i%400)){
                System.out.println(i);
            }

        }

        
    }
    
}
