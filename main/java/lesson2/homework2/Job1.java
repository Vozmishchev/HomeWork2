package lesson2.homework2;

import java.util.Arrays;

public class Job1 {
        public static void main(String[] args) {
                //              invertArr();
                //              massYmn();
                //              Multiplication();
                //              OneZeroMassiv();
                                MinMax();
        }

        /*1.Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
            С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
        public static void invertArr() {
                int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
                for (int i = 0; i < arr.length; i++) {
                        if (arr[i] == 1)
                                System.out.print(" 0 ");
                        if (arr[i] == 0) {
                                System.out.print(" 1 ");
                        }
                }
        }

         /*2.Задать пустой целочисленный массив размером 8.
             С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21.
          */

        public static void massYmn() {
                int[] arr = new int[8];
                int i;

                for (i = 0; i < arr.length; i++) {
                        arr[i] = i * 3;
                        System.out.print(" " + arr[i]);
                }
        }

       /* 3.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        */
        public static void Multiplication() {
                int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
                int i;

                for (i = 0; i < arr.length; i++) {
                        if (arr[i] < 6) {
                                arr[i] *= 2;
                        }
                        System.out.print(" " + arr[i]);
                }
        }


        public static void OneZeroMassiv(){

        /*4.Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
           и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
         */

                int N = 5;
                for (int i = 0; i < N; i++) {
                        for (int j = 0; j < N; j++)
                                if (i == j || N - i - 1 == j)
                                        System.out.print(" 1 ");
                                else
                                        System.out.print(" 0 ");
                        System.out.println();
                }

        }

        /* 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы */
        public static void MinMax () {

                int[] n = {367,-200, 30, 40, 1300, -20, 0, 77};

                Arrays.sort(n); // Вычитал про этот класс из литературы когда читал про массивы.

                System.out.println(" Минимальное число: " + n[0]);
                System.out.println(" Максимальное число: " + n[n.length - 1]);
        }

}
