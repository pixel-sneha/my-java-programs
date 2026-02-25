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

/*Create a method named checkSet that takes a HashSet of Strings as input. The method should print two lines:
"Empty: <true/false>" indicating whether the set is empty.
"Size: <number>" indicating the number of elements in the set.*/
import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class Main {
    public static void checkSet(HashSet<String> set) {
        boolean check = set.isEmpty();
        int size = set.size();
        System.out.println("Empty: " +check);
        System.out.println("Size: " +size);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String setString = scanner.nextLine();
        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> set = new Gson().fromJson(setString, setType);
        checkSet(set);
    }
}

/*Create a method named processSet that takes a HashSet of Strings as input. The method should:
Clone the set,Clear the original set.
Print the cloned set and its size,the original set (after clear) and its size.*/
import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
@SuppressWarnings("unchecked")

public class Main {
    public static void processSet(HashSet<String> set) {
        HashSet<String> clonedSet = (HashSet<String>) set.clone();
        set.clear();
        System.out.println("Cloned Set: " + clonedSet);
        System.out.println("Cloned Set Size: " + clonedSet.size());
        System.out.println("Original Set after clear: " +set);
        System.out.println("Original Set Size: " +set.size());
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String setString = scanner.nextLine();
        
        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> set = new Gson().fromJson(setString, setType);
        
        processSet(set);
    }
}

/*The method should perform different operations using concepts from Advanced Control Flow:
Operations (using Switch Expression):
"add": Add input to set and return success/failure message
"remove": Remove input from set and return success/failure message
"find": Search for input in set using label statements
"count": Count elements of specific type using pattern matching*/
import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static String processHashSet(HashSet<Object> set, Object input, String operation) {
        if (set == null) {
            return "Invalid set";
        }
        if (operation == null) {
            return "Invalid operation";
        }
        if (operation.equals("find") && input == null) {
            return "Cannot find null";
        }
        
        // Process using switch expression
        return switch(operation) {
            case "add" -> {
                boolean added = set.add(input);
                yield added ? "Added successfully" : "Element already exists";
            }
            
            case "remove" -> {
                boolean removed = set.remove(input);
                yield removed ? "Removed successfully" : "Element not found";
            }
            
            case "find" -> {
                int index = 0;
                search: {
                    for (Object obj : set) {
                        if (obj.equals(input)) {
                            break search;
                        }
                        index++;
                    }
                    index = -1;
                }
                yield index >= 0 ? "Found at index: " + index : "Element not found";
            }
            
            case "count" -> {
                int count = 0;
                for (Object obj : set) {
                    if (obj instanceof Integer i) {
                        count++;
                    }
                }
                yield "Number of integers: " + count;
            }
            
            default -> "Invalid operation";
        };
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] items = scanner.nextLine().split(",");
        HashSet<Object> set = new HashSet<>();
        if (!items[0].equals("empty")) {
            for (String item : items) {
                // Try to parse as integer first
                try {
                    set.add(Integer.parseInt(item));
                } catch (NumberFormatException e) {
                    set.add(item);
                }
            }
        }
        
        String inputStr = scanner.nextLine();
        Object input;
        try {
            input = Integer.parseInt(inputStr);
        } catch (NumberFormatException e) {
            input = inputStr;
        }
        String operation = scanner.nextLine();
        System.out.println(processHashSet(set, input, operation));
    }
}
