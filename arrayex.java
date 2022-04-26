public class arrayex {
    public static void main(String[] args){
        int[] arr = new int[5];
        arr[0] =9;
        arr[1] =76;
        arr[2] =90;
        arr[3] =24;
        arr[4] =45;

        int sum =0;
        for (int i : arr){
            sum = sum+i;
        }
        System.out.println("sum ="+ sum);
        System.out.println(arr[4]);
    }
}
