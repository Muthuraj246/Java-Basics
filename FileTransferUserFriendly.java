import java.io.*;
import java.util.Scanner;

public class FileTransferUserFriendly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Step 1: Get source and destination file names
            System.out.print("Enter source file name (e.g., source.txt): ");
            String sourceFile = sc.nextLine();

            System.out.print("Enter destination file name (e.g., destination.txt): ");
            String destinationFile = sc.nextLine();

            // Step 2: Get content from user to write to source file
            System.out.println("Enter text to save in the source file (type 'END' in a new line to finish):");
            PrintWriter writer = new PrintWriter(sourceFile);
            while (true) {
                String line = sc.nextLine();
                if (line.equalsIgnoreCase("END")) break;
                writer.println(line);
            }
            writer.close();

            // Step 3: Transfer content from source to destination
            FileInputStream fin = new FileInputStream(sourceFile);
            FileOutputStream fout = new FileOutputStream(destinationFile);

            int ch;
            while ((ch = fin.read()) != -1) {
                fout.write(ch);
            }
            fin.close();
            fout.close();

            // Step 4: Show success message and destination file content
            System.out.println("\nFile transfer successful!");
            System.out.println("Contents of '" + destinationFile + "':\n");

            BufferedReader br = new BufferedReader(new FileReader(destinationFile));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        sc.close();
    }
}