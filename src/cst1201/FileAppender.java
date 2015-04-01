package cst1201;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author rkhatchadourian
 */
public class FileAppender {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\Temp\\midgrade.txt", false);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.println("More stuff.");
        printWriter.close();

        File inputFile = new File("midgrade1.txt");
        Scanner scanner = new Scanner(inputFile);

//        for (int i = 0; i < 4; i++) {
//            String aLine = scanner.nextLine();
//            System.out.println(aLine);
//        }

        while (scanner.hasNextLine()) { //if there's a next line.
            String aLine = scanner.nextLine(); //get the next line.
            System.out.println(aLine); //print it.
        }

        scanner.close(); //optional?
    }

}
