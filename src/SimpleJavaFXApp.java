import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SimpleJavaFXApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello JavaFX!");

        Label label = new Label("Hello, JavaFX!");
        Button button = new Button("Click Me");

        StackPane root = new StackPane();
        root.getChildren().addAll(label, button);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
