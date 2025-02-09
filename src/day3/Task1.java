package day3;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while (true){
            System.out.println("Enter city");
            String city = scanner.nextLine();
            city=city.toLowerCase();
            if (city.toLowerCase().equals("stop"))
            {break;}
            switch (city){
                case "москва":
                case "владивасток":
                case "ростов":
                    System.out.println("Россия\n");
                    break;
                case "рим":
                case "милан":
                case "тулин":
                    System.out.println("Италия\n");
                    break;
                case "ливерпуль":
                case "манчестер":
                case "лондон":
                    System.out.println("Англия\n");
                    break;
                case "берлин":
                case "мюнхен":
                case "кельн":
                    System.out.println("Германия\n");
                    break;
                default:
                    System.out.println("Неизвесная страна");
                    break;
            }
        }
    }
}
