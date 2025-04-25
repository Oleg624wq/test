import java.util.Arrays;

public class ArrayUtils {
    public static int[] reverseArray(int[] arr){
        int[] rev = new int[5];
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
    }
    
}
