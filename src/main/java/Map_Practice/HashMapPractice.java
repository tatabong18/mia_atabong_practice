package Map_Practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        Map<String, Item> stringItemMap =
                new HashMap<String, Item>();
        Item pizza = new Item("pizza",
                10.0, 10, 20);
        stringItemMap.put("pizza", pizza);


    }
}

