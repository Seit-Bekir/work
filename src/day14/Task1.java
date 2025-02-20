package day14;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        while (true) {
           int x =scanner.nextInt();
           if(x==0){
               try {
                   throw new IOException();
               } catch (IOException e) {

               e.printStackTrace();}
           }
       }

    }
}
