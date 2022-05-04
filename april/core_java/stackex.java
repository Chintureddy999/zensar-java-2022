package april.core_java;
import java.util.Stack;
public class stackex {
   public static void main(String[] args) {
       Stack<Integer> s = new Stack<>();
       s.push(10);
       s.push(99);
       s.push(36);
       s.push(100);
       s.pop();
       System.out.println(s.isEmpty());
       s.forEach(System.out::println);
       System.out.println(s);
   } 
  
}
