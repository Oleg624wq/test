import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int a2 = scanner.nextInt();
        System.out.println("Сумма равна:" + (a1 + a2));
        System.out.println("Разность равна: " + (a1 - a2));
        System.out.println("Произведение равно: " + (a1 * a2));
        if (a2 != 0){
            System.out.println("Частное равно: " + (a1 / a2));
        } else {
            System.out.println("На 0 делить нельзя");
        }
        scanner.close();
    }
    
}
