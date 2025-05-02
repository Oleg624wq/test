import java.util.Arrays;

public class everseArray {
    public static int[] reverseArrayCopyT(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }
    public static int[] reverseArrayCopyO(int[] arr) {
        if (arr == null) throw new IllegalArgumentException("Массив не может быть null");
        
        int[] reversed = new int[arr.length];
        System.arraycopy(arr, 0, reversed, 0, arr.length); // Копируем исходный массив
        
        // Переворачиваем скопированный массив
        for (int i = 0; i < reversed.length / 2; i++) {
            int temp = reversed[i];
            reversed[i] = reversed[reversed.length - 1 - i];
            reversed[reversed.length - 1 - i] = temp;
        }
        return reversed;
    }
    public static void main(String[] args) {
        int[] largeArray = new int[1_000_000]; // Большой массив для теста
        
        long start = System.nanoTime();
        int[] copy1 = reverseArrayCopyT(largeArray); // Обычный цикл
        long end = System.nanoTime();
        System.out.println("Обычный цикл: " + (end - start) + " нс");
        
        start = System.nanoTime();
        int[] copy2 = reverseArrayCopyO(largeArray); // С System.arraycopy()
        end = System.nanoTime();
        System.out.println("System.arraycopy(): " + (end - start) + " нс");
    }
}
