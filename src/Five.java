import java.util.HashMap;
import java.util.Map;

public class Five {
    public static void main(String[] args) {

        Map<String, Integer> itemMap = new HashMap<>();
        itemMap.put("num 1", 10);
        itemMap.put("num 2", 20);
        itemMap.put("num 3", 15);
        itemMap.put("num 4", 5);
        itemMap.put("num 5", 30);

        itemMap.forEach((k,v)->{
            System.out.println("Key: " + k + ", Value: " + v);

        });

      /*  for (Map.Entry<String, Integer> entry : itemMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }*/
    }
}
