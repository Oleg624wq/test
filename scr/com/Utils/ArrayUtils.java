package com.Utils;

import java.util.Arrays;

public class ArrayUtils {  
    public static void reverseArrayCopy(int[] arr){  // функция без возврата
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            rev[arr.length - i - 1] = arr[i];
        }
        System.out.println(Arrays.toString(rev));
    }
    public static int[] reverseArray(int[] arr){  //Функция с возвратом int[]
        int[] rev = new int[5];
        System.arraycopy(arr, 0, rev, 0, arr.length);
        for (int i = 0; i < arr.length; i++){
            rev[i] = arr[arr.length-i-1];
        }
        return rev;
    }
    public static int findMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8};
        System.out.println("Максимум: " + findMax(numbers));
        int[] res = reverseArray(numbers);
        System.out.println("Перевёрнутый массив: " + Arrays.toString(res));
        reverseArrayCopy(numbers);
    }
    
}
