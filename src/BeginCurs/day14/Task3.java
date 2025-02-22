package BeginCurs.day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(parseFileToStringList().toArray()));
    }

    public static List<Person> parseFileToStringList() {
        File file = new File("people.txt");
        List<Person> person = null;
        try (Scanner scanner = new Scanner(file)) {
            person = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] s = line.split(" ");

                if (Integer.parseInt(s[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                person.add(new Person(s[0],Integer.parseInt(s[1])));
            }
            return person;
        } catch (FileNotFoundException e) {
            System.out.println("File not find");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
            // System.exit(0);
        }
        return null;
    }
}

