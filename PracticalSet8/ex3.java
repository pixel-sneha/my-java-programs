import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileStats {
    public static void main(String[] args) {
        String fileName = "data.txt";
        int lineCount = 0;
        int wordCount = 0;
        int charCountExcludingSpaces = 0;
        try (FileReader fr = new FileReader(fileName);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;  // Count lines
                String trimmed = line.trim();
                if (!trimmed.isEmpty()) {
                    String[] words = trimmed.split("\\s+");
                    wordCount += words.length;
                }
                String withoutSpaces = line.replace(" ", "");
                charCountExcludingSpaces += withoutSpaces.length();
            }
            System.out.println("Total lines: " + lineCount);
            System.out.println("Total words: " + wordCount);
            System.out.println("Total characters (excluding spaces and newlines): " + charCountExcludingSpaces);

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + fileName);
        } catch (IOException e) {
            System.err.println("An I/O error occurred while reading the file: " + e.getMessage());
        }
    }
}
