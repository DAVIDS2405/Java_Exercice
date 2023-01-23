import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class App extends Application {
    public static void main(String[] args) {
      launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
      Parent calculadora = FXMLLoader.load(getClass().getResource("/assets/view/Calculator.fxml"));
      Scene scene = new Scene(calculadora);
      scene.setFill(Color.TRANSPARENT);
      stage.setScene(scene);
     
      stage.show();
    }
    
    
}