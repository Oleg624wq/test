package classes.Animals;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.eat();  // Вывод: "Кошка ест рыбу"
        cat.sleep(); // Вывод: "Животное спит"

        dog.eat();  // Вывод: "Собака ест кость"
        dog.sleep(); // Вывод: "Животное спит"
    }
}

