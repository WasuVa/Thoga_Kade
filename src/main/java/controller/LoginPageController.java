package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginPageController {
    Stage stage=new Stage();
    
    @FXML
    private TextField txtUsername;

    
    @FXML
    private PasswordField txtPassword;
    
    @FXML
    private Button btnLogin;
    
    @FXML
    private void btnLoginOnAction(ActionEvent event) {
        String userName = txtUsername.getText();
        String password = txtPassword.getText();
        if(userName.equals("admin")|| password.equals("Admin123")){
            try {
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/Dachboard.fxml"))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.show();
        }
    }
}
