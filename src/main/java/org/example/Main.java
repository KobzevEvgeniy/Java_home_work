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

        System.out.printf("3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1 \n");
        int s=Short.MAX_VALUE;
        System.out.printf("диапазон от "+i+" до Short.MAX_VALUE "+s);
        System.out.println();
        int[] calculate = new int[s];
        int count=0;
        for (int j = i; j < s; j++) {
            if (j%n==0) {
                calculate[j]=j;
                if (j!=0) count++;
            }
        }
//        System.out.println(Arrays.toString(calculate);
//        System.out.println(count);
        int[] m1=new int[count];
        int k=0;
        for (int j = 0; j < calculate.length & k< m1.length ; j++) {
             if (calculate[j] != 0){
                    m1[k] = calculate[j];
                    k++;
            }
        }
        System.out.println(Arrays.toString(m1));
    }
}