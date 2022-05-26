package april;

public class prime {
   public static void main(String[] args) {
       int i=0;
       int num=0;
       String PrimeNumbers ="";
       for(i=1; i<=50; i++){
           int counter=0;
           for(num=i;num>=1;num--){
               if(i%num==0){
                   counter=counter+1;
               }
           }
           if (counter==2){
               PrimeNumbers=PrimeNumbers+ i +" ";
           }
       }
       System.out.println("prime numbers from 1 to 50 ");
       System.out.println(PrimeNumbers);
   } 
}
