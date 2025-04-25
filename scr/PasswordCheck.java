import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class PasswordCheck {
    private static final String CORRECT_HASH = "5994471abb01112afcc18159f6cc74b4f511b99806da59b3caf5a9c173cacfc5";
    public static void main(String[] args) {
        int attempts = 3;
        boolean accessGranted = false;
        try (Scanner scanner = new Scanner(System.in)) {
            while (attempts > 0 && !accessGranted) {
                System.out.print("Введите пароль: ");
                String cp = scanner.nextLine();
                if (cp == null || cp.isEmpty()) {
                    System.out.println("Ошибка: пароль не может быть пустым!");
                    return;
                }
                if (checkPassword(cp)) {
                    System.out.println("Введён верный пароль");
                    accessGranted = true;
                    
                } else {
                    System.out.println("Введён неверный пароль");
                    attempts--;
                    if (attempts > 0) {
                        System.out.println("Неверный пароль. Ожидайте...");
                        try { Thread.sleep(2000); } catch (InterruptedException e) {}
                    }
                }   
            }
            if (!accessGranted) System.out.println("Система заблокирована!");
        }
    }
    public static boolean checkPassword(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");  // Может выбросить NoSuchAlgorithmException
            byte[] hash = digest.digest(input.getBytes(StandardCharsets.UTF_8));
            StringBuilder hexString = new StringBuilder();

            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }

            return hexString.toString().equals(CORRECT_HASH);
        } catch (NoSuchAlgorithmException e) {  // Явная обработка исключения
            System.err.println("Ошибка: алгоритм SHA-256 не поддерживается!");
            return false;
        } catch (Exception e) {  // Общая обработка других ошибок
            System.err.println("Неизвестная ошибка: " + e.getMessage());
            return false;
        }
    }
    
}
