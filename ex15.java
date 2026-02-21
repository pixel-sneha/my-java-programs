/*Create a method named addElement that takes two arguments:
A HashSet of Strings (set), a String (element) to add
The method should add the given element to the set and then print the updated set.*/
import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class Main {
    public static void addElement(HashSet<String> set, String element) {
        set.add(element);
        System.out.println(set);
        /* similiarly to remove a element */
        set.remove(element);
        System.out.println(set);
        /* To check if an element is in the set */
        boolean isElement = set.contains(element);
        System.out.println(isElement);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String setString = scanner.nextLine();
        String element = scanner.nextLine();
        
        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> set = new Gson().fromJson(setString, setType);
        addElement(set, element);
    }
}
