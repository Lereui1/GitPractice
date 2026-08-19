import java.util.Scanner;

public class Welcome {

    public void sayHello() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите пожалуйста имя: ");

        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "! Welcome to my Git project!");

        scanner.close();
    }
}
