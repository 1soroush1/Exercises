import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input;

        do {

            input = scanner.nextLine();
            String[] inputs = input.split(",");
            String command = inputs[0];

            switch (command) {
                case "1":
                    String name = inputs[1];
                    String author = inputs[2];
                    int year = Integer.parseInt(inputs[3]);
                    books.add(new Book(name, author, year));
                    break;

                case "2":
                    books.stream()
                            .sorted(Comparator.comparing(Book::getYear).reversed())
                            .map(Book::toString).forEach(System.out::println);
                    break;

                case "3":
                    books.stream()
                            .sorted(Comparator.comparing(Book::getYear))
                            .map(Book::toString).forEach(System.out::println);
                    break;
                case "4":
                    String authorName = inputs[1];
                    books.stream().filter(book -> book.getAuthorName().contains(authorName)).forEach(System.out::println);
                    break;

                case "5":
                    String bookName = inputs[1];
                    books.stream().filter(book -> book.getBookName().contains(bookName)).forEach(System.out::println);
                    break;

                case "6":
                    String bookAuthor = inputs[1];
                    int count = (int) books.stream().filter(book -> book.getAuthorName().equals(bookAuthor)).count();
                    System.out.println(count);
                    break;

                case "7":
                    int n = Integer.parseInt(inputs[1]);
                    books.stream().limit(n).map(Book::toString).forEach(System.out::println);
                    break;

                case "8":
                    String first = books.get(0).toString();
                    System.out.println(first);
                    break;
                case "9":
                    String last = books.get(books.size() - 1).toString();
                    System.out.println(last);
                    break;
            }



        } while (!input.equals("0"));

        scanner.close();

    }
}

class Book {
    private String bookName;
    private String authorName;
    private int year;

    public Book(String bookName, String authorName, int year) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.year = year;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return bookName + " written by " + authorName + " in " + year;
    }
}