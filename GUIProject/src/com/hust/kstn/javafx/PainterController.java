package com.hust.kstn.javafx;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.RadioButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class PainterController {
	@FXML
    private RadioButton eraserButton;

    @FXML
    private RadioButton penButton;
    
    @FXML
    private ToggleGroup toolButtonsGroup;
    
	@FXML
	private Pane drawingAreaPane;
	
	private Color color;
	private int thickness;
	
	
	@FXML
	void clearButtonPressed(ActionEvent event) {
		drawingAreaPane.getChildren().clear();
		
	}
	
	@FXML
	void drawingAreaMouseDragged(MouseEvent event) {
		if (toolButtonsGroup.getSelectedToggle() == null) return;
		//System.out.println(drawingAreaPane.getLayoutBounds().getMaxX() + " " + drawingAreaPane.getLayoutBounds().getMaxY());
		
		if (event.getX() < thickness || event.getY() < thickness) return;
		if (event.getX() > drawingAreaPane.getLayoutBounds().getMaxX()-thickness || event.getY() > drawingAreaPane.getLayoutBounds().getMaxY()-thickness) return;
		Circle newCircle = new Circle(event.getX(), event.getY(), thickness, color);
		
		drawingAreaPane.getChildren().add(newCircle);
	}
	
	@FXML
    void toolsOptionPressed(ActionEvent event) {
		if (event.getSource() instanceof RadioButton) {
			RadioButton chosenButton = (RadioButton)event.getSource();
			if (chosenButton.getText().equals("Pen")) {
				color = Color.BLACK; thickness = 4;
			}
			else {
				Background background = drawingAreaPane.getBackground();
				if (background != null && !background.getFills().isEmpty()) {
				    
				    BackgroundFill fill = background.getFills().get(0);
				
				    Paint paint = fill.getFill();
				
				    if (paint instanceof Color) {
				    	color = (Color)paint;
				    }
				    else {
				    	System.out.println("Is the background painted solid?");
				    }
				}
				else {
					System.out.println("Missing background");
				}
				thickness = 8;
			}
		}
		else {
			System.out.println("Weird source");
		}
    }
	
}
