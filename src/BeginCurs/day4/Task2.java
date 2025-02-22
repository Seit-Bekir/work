package BeginCurs.day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int [] array = new int[100];
        Random random = new Random();
        for (int i=0;i<100;i++){
            array[i]=random.nextInt(10000);
        }
        int max=0;
        int min = 10000;
        int sum=0;
        int count=0;
        for(int element:array){
            if(element>max)max=element;
            if(element<min)min=element;
            if (element%10==0) {count++; sum+=element;}
        }
        System.out.println("min = "+min+"\nmax = "+max);
        System.out.println("0 - "+count+"\nsum = "+sum);

    }
}
