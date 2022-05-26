package Test2;
import java.util.Scanner;

public class MAXToys {
    public static int getMaxToys(int price[],int money){
        int count=0;
        int sum=0;
        int max=0;
        for(int i=0; i<price.length;i++){
            sum=count=0;
            for(int j=i;j<price.length;j++){
                if((sum+price[j])<=money){
                    sum=sum+price[j];
                    count=count+1;
                    max=Math.max(count,max);
                }
                else{
                    count=0;
                    sum=0;
                    break;
                }
            }
        }
        return max;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int price[]=new int[n];
        for(int i=0;i<n;i++)
        price[i]=sc.nextInt();
        int money=sc.nextInt();
        System.out.println(getMaxToys(price,money));
        
    }
}
    

