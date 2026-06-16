import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Button calculate_btn;

    @FXML
    private Label result_display;

    @FXML
    private TextField textfield_num1;

    @FXML
    private TextField textfield_num2;

    @FXML
    void onCalculate(ActionEvent event) {
        String str_num1 = textfield_num1.getText();
        String str_num2 = textfield_num2.getText();

        double db_num1 = Double.parseDouble(str_num1);
        double db_num2 = Double.parseDouble(str_num2);

        double db_sum = db_num1 + db_num2; 

        String str_sum = String.valueOf(db_sum);
        result_display.setText(str_sum);
    }

}
