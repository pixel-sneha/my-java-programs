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
        intersec.retainAll(set2); //RETAIN to "keep" the elements of set1 that are in set2 also
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

/*Create a method named setDifference that takes two HashSets of integers as input.
The method should compute the difference (elements in the first set that are not in the second) and print the result */
import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class Main {
    public static void setDifference(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> diff = new HashSet<>(set1);
        diff.removeAll(set2);
        System.out.println("Difference: " +diff);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String set1String = scanner.nextLine();
        String set2String = scanner.nextLine();
        Type setType = new TypeToken<HashSet<Integer>>(){}.getType();
        HashSet<Integer> set1 = new Gson().fromJson(set1String, setType);
        HashSet<Integer> set2 = new Gson().fromJson(set2String, setType);
        setDifference(set1, set2);
    }
}

/*Create a method named symmetricDifference that takes two HashSets of integers as input,
 computes their symmetric difference, and prints it */

import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class Main {
    public static void symmetricDifference(HashSet<Integer> set1, HashSet<Integer> set2) {
        HashSet<Integer> diff1 = new HashSet<>(set1);
        diff1.removeAll(set2);
        HashSet<Integer> diff2 = new HashSet<>(set2);
        diff2.removeAll(set1);
        diff1.addAll(diff2);
        System.out.println("Symmetric Difference: "+diff1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String set1String = scanner.nextLine();
        String set2String = scanner.nextLine();
        Type setType = new TypeToken<HashSet<Integer>>(){}.getType();
        HashSet<Integer> set1 = new Gson().fromJson(set1String, setType);
        HashSet<Integer> set2 = new Gson().fromJson(set2String, setType);
        symmetricDifference(set1, set2);
    }
}

/*Create a method named checkSubsetSuperset that takes two HashSets of strings as input:
setA and setB
The method should: Check if setA is a subset of setB */
import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class Main {
    public static void checkSubsetSuperset(HashSet<String> setA, HashSet<String> setB) {
        boolean ch1 = setB.containsAll(setA);
        System.out.println("setA is a subset of setB: " +ch1);
        System.out.println("setB is a superset of setA: " +ch1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String setAString = scanner.nextLine();
        String setBString = scanner.nextLine();
        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> setA = new Gson().fromJson(setAString, setType);
        HashSet<String> setB = new Gson().fromJson(setBString, setType);
        checkSubsetSuperset(setA, setB);
    }
}
