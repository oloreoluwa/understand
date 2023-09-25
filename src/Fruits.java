import java.util.ArrayList;
import java.util.List;

public class Fruits {
    public static void main(String[] args) {
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Orange");
        fruitsList.add("Apple");
        fruitsList.add("Grape");
        fruitsList.add("Pineapple");
        fruitsList.add("Tangerine");
        fruitsList.add("Blueberry");
        fruitsList.add("Strawberry");
        fruitsList.add("Cherry");
        fruitsList.add("Watermelon");
        fruitsList.add("Banana");

        fruitsList.forEach(val->{
            System.out.println(val);
        });

        /*for (String names : fruitsList) {
            System.out.println(names);
        }*/
    }
}
