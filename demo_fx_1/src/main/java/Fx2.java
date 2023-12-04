import com.example.demo_fx_1.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;

public class Fx2 {
    private Stage stage;
    private Walk walk;
    private Crowl crowl;

    public void switchToFx2(ActionEvent event) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("fx-2.fxml"));
        stage = (Stage)((Node)event.getSource())getSource()).getScene().getWindow();
        walk = new Walk(crowl);
    }
}
