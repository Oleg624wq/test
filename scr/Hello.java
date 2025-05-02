import java.util.Scanner; 

public class Hello {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Приветствую");
        String name = scanner.nextLine();
        System.out.println(name);
        scanner.close();
    }
}
