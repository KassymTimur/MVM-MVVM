public class DataPresenter {
    private DataModel model;
    private ConsoleView view;

    public DataPresenter(DataModel model, ConsoleView view) {
        this.model = model;
        this.view = view;
    }

    public void displayCurrentData() {
        view.displayData(model.getData());
    }

    public void updateData() {
        String newData = view.getUserInput("Enter new data: ");
        model.updateData(newData);
        displayCurrentData();
    }

    public void appendMoreData() {
        String moreData = view.getUserInput("Enter another piece of data: ");
        model.appendData(moreData);
        view.displayData(model.getData());
    }
}
