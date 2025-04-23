import java.util.Scanner;  // для ввода с клавиатуры

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 2 числа ");
        int a1 = scanner.nextLine();
        int a2 = scanner.nextLine();
        System.out.println(a1 + a2);
    }
}