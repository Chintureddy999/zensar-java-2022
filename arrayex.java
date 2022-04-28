public class arrayex {
    public static void main(String[] args){
        int[] arr = new int[10];
        arr[0] =9; arr[1] =8; arr[2] =3; arr[3] =4; arr[4] =5;
        arr[5] =10; arr[6] =1; arr[7] =2; arr[8] =11; arr[9] =7;

        int product=1;
        for (int i : arr){
            product = product*i;
        }
        System.out.println("product ="+ product);
        System.out.println(arr[4]);
    }
}
