package classes;

public class book {
    private String title;
    private String author;
    private int year;

    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    // Конструктор
    public book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Метод для вывода информации
    public void displayInfo() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Год: " + year);
    }

    // Точка входа
    public static void main(String[] args) {
        book book = new book("1984", "Джордж Оруэлл", 1949);
        book.displayInfo();
    }
}
