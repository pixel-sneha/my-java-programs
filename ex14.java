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
