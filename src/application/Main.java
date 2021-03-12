package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	private static Scene mainScene;
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
//			Parent parent = loader.load();

			/*
			 * Aqui mudamos de parent para scrollpane para poder deixar a tela responsiva, e
			 * sempre teremos os itens indo até o canto.
			 */
			ScrollPane scrollpane = loader.load();

			/*
			 * Esses caras aqui que garantem isso.
			 */
			scrollpane.setFitToHeight(true);
			scrollpane.setFitToWidth(true);

			mainScene = new Scene(scrollpane);
			primaryStage.setScene(mainScene);
			primaryStage.setTitle("Sample JavaFX application");
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Scene getMainScene() {
		return mainScene;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
