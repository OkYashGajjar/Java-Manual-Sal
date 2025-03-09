//// Remove or modify package declaration to match your project structure
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.StackPane;
//import javafx.scene.control.Label;
//import javafx.stage.Stage;
//
//public class _9_1_JavaFxAndUI extends Application {
//    @Override
//    public void start(Stage primaryStage) {
//        StackPane root = new StackPane();
//
//        try {
//            // Load image from file
//            FileInputStream fin = new FileInputStream("D:/Manali/PicsArt_11-15-08.19.32.jpg");
//            Image img = new Image(fin);
//            ImageView imgview = new ImageView(img);
//
//            // Create a label with an image
//            Label L = new Label("Rajesh Patel", imgview);
//            root.getChildren().add(L);
//        } catch (FileNotFoundException e) {
//            System.out.println("Error: Image file not found! " + e.getMessage());
//        }
//
//        Scene scene = new Scene(root, 350, 350);
//        primaryStage.setTitle("Label Demo");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
