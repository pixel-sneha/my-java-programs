import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class Main {
    public static void printSet(HashSet<String> set) {
       for (String element : set) {
        System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String setString = scanner.nextLine();

        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> mySet = new Gson().fromJson(setString, setType);

        printSet(mySet);
    }
}

/*Create a method named findNumber that takes three arguments:
A 2D array of integers (grid), An integer (target) to find
A boolean that determines if the search should stop after finding the first occurrence
use a labeled loop to search for the target number and print each position where it's found. 
If breakEarly is true, it should stop after finding the first occurrence.*/
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class Main {
    public static void findNumber(int[][] grid, int target, boolean breakEarly) {
        if(grid.length==0){
            System.out.println("");
        }
        outer: for(int i=0; i<grid.length;i++){
            for(int j=0; j<grid[i].length;j++){
                if (grid[i][j]==target){
                    System.out.println("Found at: " +i+ "," +j);
                    if(breakEarly){
                        break outer;
                    }
                }
            }
        }
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gridString = scanner.nextLine();
        int target = Integer.parseInt(scanner.nextLine());
        boolean breakEarly = Boolean.parseBoolean(scanner.nextLine());
        
        Type gridType = new TypeToken<int[][]>(){}.getType();
        int[][] grid = new Gson().fromJson(gridString, gridType);
        
        findNumber(grid, target, breakEarly);
    }
}


/*Create a method named getDayType that takes two arguments:
An integer (day) representing a day of the week (1-7)
A boolean (abbreviated) that determines the return format*/

import java.util.Scanner;
public class Main {
    public static String getDayType(int day, boolean abbreviated) {
        return switch(day){
            case 1,2,3,4,5 -> abbreviated ? "WKD" : "WORKDAY";
            case 6,7 -> abbreviated ? "WKND" : "WEEKEND";
            default -> abbreviated ? "INV" : "INVALID";
        };
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        boolean abbreviated = Boolean.parseBoolean(scanner.nextLine());
        
        System.out.println(getDayType(day, abbreviated));
    }
}
