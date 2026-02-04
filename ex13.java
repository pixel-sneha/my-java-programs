/*Create a method named createStringStringMap that takes no arguments and returns a HashMap where both keys and values are strings. The HashMap should contain the following key-value pairs:
Key: "apple", Value: "red"
Key: "banana", Value: "yellow"
Key: "grape", Value: “purple”*/
import java.util.HashMap;
public class Main {
    public static HashMap<String, String> createStringStringMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("banana","yellow");
        map.put("apple","red");
        map.put("grape","purple");
        return map;
    }
    public static void main(String[] args) {
        HashMap<String, String> map = createStringStringMap();   
        // Printing the HashMap
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
