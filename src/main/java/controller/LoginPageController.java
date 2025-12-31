package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.IOException;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class LoginPageController {

    Stage stage = new Stage();

    @FXML
    private Button btnLogin;

    @FXML
    private PasswordField txtPAssword;

    @FXML
    private TextField txtUsername;

    @FXML
    void btnLoginOnAction(ActionEvent event) {
        String username = txtUsername.getText();
        String password = txtPAssword.getText();
        if(username.equals("admin") && password.equals("Admin123")){
            try {
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/DashBoard.fxml"))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Login Please try again...!");
            alert.showAndWait();
        }
    }

}
