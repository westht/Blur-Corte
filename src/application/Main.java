package application;
	

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.application.Application;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;

import org.omg.Messaging.SyncScopeHelper;


public class Main extends Application {

	private Pane mypane;
	
	/**
	 * crea el Stage
	 */
	
    @Override
    public void start(Stage stage) throws IOException {
    
    	/**
    	 * carga el controlador y la vista fxml 
    	 */

    	FXMLLoader loader = new FXMLLoader(
            getClass().getResource(
                "../fxml/forest.fxml"
            )
        );
    	//loader.setController(new SetBlur());
        mypane = (Pane) loader.load();

        /**
         * titula y coloca la escena en el stage
         */
        stage.setTitle("Where's the squirrel?");
        stage.setScene(new Scene(mypane));
        stage.show();
    }
   
    /**
     * la clase controladora que añade un efecto a la imagen
     */
    class SetBlur {
    	
    	@FXML
        private ImageView imageView;       

/**
 * inicializa al igual que el constructor pero permite acceder al componente imageView ya creado en fxml
 */
    	@FXML
        public void initialize() {           
                 imageView.setEffect(new GaussianBlur(10));
        }
    	
    }
   
    /**
     * arranca la aplicación
     * @param args
     */
    
    public static void main(String[] args) {
        launch(args);
    }
    
}