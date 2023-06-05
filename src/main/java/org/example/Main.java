package org.example;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        System.out.printf("1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i  ");

        int i ;
        Random random = new Random( );
        i= random.nextInt(2000);
        System.out.println();
        System.out.printf("Ответ i="+i);
        System.out.println();

        System.out.printf("2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа \n");
        int n;
        n=Integer.highestOneBit(i);
        System.out.printf("Ответ n="+n);

    }
}