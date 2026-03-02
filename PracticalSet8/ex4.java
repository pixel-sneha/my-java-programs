import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileManager {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args) {
        String command = args[0].toLowerCase();
        try {
            switch (command) {
                case "copy":
                    if (args.length != 3) {
                        System.err.println("Invalid arguments for copy.");
                        printUsage();
                        return;
                    }
                    copyFile(args[1], args[2]);
                    break;

                case "delete":
                    if (args.length != 2) {
                        System.err.println("Invalid arguments for delete.");
                        printUsage();
                        return;
                    }
                    deleteFile(args[1]);
                    break;

                case "rename":
                    if (args.length != 3) {
                        System.err.println("Invalid arguments for rename.");
                        printUsage();
                        return;
                    }
                    renameFile(args[1], args[2]);
                    break;

                default:
                    System.err.println("Unknown command: " + command);
                    printUsage();
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("File not found: " + fnfe.getMessage());
        } catch (IOException ioe) {
            System.err.println("I/O error: " + ioe.getMessage());
        }
    }

    private static void copyFile(String sourcePathStr, String destPathStr) throws IOException {
        Path source = Paths.get(sourcePathStr);
        Path dest = Paths.get(destPathStr);

        if (!Files.exists(source)) {
            throw new FileNotFoundException(source.toString());
        }

        Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
        System.out.println("Copy completed: " + source + " -> " + dest);
        System.out.println();
        printFileProperties(dest.toFile());
    }

    private static void deleteFile(String filePathStr) throws IOException {
        File file = new File(filePathStr);
        if (!file.exists()) {
            throw new FileNotFoundException(filePathStr);
        }
      
        System.out.println("Properties before deletion:");
        printFileProperties(file);

        boolean deleted = file.delete();
        if (deleted) {
            System.out.println();
            System.out.println("File deleted successfully: " + file.getName());
        } else {
            throw new IOException("Failed to delete file: " + file.getAbsolutePath());
        }
    }

    private static void renameFile(String sourcePathStr, String destPathStr) throws IOException {
        File source = new File(sourcePathStr);
        File dest = new File(destPathStr);

        if (!source.exists()) {
            throw new FileNotFoundException(sourcePathStr);
        }
        if (dest.exists() && dest.isDirectory()) {
            dest = new File(dest, source.getName());
        } else {
            File parent = dest.getParentFile();
            if (parent != null && !parent.exists()) {
                if (!parent.mkdirs()) {
                    throw new IOException("Failed to create destination directory: " + parent.getAbsolutePath());
                }
            }
        }

        Path moved = Files.move(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Rename/move completed: " + source.getAbsolutePath() + " -> " + moved.toAbsolutePath());
        System.out.println();
        printFileProperties(moved.toFile());
    }

    private static void printFileProperties(File file) {
        System.out.println("File properties:");
        System.out.println("  " + bold("File name") + ": " + file.getName());
        System.out.println("  " + bold("Absolute path") + ": " + file.getAbsolutePath());
        System.out.println("  " + bold("File size (bytes)") + ": " + (file.exists() ? file.length() : "N/A"));
        System.out.println("  " + bold("Readable") + ": " + file.canRead());
        System.out.println("  " + bold("Writable") + ": " + file.canWrite());
        System.out.println("  " + bold("Last modified") + ": " + (file.exists() ? formatDate(file.lastModified()) : "N/A"));
    }
}
