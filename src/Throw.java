import java.util.ArrayList;
import java.util.List;

public class Throw {
    public static void main(String[] args) {
        try {

            List<String> myList = new ArrayList<>();
            myList.add("She");
            myList.add("He");
            myList.add("Him");
            myList.add("Her");

            String fifthItem = myList.get(4);
            System.out.println("Fifth Item: " + fifthItem);
        } catch (Exception e) {
            System.out.println("Error index not found: " + e.getMessage());
        }
    }
}
