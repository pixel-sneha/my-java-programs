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


/*Create a method named printNestedInventory that takes a nested HashMap called inventory as input. In this inventory:

Keys are categories (e.g., "Electronics", "Furniture").
Values are inner HashMaps where keys are product names and values are their prices.*/

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Main {
    public static void printNestedInventory(HashMap<String, HashMap<String, Integer>> inventory) {
        // Iterate over each category in the outer HashMap.
        for (String category : inventory.keySet()) {
            System.out.println("Category: " + category);
            HashMap<String, Integer> items = inventory.get(category);
            // Check if the inner map is empty.
            if (items.isEmpty()) {
                System.out.println("  (No products)");
            } else {
                // Iterate over each product in the inner HashMap using keySet().
                for (String product : items.keySet()) {
                    System.out.println("  Product: " + product + ", Price: " + items.get(product));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inventoryString = scanner.nextLine();
        // Convert JSON string to Nested HashMap
        Type inventoryType = new TypeToken<HashMap<String, HashMap<String, Integer>>>(){}.getType();
        HashMap<String, HashMap<String, Integer>> inventory = new Gson().fromJson(inventoryString, inventoryType);

        printNestedInventory(inventory);
    }
}

/*Create a method named manageWarehouse that takes two arguments:
 HashMap named warehouse where:
Keys represent product names (String).
Values represent quantities (Integer).
A list of operations (String[] operations) where each string follows one of these formats:
"ADD product quantity" → Adds the given quantity to the existing product (or creates it if not present).
"REMOVE product quantity" → Decreases the quantity of the product. If quantity becomes 0 or negative, remove the product.
"CHECK product" → Prints true if the product exists, otherwise false.
"PRINT" → Prints all products and their quantities*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class Main {
    public static void manageWarehouse(HashMap<String, Integer> warehouse, String[] operations) {
        for (int i = 0; i < operations.length; i++) {
            String[] parts = operations[i].split(" ");
            String command = parts[0];
            String product;

            if (command.equals("ADD")) {
                product = parts[1];
                int addQuantity = Integer.valueOf(parts[2]);
                if (warehouse.containsKey(product)) {
                    warehouse.put(product, warehouse.get(product) + addQuantity);
                } else {
                    warehouse.put(product, addQuantity);
                }
            } else if (command.equals("REMOVE")) {
                product = parts[1];
                int removeQuantity = Integer.valueOf(parts[2]);
                if (warehouse.containsKey(product)) {
                    int updatedQuantity = warehouse.get(product) - removeQuantity;
                    if (updatedQuantity > 0) {
                        warehouse.put(product, updatedQuantity);
                    } else {
                        warehouse.remove(product);
                    }
                }
            } else if (command.equals("CHECK")) {
                product = parts[1];
                System.out.println(warehouse.containsKey(product));
            } else if (command.equals("PRINT")) {
                for (Map.Entry<String, Integer> entry : warehouse.entrySet()) {
                    System.out.println("Product: " + entry.getKey() + ", Quantity: " + entry.getValue());
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String warehouseString = scanner.nextLine();
        String operationsString = scanner.nextLine();

        // Convert JSON string to HashMap
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> warehouse = new Gson().fromJson(warehouseString, mapType);
        // Convert JSON string to Array
        String[] operations = new Gson().fromJson(operationsString, String[].class);
        manageWarehouse(warehouse, operations);
    }
}
