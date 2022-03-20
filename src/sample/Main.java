package sample;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        StackPane pane = new StackPane();
        Scene scene = new Scene(pane, 800, 450);
        Canvas canvas = new Canvas(800,450);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        MyRectangle r1 = new MyRectangle(new MyPoint(175, 100), 250, 450, MyColor.GREY);
        r1.draw(gc);
        MyOval o1 = new MyOval(new MyPoint(175, 100), 125,225, MyColor.SALMON);
        o1.draw(gc);
        MyRectangle r2 = new MyRectangle(new MyPoint(220, 150), 150, 360, MyColor.LIGHTBLUE);
        r2.draw(gc);
        MyOval o2 = new MyOval(new MyPoint(220, 150), 75,180, MyColor.PINK);
        o2.draw(gc);
        MyRectangle r3 = new MyRectangle(new MyPoint(265, 175), 100, 270, MyColor.PLUM);
        r3.draw(gc);
        MyOval o3 = new MyOval(new MyPoint(265, 175), 50,135, MyColor.DARKPINK);
        o3.draw(gc);
        MyLine l1 = new MyLine(new MyPoint(0, 0), new MyPoint(800, 450), MyColor.BLACK);
        l1.draw(gc);
        pane.getChildren().add(canvas);
        primaryStage.setTitle("Shapes");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}

