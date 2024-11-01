import java.util.List;
import java.util.Scanner;

public class UserView {
    private Scanner scanner;

    public UserView() {
        scanner = new Scanner(System.in);
    }

    public void showMenu() {
        System.out.println("1. Add user");
        System.out.println("2. Display users");
        System.out.println("3. Exit");
    }

    public String getUserInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public void displayUsers(List<String> users) {
        System.out.println("User List:");
        for (String user : users) {
            System.out.println("- " + user);
        }
    }

    public void close() {
        scanner.close();
    }
}
