import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        String nameOfTheBook;
        int recomendedAge;

        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            nameOfTheBook = scanner.nextLine();
            if(nameOfTheBook.isEmpty()) {
                break;
            }
            System.out.println("Input age recommendation:");
            recomendedAge = Integer.parseInt(scanner.nextLine());

            books.add(new Book(nameOfTheBook, recomendedAge));
        }

        System.out.printf("%d books in total.%n%nBooks:%n", books.size());
//        for (Book book : books) {
//            System.out.println(book);
//        }

        System.out.println("-------");
        Collections.sort(books, new BookComparator());

        for (Book book : books) {
            System.out.println(book);
        }



    }

}
