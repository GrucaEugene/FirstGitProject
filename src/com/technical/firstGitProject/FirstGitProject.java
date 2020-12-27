package com.technical.firstGitProject;

import java.util.Arrays;

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


    public static void main(String[] args) {

        int[][] arr = {
                {1, 5, 7, 8, 9},
                {7, 8, 1, 3, 4},
                {8, 6, 3, 5, 0},
                {1, 5, 9, 7, 5},
                {13, 9, 1, 3, 4}
        };

        System.out.println(showBottomLeftElement(arr));
        System.out.println(showFifthStringOfArray(arr));
    }
}
