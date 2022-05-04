import java.util.ArrayDeque;
import java.util.Queue;
public class qex {

    public static void main(String[] args) {
        Queue<Integer> q=new ArrayDeque<>();
        q.offer(9);
        q.offer(22);
        q.offer(39);
        q.poll();

        System.out.println(q.isEmpty());
        System.out.println(q);
    }
    
}
