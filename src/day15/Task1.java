package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/shoes.csv");
        File file2 = new File("src//missing_shoes.txt");
        try (Scanner scanner = new Scanner(file); PrintWriter printWriter = new PrintWriter(file2)) {
            String[] string;
            while (scanner.hasNextLine()) {
                String stringLine = scanner.nextLine();
                stringLine = stringLine.replaceAll("\\s+","");
                string = stringLine.split(";");
                if(Integer.parseInt(string[2])==0){
                    printWriter.println(string[0]+", "+string[1]+", "+string[2]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(0);
        }

    }
}
