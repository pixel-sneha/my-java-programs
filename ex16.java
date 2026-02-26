/*Create a method named unionSets that takes
 two HashSets of integers as input, computes their union, and prints it */
import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class Main {
    public static void unionSets(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("Union: "+ unionSet);
        //similiarly to keep only the same contents we can use
        intersec.retainAll(set2);
        System.out.println("Intersection: " +intersec);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String set1String = scanner.nextLine();
        String set2String = scanner.nextLine();
        Type setType = new TypeToken<HashSet<Integer>>(){}.getType();
        HashSet<Integer> set1 = new Gson().fromJson(set1String, setType);
        HashSet<Integer> set2 = new Gson().fromJson(set2String, setType);
        unionSets(set1, set2);
    }
}

