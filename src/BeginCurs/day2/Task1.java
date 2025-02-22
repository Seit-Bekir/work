package BeginCurs.day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество этажей:");
        int florCount = scanner.nextInt();
        if (florCount<=0){
            System.out.println(" Не корректное количетво этажей");
        }
        else if(florCount>=1 && florCount<=4)
        {
            System.out.println("Малоэтажный дом");
        }
        else if(florCount>4 && florCount<=8){
            System.out.println("Среднеэтажный дом");
        }
        else if(florCount>8)
        {
            System.out.println("Многоэтажный дом");
        }
    }
}
