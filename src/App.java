import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent combo_box = FXMLLoader.load(getClass().getResource("/assets/view/Combo.fxml"));
        stage.setScene(new Scene(combo_box));
        stage.setTitle("David Basantes");
        stage.show();
    }
}