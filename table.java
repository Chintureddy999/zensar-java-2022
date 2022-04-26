 import java.util.Scanner;
    public class table {
    public static void main(final String args[]){
        final Scanner sc= new Scanner(System.in);
        final int num=sc.nextInt();
        for(int i=1;i<=10;i++)
        System.out.println(num+"*"+i+"="+num*i);

    }

    public table() {
    }

    @Override
    public String toString() {
        return "table []";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    public table() {
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }
}
