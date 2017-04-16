import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



//Create By Farhat ABU Dayyah
public class Driver extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		// pane to show Rectangles
		Pane pane = new Pane();
		// border pane to show every thing in interface
		BorderPane border = new BorderPane();
		// grid pane to set label and Text filed
		GridPane grid = new GridPane();

		VBox vbox1 = new VBox(5);//Vbox1 to set grid pane
		vbox1.setAlignment(Pos.CENTER);

		//****************************************

		HBox hbox2 = new HBox(5);
		hbox2.setAlignment(Pos.CENTER);
	//*****************************************************************
		Rectangle rec1 = new Rectangle(350, 150);
		rec1.setStroke(Color.BLACK);
		rec1.setFill(Color.WHITE);
		rec1.setX(5); //set x plan to bo$$ Rectangle
		rec1.setY(5);//set y plan to bo$$ Rectangle
		Rectangle rec2 = new Rectangle(40, 50);
		rec2.setX(50); //set x plan to Rectangle 2
		rec2.setY(50);//set y plan to Rectangle 2
		rec2.setStroke(Color.BLACK);//color stroke stroke Rectangle 2
		rec2.setFill(Color.BROWN);// color fill Rectangle 2
		Rectangle rec3 = new Rectangle(50, 20);
		rec3.setX(160);//set x plan to Rectangle 3
		rec3.setY(50);//set y plan to Rectangle 3
		rec3.setStroke(Color.BLACK);//color stroke stroke Rectangle 3
		rec3.setFill(Color.LIGHTBLUE);//color fill Rectangle 3

		pane.getChildren().addAll(rec1, rec2, rec3);
		//****************************************************
		Label lbel1 = new Label("Two Rectangle intersect?No");
		hbox2.getChildren().add(lbel1);//add label1 to hBox2
		//create button
		Button button = new Button("Redraw Rectangle");
		button.setAlignment(Pos.CENTER_LEFT);
		vbox1.getChildren().addAll(grid,button);

		border.setTop(hbox2);
		border.setCenter(pane);
		border.setBottom(vbox1);

		//there are here set for 11 label
		Label lbel2 = new Label("Rectangle 1 info: ");
		Label lbel3 = new Label("Rectangle 2 info: ");
		Label lbel4 = new Label("X: ");
		Label lbel5 = new Label("Y: ");
		Label lbel6 = new Label("Width: ");
		Label lbel7 = new Label("Hight: ");
		Label lbel8 = new Label("X: ");
		Label lbel9 = new Label("Y: ");
		Label lbel10 = new Label("Width: ");
		Label lbel11 = new Label("Hight: ");
		//there are here set for 8 text field
		TextField textfield1 = new TextField("50");
		TextField textfield2 = new TextField("50");
		TextField textfield3 = new TextField("40");
		TextField textfield4 = new TextField("50");
		TextField textfield5 = new TextField("160");
		TextField textfield6 = new TextField("50");
		TextField textfield7 = new TextField("50");
		TextField textfield8 = new TextField("20");

		// set max width for 8 text field//
		textfield1.setMaxWidth(50);
		textfield2.setMaxWidth(50);
		textfield3.setMaxWidth(50);
		textfield4.setMaxWidth(50);
		textfield5.setMaxWidth(50);
		textfield6.setMaxWidth(50);
		textfield7.setMaxWidth(50);
		textfield8.setMaxWidth(50);
		//there here to add all label and text field  to grid pane
		grid.add(textfield1, 4, 1);
		grid.add(textfield2, 4, 2);
		grid.add(textfield3, 4, 3);
		grid.add(textfield4, 4, 4);
		grid.add(lbel4, 3, 1);
		grid.add(lbel5, 3, 2);
		grid.add(lbel6, 3, 3);
		grid.add(lbel7, 3, 4);
		grid.add(lbel2, 3, 0);
		grid.add(lbel3, 5, 0);
		grid.add(textfield5, 6, 1);
		grid.add(textfield6, 6, 2);
		grid.add(textfield7, 6, 3);
		grid.add(textfield8, 6, 4);
		grid.add(lbel8, 5, 1);
		grid.add(lbel9, 5, 2);
		grid.add(lbel10, 5, 3);
		grid.add(lbel11, 5, 4);
		grid.setVgap(10);
		grid.setHgap(10);




		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				rec2.setX(Double.parseDouble(textfield1.getText()));
				rec2.setY(Double.parseDouble(textfield2.getText()));
				rec2.setWidth(Double.parseDouble(textfield3.getText()));
				rec2.setHeight(Double.parseDouble(textfield4.getText()));
				rec3.setX(Double.parseDouble(textfield5.getText()));
				rec3.setY(Double.parseDouble(textfield6.getText()));
				rec3.setWidth(Double.parseDouble(textfield7.getText()));
				rec3.setHeight(Double.parseDouble(textfield8.getText()));
			}
		});
		Scene scane = new Scene(border, 360, 370);
		stage.setScene(scane);
		stage.setTitle("Task2");
		stage.show();
	}


}