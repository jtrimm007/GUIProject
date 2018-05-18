/**
 * -------------------------------------------------
 * File name: DataAccessLayer.java
 * Project name: GUIProject
 * -------------------------------------------------
 * Creator's name: Joshua Trimm
 * Email: joshua@trimwebdesign.com
 * Course and section: CISP 1020 A01
 * Creation date: Apr 13, 2018
 * -------------------------------------------------
 */

package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

/**
 * 
 * <b>Main</b>
 * <hr>
 * Date created: Apr 14, 2018
 * <hr>
 * @author Joshua Trimm
 */
public class Main extends Application {
	
	/**
	 * 
	 * Description: start
	 * @throws Exception
	 * Date: Apr 13, 2018
	 */
	@Override
	public void start(Stage primaryStage) {
		try {
			
			Parent rootFX = FXMLLoader.load(getClass().getResource("/application/FXMLBowlersTable.fxml"));
		

			
			Scene scene = new Scene(rootFX);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * Method description: main
	 * Date: Apr 14, 2018
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
