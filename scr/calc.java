import java.util.Scanner; 

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 2 числа ");
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        System.out.println(a1 + a2);
        scanner.close();
    }
}