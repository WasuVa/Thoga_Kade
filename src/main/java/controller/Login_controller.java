package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.awt.event.ActionEvent;


public class Login_controller{
    Stage stage=new Stage();
    @FXML
    private Button btnLogin;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void btnLoginAction(ActionEvent event) {
    	String userName = txtUsername.getText();
    	String password = txtPassword.getText();
    	if(userName ==null && password==null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Invalid Credentials");
            alert.setContentText("Please enter valid credentials");
            alert.showAndWait();
    	}else if(userName.equals("admin") && password.equals("Admin132")){
            try{
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/DashBoard.fxml"))));
            }catch (Exception e){
                throw new RuntimeException(e);
            }
            stage.show();
        }
    }
}

