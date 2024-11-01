import java.util.List;

public class UserViewModel {
    private UserModel model;
    private UserView view;

    public UserViewModel(UserModel model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void addUser() {
        String name = view.getUserInput("Enter user name: ");
        model.addUser(name);
        System.out.println("User added!");
    }

    public void displayUsers() {
        List<String> users = model.getUsers();
        view.displayUsers(users);
    }
}
