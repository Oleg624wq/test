import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();  // Генератор случайных чисел
        int secretNumber = random.nextInt(100) + 1;  // Число от 1 до 100
        Scanner scanner = new Scanner(System.in);
        int attempts = 0;
        boolean f = false;
        int guess = 0;

        while (attempts <= 10) {  // Бесконечный цикл
            System.out.print("Ваша догадка (1-100): ");
            try {
                guess = scanner.nextInt();
            } catch (Exception e){
                //attempts--;
                System.out.println("Вводите число!!!!!!!");
            }
            attempts++;

            if (guess == secretNumber) {
                System.out.println("Победа! Попыток: " + attempts);
                f = true;
                break;  // Выход из цикла
            } else if (guess < secretNumber) {
                System.out.println("Загаданное число БОЛЬШЕ");
            } else {
                System.out.println("Загаданное число МЕНЬШЕ");
            }
        }
        scanner.close();
        if (! f){
            System.out.println("Game Over");
        }
    }
}
