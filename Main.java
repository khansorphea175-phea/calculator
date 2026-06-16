import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource("/View.fxml"));

        Scene scene = new Scene(loader.load());
        
        stage.setScene(scene);
        stage.setTitle("Mini Project 001");
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/assets/institute-of-technology-of-cambodia-logo.jpg")));
        stage.show();
    }
}
