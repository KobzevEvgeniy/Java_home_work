package org.example;
import java.util.Random;
import java.util.Arrays;


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
        System.out.println();

        System.out.printf("3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE " +
                "сохранить в массив m1 \n");
        int s=Short.MAX_VALUE;
        System.out.printf("Диапазон от "+i+" до Short.MAX_VALUE= "+s+", кратное числу n= " +n+ ":");
        System.out.println();
        int[] calculate = new int[s];
        int count=0;
        for (int j = i; j < s; j++) {
            if (j%n==0) {
                calculate[j]=j;
                if (j!=0) count++;
            }
        }

        int[] m1=new int[count];
        int k=0;
        for (int j = 0; j < calculate.length & k< m1.length ; j++) {
             if (calculate[j] != 0){
                    m1[k] = calculate[j];
                    k++;
            }
        }
        System.out.println(Arrays.toString(m1));
        System.out.println();

        System.out.printf("4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE " +
                "до i и сохранить в массив m2 \n");
        int min_number=Short.MIN_VALUE;
        System.out.printf("Диапазон от "+i+" до Short.MIN_VALUE ="+min_number+", некратное числу n= " +n+ ":");
        System.out.println();
        int len=-1*min_number+i;


        int[] calculate2 = new int[len];
        int count2=0;
        for (int j = 0; j < len && min_number<i; j++) {
            min_number++;
            if (min_number%n !=0) {
                calculate2[j]=min_number;
                if (j!=0) count2++;
            }
        }

        int[] m2=new int[count2];
        int l=0;
        for (int j = 0; j < calculate2.length & l< m2.length ; j++) {
            if (calculate2[j] != 0){
                m2[l] = calculate2[j];
                l++;
            }
        }
        System.out.println(Arrays.toString(m2));

    }
}