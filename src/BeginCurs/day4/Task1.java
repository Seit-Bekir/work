package BeginCurs.day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array\n");
        int length = scanner.nextInt();
        int[] array = new int[length];
        Random random = new Random();
        int bigestE=0;
        int equalsOne=0;
        int chet=0;
        int summ=0;
        for(int i=0;i<array.length;i++){
            array[i]= random.nextInt(10);
        }
        for (int j=0;j<array.length;j++) {
            System.out.print(array[j]+" ");
            if(array[j]>8)bigestE++;
            if(array[j]==1)equalsOne++;
            if(array[j]%2==0&&array[j]>0)chet++;
            summ=summ+array[j];
        }
        System.out.println("");
        System.out.println("больше 8 = "+bigestE);
        System.out.println("Равные 1 = "+equalsOne);
        System.out.println("Четных = "+chet);
        System.out.println("Не четные = "+(array.length-chet));
        System.out.println("Сумма = "+summ);

    }
}
