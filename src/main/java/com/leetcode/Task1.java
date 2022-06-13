package com.leetcode;
// todo
//  Подсчитайте сумму всех элементов на основной диагонали и всех элементов на дополнительной диагонали,
//  которые не являются частью основной диагонали


import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.method2();

    }

    public void method2(){
        Task1 task1 = new Task1();
        int[][] matrix = task1.megaArrayCreator(4);
        int sum = 0;
        for (int i = 0, j = matrix.length - 1; i < matrix.length; i++, j--) {
            sum += matrix[i][i];
            if (j != i) {
                sum += matrix[i][j];
            }
        }

        System.out.println(sum);
    }


    public void method1() {
        Task1 task1 = new Task1();
        int[][] array = task1.megaArrayCreator(4);
        int counter = -1;
        int result = 0;
        int d = 0;
        // todo true - chetnoe, false - nechetnoe

        boolean seredina = false;

        for (int i = 0; i < array.length; i++) {

            if (array.length == 1) {
                result += array[0][0];
                break;
            }

            if (seredina) counter--;
            else counter++;

            for (int k = 0; k < array.length; k++) {

                if ((k + counter) == ((array.length - 1) - counter)) {
                    result += array[i][k + counter];
                    seredina = true;
                    break;
                }

                if (array.length > (counter * 2)) {
                    result += array[i][k + counter] + array[i][(array.length - 1) - counter];
                    break;
                }

                if (array.length == (counter * 2)) {
                    result += array[i][array.length / 2] + array[i][(array.length / 2) - 1];
                    counter -= 1;
                    seredina = true;
                    break;
                }


            }

        }

        System.out.println(result);
    }



    public int[][] megaArrayCreator(int sizeMatrix) {
        Random random = new Random();
        int[][] arrays = new int[sizeMatrix][sizeMatrix];


        for (int i = 0; i < sizeMatrix; i++) {
            for (int k = 0; k < sizeMatrix; k++) {
                arrays[i][k] += random.nextInt(10);
            }
        }
        System.out.println(Arrays.deepToString(arrays));

        return arrays;
    }


}
