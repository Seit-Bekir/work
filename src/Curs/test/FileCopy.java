import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.*;

public class FileCopy {

    // Method 1: Using FileInputStream and FileOutputStream
    public static void copyUsingStreams(String sourcePath, String destPath) throws IOException {
        try (FileInputStream fis = new FileInputStream(sourcePath);
                FileOutputStream fos = new FileOutputStream(destPath)) {

            byte[] buffer = new byte[8192]; // 8KB buffer
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied using streams");
        }
    }

    // Method 2: Using FileChannel (typically faster for large files)
    public static void copyUsingChannel(String sourcePath, String destPath) throws IOException {
        try (FileChannel sourceChannel = new FileInputStream(sourcePath).getChannel();
                FileChannel destChannel = new FileOutputStream(destPath).getChannel()) {

            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
            System.out.println("File copied using channel");
        }
    }

    // Method 3: Using Files class (most convenient, recommended for modern Java)
    public static void copyUsingFiles(String sourcePath, String destPath) throws IOException {
        Path source = Paths.get(sourcePath);
        Path destination = Paths.get(destPath);

        Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File copied using Files class");
    }

    // Method 4: Using buffered streams (good for text files)
    public static void copyUsingBufferedStreams(String sourcePath, String destPath) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourcePath));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destPath))) {

            byte[] buffer = new byte[8192];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            System.out.println("File copied using buffered streams");
        }
    }

    // Method 5: Copy with progress tracking
    public static void copyWithProgress(String sourcePath, String destPath) throws IOException {
        File sourceFile = new File(sourcePath);
        long fileSize = sourceFile.length();
        long totalBytesRead = 0;

        try (FileInputStream fis = new FileInputStream(sourcePath);
                FileOutputStream fos = new FileOutputStream(destPath)) {

            byte[] buffer = new byte[8192];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                totalBytesRead += bytesRead;

                // Calculate and display progress
                int progress = (int) ((totalBytesRead * 100) / fileSize);
                System.out.print("\rProgress: " + progress + "%");
            }
            System.out.println("\nFile copied with progress tracking");
        }
    }

    public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destFile = "destination.txt";

        try {
            // Create a sample file for testing
            createSampleFile(sourceFile);

            // Test all copying methods
            System.out.println("Testing different file copy methods:");
            System.out.println("------------------------------------");

            // Method 1
            copyUsingStreams(sourceFile, destFile + "_streams");

            // Method 2
            copyUsingChannel(sourceFile, destFile + "_channel");

            // Method 3
            copyUsingFiles(sourceFile, destFile + "_files");

            // Method 4
            copyUsingBufferedStreams(sourceFile, destFile + "_buffered");

            // Method 5
            copyWithProgress(sourceFile, destFile + "_progress");

            System.out.println("\nAll copy operations completed successfully!");

        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Helper method to create a sample file for testing
    private static void createSampleFile(String path) throws IOException {
        try (FileWriter writer = new FileWriter(path)) {
            // Create a 1MB test file
            for (int i = 0; i < 1024 * 1024; i++) {
                writer.write("Test data line " + i + "\n");
            }
        }
        System.out.println("Created sample file: " + path);
    }
}