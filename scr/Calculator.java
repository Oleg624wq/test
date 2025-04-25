import java.util.Scanner;

public class Calculator {
    public static int add(int a, int b){
        return a + b;
    }
    public static int vich(int d, int f){
        return d + f;
    }
    public static int umn(int d, int f){
        return d * f;
    }
    public static int ch(int d, int f){
        return d / f;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int a2 = scanner.nextInt();
        System.out.println("Сумма равна:" + add(a1, a2));
        System.out.println("Разность равна: " + vich(a1, a2));
        System.out.println("Произведение равно: " + umn(a1, a2));
        if (a2 != 0){
            System.out.println("Частное равно: " + ch(a1, a2));
        } else {
            System.out.println("На 0 делить нельзя");
        }
        scanner.close();
    }
    
}
