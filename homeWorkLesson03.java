package homeWorkLesson3;

import javafx.scene.control.TextFormatter;

public class homeWorkLesson03 {
    public static void main(String[] args) {
        //1. Задать целочисленный массив, состоящий из элементов 0 и
        // 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

        int[] arr = {1, 0, 1, 0, 0, 1};
        printArr("before \t", arr);
        System.out.println();
        change(arr);
        printArr("after\t", arr);
        System.out.println(" ");
        System.out.println("***");

        //2. Задать пустой целочисленный массив длиной 100.
        // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
        int[] arr2 = new int[100];
        fillArray(arr2);
        printArr("Filled", arr2);
        System.out.println(" ");
        System.out.println("***");

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        // и числа меньшие 6 умножить на 2;
        int[] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        printArr("Some", arr3);
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6)
                arr3[i] *= 2;
        }
        System.out.println(" ");
        printArr("After", arr3);
        System.out.println(" ");
        System.out.println("***");

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
        // Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
        int side = 4;
        int[][] arr4 = new  int[side][side];
        fillDiagonal(arr4);
        printArr2("text",arr4);

        //5. Написать метод, принимающий на вход два аргумента: len и initialValue,
        //
        int[]





    }
    public static void printArr2(String message, int[][] inputArr) {
        System.out.print(message + ": ");
        for (int i = 0; i < inputArr.length; i++) {
            System.out.print(inputArr[i][i] + " ");
        }
    }
    //1.
    public static void printArr(String message, int[] inputArr) {
        System.out.print(message + ": ");
        for (int i = 0; i < inputArr.length; i++) {
            System.out.print(inputArr[i] + " ");
        }
    }

    public static void change(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }

    }

    //2
    public static void fillArray(int[] array) {

        for (int i = 0; i < array.length; i++)
            array[i] = i + 1;
        }
    //3
    public static void fillDiagonal(int[][] arr4) {
        for (int i = 0; i < arr4.length; i++){
            arr4[i][i] = 1;
            arr4[i][arr4.length - 1 - i] = 1;
        }

        }



           }


    





