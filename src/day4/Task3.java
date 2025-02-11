package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int [][] array = new int[12][8];
        Random random = new Random();
        int index=0;
        int maxSum=0;
        for (int i=0;i<array.length;i++)
        {
            int sum = 0;
            for (int j = 0; j <array[i].length ; j++) {
                array[i][j]= random.nextInt(50);
                sum+=array[i][j];
            }
            if(maxSum<=sum){maxSum=sum;index=i;}
        }
        System.out.println("index = "+index+"\nmaxSum = "+maxSum);
    }
}
