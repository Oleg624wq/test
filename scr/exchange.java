import java.util.Scanner;

public class exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Создаём сканер
        System.out.print("Введите сумму в USD: ");
        double usd = 0;
        try {
            usd = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Ввеедено не число");
        }  // Читаем ввод пользователя
        if (usd < 0){
            System.out.println("Число должно быть положительным");
        } else {
            double eur = usd* 0.85;
            double rub = usd * 90;  // Конвертация
            System.out.println(usd + " USD = " + rub + " RUB " +
            eur + "EUR = " + rub + " RUB");  // Вывод результата
        }
        scanner.close();
    }
}
