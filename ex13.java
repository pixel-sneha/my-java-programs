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

/*Create a method named getCapital that takes two arguments:

A HashMap named capitals where keys are country names (strings) and values are capital city names (strings).
A string country representing the name of a country.
The method should return the capital city of the given country by accessing the capitals HashMap. If the country is not found in the HashMap, return "Not found".*/

// --- Modules to convert string of hashmap to hashmap ---
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static String getCapital(HashMap<String, String> capitals, String country) {
        //HashMap<String,String> capitals = new HashMap<>();
        String capital = capitals.get(country);    
        if (capital==null){
                capital = "Not found";
        }
        return capital;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hashMapString = scanner.nextLine();
        String country = scanner.nextLine();

        // Converting String of HashMap to HashMap
        Type mapType = new TypeToken<HashMap<String, String>>(){}.getType();
        HashMap<String, String> countryCapitals = new Gson().fromJson(hashMapString, mapType);

        String result = getCapital(countryCapitals, country);
        System.out.println(result);
    }
}
