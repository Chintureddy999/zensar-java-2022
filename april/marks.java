package april;

public class marks {
    public static void main(String[] args){
        int[] arr = new int[]{90,67,87,77,99,100,68,97,87,40};
        int sum =0;
        for(int i:arr){
            sum =sum+i;
        }
        System.out.println("sum ="+ sum);
       int max=arr[0];
       for(int i:arr){
           max=arr[i];
       }
       System.out.println("gratest value"+ max);
    }
    
}
