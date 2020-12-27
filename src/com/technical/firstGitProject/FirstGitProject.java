package com.technical.firstGitProject;

import java.util.Arrays;
import java.util.Random;

public class FirstGitProject {

    /*** Выполнить любое из предидущих заданий с использованием гит
     Приложить ссылку на репозиторий
     Важно: не менее 5ти коммитов (слишком много тоже не надо)*/


    public static int showBottomLeftElement(int[][] arr) {
        return (arr[arr.length - 1][0]);
    }

    public static String showFifthStringOfArray(int[][] arr) {
        return Arrays.toString(arr[4]);
    }

    public static String showSecondColumnOfArray(int[][] arr) {
        StringBuilder secondColumnOfArray = new StringBuilder("{ ");
        for (int j = 0, i = 1; j < arr.length; j++) {
            if (j == arr.length - 1) {
                secondColumnOfArray.append(arr[j][i]).append(" }");
                break;
            }
            secondColumnOfArray.append(arr[j][i]).append(", ");
        }
        return secondColumnOfArray.toString();
    }

    public static String getFilledTwoDimensionalArray(int[][] newArr) {
        Random random = new Random();
        int j = 0;
        for (int i = 0; i < newArr[j].length; i++) {
            newArr[j][i] = random.nextInt(100);
        }
        j++;
        for (int i = 0; i < newArr[j].length; i++) {
            newArr[j][i] = random.nextInt(100);
        }
        return Arrays.deepToString(newArr);
    }


        public static void main(String[] args){

            int[][] arr = {
                    {1, 5, 7, 8, 9},
                    {7, 8, 1, 3, 4},
                    {8, 6, 3, 5, 0},
                    {1, 5, 9, 7, 5},
                    {13, 9, 1, 3, 4}
            };

            System.out.println(showBottomLeftElement(arr));
            System.out.println(showFifthStringOfArray(arr));
            System.out.println(showSecondColumnOfArray(arr));

            System.out.println("Заполненный случайными числами двухмерный массив:");
            int[][] newArr = new int[2][10];
            System.out.println(getFilledTwoDimensionalArray(newArr));
        }
}

