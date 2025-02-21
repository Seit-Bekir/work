package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(parseFileToStringList().toArray()));
        for (String s : parseFileToStringList()) {
            System.out.println(s);
        }
    }

    public static List<String> parseFileToStringList() {
        File file = new File("people.txt");
        List<String> stringList = null;
        try (Scanner scanner = new Scanner(file)) {
            stringList = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] s = line.split(" ");
               // for (String str : s) {
                    try {
                        int number = Integer.parseInt(s[1]);
                        if (number < 0) {
                            throw new RuntimeException();
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Не корректный возраст");
                        System.exit(0);
                    } catch (RuntimeException e) {
                        System.out.println("Некорректный входной файл");
                        System.exit(0);
                    }
                //}
                stringList.add(line);

            }
        } catch (FileNotFoundException e) {
            System.out.println("File not find");
        }
        return stringList;
    }
}
