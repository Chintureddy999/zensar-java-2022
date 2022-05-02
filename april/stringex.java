package april;

public class stringex {
    public static void main(String[] args) {
        String s ="Chintu,is a,Coder";
        System.out.println(s.length());
        System.out.println(s.charAt(s.length()-2));
        System.out.println(s.substring(1,7));
        System.out.println(s.indexOf("a"));
        System.out.println(s.lastIndexOf("a"));
        System.out.println(s.equals("Chintu,is a,Coder"));
        System.out.println(s.replace("Chintu","vignesh"));
        String[] sarr =s.split(",");
        for(String str : sarr){
            System.out.println(str);
        }
    }
    public static String reverse(String s) {
        String str  = "";
        for (int i = s.length() - 1; i > 0; i--) {
            str += s.charAt(i); // n a y r a A
        }
        return str;
    }
}
