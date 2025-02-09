package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number a:");
        int a = scanner.nextInt();
        System.out.println("Enter number b:");
        int b = scanner.nextInt();

        while ((a+1)<b){

            if(a%5==0&& a%10!=0){
                System.out.println(a);
            }
            a+=1;
        }

    }
}
