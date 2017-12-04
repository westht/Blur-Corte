package fxml;
	

import javafx.fxml.FXML;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;

public class BlurController {
	@FXML
	private ImageView imageView;
	private Ellipse ellipse;
	private Circle circle;

	@FXML
	public void setblur() {
		imageView.setEffect(new GaussianBlur(10));
	}
	@FXML
    public void setclip() {           
        ellipse = new Ellipse();
//        circle = new Circle((imageView.getFitWidth())*0.2);

        ellipse.centerXProperty().setValue(95);
        ellipse.centerYProperty().setValue(70);
        ellipse.radiusXProperty().setValue(70);
        ellipse.radiusYProperty().setValue(70);
        
//        importing and modifying sizes
//    	ellipse.radiusXProperty().setValue(imageView.getFitWidth()*0.1);
//    	ellipse.radiusYProperty().setValue(imageView.getFitHeight()*0.17);
        
        imageView.setClip(ellipse);
      }

	@FXML
	public void hundlerClose() {
		System.exit(0);
	}

}