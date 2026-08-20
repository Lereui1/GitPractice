import java.util.Scanner;

public class Welcome {

    public String inputName() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите пожалуйста имя: ");

        return scanner.nextLine();
    }

    public void greetUser(String name) {

        System.out.println("Hello, " + name + "! Welcome to my Git project! TEST TEST");
    }
}
