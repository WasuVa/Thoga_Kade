package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class DashboardController {

    @FXML
    private Button btnCusManage;

    @FXML
    private Button btnItemManage;

    @FXML
    private Button btnOder;

    @FXML
    void CustomerMOnAction(ActionEvent event) {

    }

    @FXML
    void ItemMOnAction(ActionEvent event) {

    }

    @FXML
    void OderDOnAction(ActionEvent event) {

    }

}
