package MapsInitials;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        //Map<Integer, List<String>> map1 = new HashMap<>();
        map.put(1, "JOHN");
        map.put(2, "BART");
        map.put(3, "NATASHA");

        System.out.println(map);

        for (Map.Entry<Integer, String> m : map.entrySet()) {

            System.out.println("Value: " + m.getValue());
            System.out.println("Key: " + m.getKey());
        }

        Map<String, List<String>> food = new HashMap<>();
        //WEGAN
        //HALLA
        //KOSHER

        List<String> wegan = new ArrayList<>();
        wegan.add("EAGS");
        wegan.add("CHEESE");
        wegan.add("TOFU");

        List<String> halal = new ArrayList<>();
        halal.add("SHEEP");
        halal.add("CHICKEN");
        halal.add("SALAMI");

        List<String> kosher = new ArrayList<>();
        kosher.add("WEGAN");
        kosher.add("HALAL");
        kosher.add("KOSHER");

        food.put("WEGAN", wegan);
        food.put("HALAL", halal);
        food.put("KOSHER", kosher);

        System.out.println(food);

        for (Map.Entry<String, List<String>> m : food.entrySet()) {

            System.out.println(m.getKey());
            List<String> values = food.get(m.getKey());
            for (String val : values) {

                System.out.println("-" + val);
            }
        }
    }
}