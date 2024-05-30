import javafx.*;
import javafx.scene.control.*;

public class H2ClassK {
    // Add necessary JavaFX components
    Button submit = new Button("Submit"); // Define a Button component
    Label label = new Label(); // Define a Label component
    
    // Constructor for H2ClassK
    public H2ClassK() {
        // Add the button and label to the scene or layout
        
        // Set an action for the button
        submit.setOnAction((ActionEvent e) -> {
            label.setText("A comment");
        });
    } // end constructor
} // end class H2ClassK
