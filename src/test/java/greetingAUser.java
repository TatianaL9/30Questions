import java.util.Scanner;

public class greetingAUser {
    public static void main(String[] args) {
        System.out.println("Say your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greetUser(name);

    }
    public static void greetUser(String name) {
        System.out.println("Hi " + name);
    }

}
