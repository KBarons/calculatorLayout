import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {
    private Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        primaryStage.setTitle("Basic calculator");

        MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu("File");
        Menu menuEdit = new Menu("Edit");
        Menu menuView = new Menu("View");
        menuBar.getMenus().addAll(menuFile, menuEdit, menuView);

        TextField display = new TextField();

        Button btn0 = new Button("0");
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");
        Button btnAdd = new Button("+");
        Button btnSbstr = new Button("-");
        Button btnMltpl = new Button("*");
        Button btnDvd = new Button("/");
        Button btnRslt = new Button("=");

        GridPane grid = new GridPane ();
        grid.add(menuBar, 0,0, 5, 1);
        grid.add(display, 0, 1, 5, 1);
        grid.add(btn7, 0, 2);
        grid.add(btn8, 1, 2);
        grid.add(btn9, 2, 2);
        grid.add(btnAdd, 3, 2);
        grid.add(btn4, 0, 3);
        grid.add(btn5, 1, 3);
        grid.add(btn6,  2,3);
        grid.add(btnSbstr, 3, 3);
        grid.add(btn1, 0, 4);
        grid.add(btn2, 1, 4);
        grid.add(btn3, 2, 4);
        grid.add(btnMltpl, 3, 4);
        grid.add(btn0, 0, 5);
        grid.add(btnDvd, 1, 5);
        grid.add(btnRslt, 2, 5);

        Scene scene = new Scene(grid, 300, 300);
        scene.getStylesheets().add("Styles.css");
        window.setScene(scene);
        primaryStage.show();
    }
}
