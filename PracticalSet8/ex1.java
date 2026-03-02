import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileStats {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java FileStats <filename>");
            System.exit(1);
        }
        File file = new File(args[0]);
        if (!file.exists() || !file.isFile()) {
            System.err.println("Error: file not found or is not a regular file: " + args[0]);
            System.exit(2);
        }

        long charCount = 0;
        long wordCount = 0;
        long lineCount = 0;

        // Count characters
        try (FileReader fr = new FileReader(file)) {
            int ch;
            while ((ch = fr.read()) != -1) {
                charCount++;
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
            System.exit(3);
        } catch (IOException e) {
            System.err.println("Error reading file for character count: " + e.getMessage());
            System.exit(4);
        }
        
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++; // Count lines 
                String trimmed = line.trim();
                if (!trimmed.isEmpty()) {
                    String[] totalWords = trimmed.split("\\s+");
                    wordCount += totalWords.length; //coount words
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
            System.exit(5);
        } catch (IOException e) {
            System.err.println("Error reading file for line/word count: " + e.getMessage());
            System.exit(6);
        }

        System.out.println("File: " + file.getName());
        System.out.println("Characters: " + charCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Lines: " + lineCount);
    }
}
