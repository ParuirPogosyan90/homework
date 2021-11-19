package author;

import java.util.Scanner;

public class AuthorText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AuthorStorage authorStorage = new AuthorStorage();
        System.out.println("PLEASE INPUT AUTHORS");
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println("please input author's name");
            String name = scanner.next();
            System.out.println("please input author's surname");
            String surname = scanner.next();
            System.out.println("please input author's email");
            String email = scanner.next();
            System.out.println("please input author's gender");
            String gender = scanner.next();
            System.out.println("please input author's age");
            int age = scanner.nextInt();
            Author author = new Author(name, surname, age, email, gender);
            authorStorage.add(author);
        }

        authorStorage.print();
    }
}
