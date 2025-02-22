package BeginCurs.day14;

import java.io.*;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        File file = new File("input.txt");
        RandomFileData randomFileData = new RandomFileData();
        randomFileData.createFile(file);
        String string = "";
        int sum = 0;
        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                string = scanner.nextLine();
            }
            String[] strSplit = string.split(" ");
            if (strSplit.length != 10) {

                throw new FileErrorExeption();
            } else {
                for (String s : strSplit) {
                    int i = 0;
                    try {
                        i = Integer.parseInt(s);
                        System.out.print(i + " ");
                    } catch (NumberFormatException e) {
                        System.out.println("Не корректные числа в файле");
                    }
                    sum += i;
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл ненайден");
        } catch (FileErrorExeption e) {
            System.out.println("Некорректный входной файл");
        }


        System.out.println();
        System.out.println("Сумма чисел: " + sum);

    }


}


class FileErrorExeption extends Exception {

}


class RandomFileData {
    public RandomFileData() {

    }

    public void createFile(File file) {
        Random random = new Random();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            for (int i = 0; i < 10; i++) {
                bufferedWriter.write(random.nextInt(1, 1000) + " ");
            }
        } catch (IOException e) {
            System.out.println("Ошибка открытия файла");
        }
    }
}