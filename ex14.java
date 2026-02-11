/*Create a method named testHashMapMethods that takes a HashMap named data as input. The method should perform the following operations:
Check if the HashMap is empty and print.
Get the number of key-value mappings and print them.
Remove all mappings from the HashMap using clear().
Check if the HashMap is empty again after clearing and print*/
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void testHashMapMethods(HashMap<String, Integer> data) {
        System.out.println("Is empty: " + data.isEmpty());
        System.out.println("Size: " + data.size());
        data.clear();
        System.out.println("Is empty after clear: " + data.isEmpty());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hashMapString = scanner.nextLine();

        // Convert String of HashMap to HashMap
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> data = new Gson().fromJson(hashMapString, mapType);

        testHashMapMethods(data);
    }
}

/*Create a method named printInventoryKeySet that accepts a HashMap (where keys are product names and values are quantities) 
from a JSON string read via Scanner. Your method should iterate over the HashMap using the keySet() method*/

import java.util.HashMap;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class Main {
    public static void printInventoryKeySet(HashMap<String, Integer> inventory) {
        for(String product : inventory.keySet()){
            int values = inventory.get(product);
            System.out.println("Product: " + product + ", Quantity: " + values);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read JSON string input representing the inventory HashMap
        String inventoryString = scanner.nextLine();

        // Convert JSON string to HashMap<String, Integer>
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> inventory = new Gson().fromJson(inventoryString, mapType);

        printInventoryKeySet(inventory);
    }
}

/*Create a method named printInventoryEntrySet that accepts a HashMap 
(with product names as keys and quantities as values) from a JSON string read via Scanner. 
Your method should iterate over the HashMap using the entrySet() method and print each key-value pair */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class Main {
    public static void printInventoryEntrySet(HashMap<String, Integer> inventory) {
        for(Map.Entry<String, Integer> entry: inventory.entrySet()){
            System.out.println("Product: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inventoryString = scanner.nextLine();

        // Convert JSON string to HashMap<String, Integer>
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> inventory = new Gson().fromJson(inventoryString, mapType);

        printInventoryEntrySet(inventory);
    }
}
