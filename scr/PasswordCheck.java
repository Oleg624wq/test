import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String pass = "12345";
        String cpp = "0";
        while (cpp != "1") {
            System.out.print("Введите пароль: ");
            String cp = scanner.nextLine();
            if (cp.equals(pass)) {
                System.out.println("Введён верный пароль");
                cpp = "1";
                
            } else {
                System.out.println("Введён неверный пароль");
            }
            
        }
        
        scanner.close();
    }
}
