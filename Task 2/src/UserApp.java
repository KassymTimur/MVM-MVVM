public class UserApp {
    public static void main(String[] args) {
        UserModel model = new UserModel();
        UserView view = new UserView();
        UserViewModel viewModel = new UserViewModel(model, view);

        while (true) {
            view.showMenu();
            String option = view.getUserInput("Choose an option: ");

            switch (option) {
                case "1":
                    viewModel.addUser();
                    break;
                case "2":
                    viewModel.displayUsers();
                    break;
                case "3":
                    System.out.println("Exiting...");
                    view.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
