package april;
import java.util.HashMap;
import java.util.Map;
public class map {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(); 
        System.out.println("Map is empty : " + map.isEmpty());

        map.put("Chintu", 1990);
        map.put("Reddy", 123);
        map.put("Chintu", 999);

        System.out.println("Map is Empty : " + map.isEmpty());

        System.out.println("Key : Chintu, Value : " + map.get("Chintu"));
        System.out.println("Key : Reddy, Value : " + map.get("Reddy"));

        System.out.println("Key : Reddy is there ? " + map.containsKey("Reddy"));
        System.out.println("Value : 123 is there ? " + map.containsValue(123));

        map.remove("Reddy");
        System.out.println("Key : Reddy removed");

        map.put("Chin", 12345678);

        map.forEach((k, v) -> {
            System.out.println("Key : " + k + ", value : " + v);
        });

    }
}
