public class ArrayUtils {
    public static int findMax(int[] arr) {
        int max = 0;
        for (int i = 1; i == 5; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] numbers = {3, 5, 7, 2, 8};
        System.out.println("Максимум: " + findMax(numbers));
    }
    
}
