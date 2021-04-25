import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Orientation;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.scene.control.Slider;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.paint.Color;

public class Main extends Application 
{
   Stage parkly;
   Scene scene1,scene2,scene3;
   
   public static void main(String[] args)
   {
      launch(args);
   }
   
   //@override
   public void start(Stage primaryStage) throws Exception
   {
      parkly = primaryStage;
      
      //scene 1
      Label label1 = new Label("Where do you want to park?");
      //add more buttons for scene1, then do the botton for next scene
      Button button1 = new Button("Next");
      button1.setOnAction(e -> parkly.setScene(scene2));
      
      //layout 1 - children are laid out in vertical column
      VBox layout1 = new VBox(50);
      layout1.setAlignment(Pos.CENTER);
      layout1.getChildren().addAll(label1, button1); //add other buttons
      scene1 = new Scene(layout1, 200, 500);
      
      //scene 2
      Label label2 = new Label("What is your price range?");
      
      //here we need to make a price range bar then give a button to the next scene
      Slider slider = new Slider();
  
      // set the value of property min,
      // max and value
      slider.setMin(25);
      slider.setMax(100);
      slider.setValue(25);
  
      // enable TickLabels and Tick Marks
      slider.setShowTickLabels(true);
      //slider.setShowTickMarks(true);
        
      slider.setBlockIncrement(10);
      
      slider.valueProperty().addListener(
             new ChangeListener<Number>() {
  
            public void changed(ObservableValue <? extends Number > 
                      observable, Number oldValue, Number newValue)
            {
  
               // put your logic statements here
               // ...
            }
        });
      
      Button button2 = new Button("Next");
      button2.setOnAction(e -> parkly.setScene(scene3));
      
      //layout 2 - children are laid out in vertical column
      VBox layout2 = new VBox(50);
      layout2.setAlignment(Pos.CENTER);
      layout2.getChildren().addAll(label2, slider, button2); //add the bar
      scene2 = new Scene(layout2, 200, 500);
      
      //scene 3
      Label label3 = new Label("How long will you be parked?");
      
      //TIME 
      
      Button button3 = new Button("RESULT");
      button3.setOnAction(e -> System.out.println("Here is the area you can park"));
      
      //layout 3 - children are laid out in vertical column
      VBox layout3 = new VBox(50);
      layout3.setAlignment(Pos.CENTER);
      layout3.getChildren().addAll(label3, button3); //add the time bar
      scene3 = new Scene(layout3, 200, 500);
      
         
      parkly.setScene(scene2);
      parkly.setTitle("Parkly Application");
      parkly.show();   
   }
   
   
}