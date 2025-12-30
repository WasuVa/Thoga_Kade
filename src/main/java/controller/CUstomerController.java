package controller;

import javafx.collections.FXCollections;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class CUstomerController {
    public class Customer_managemnt_form implements Initializable {
        ObservarbleList<Customer_managemnt_InfoDTO>customerManagemntInfoDTOObservarbleList= FXCollections.observableArrayList(
                new Customer_managemnt_form("C002", "Ms.", "Kumari", "1993-11-12", 52000, "No.15 Galle Road", "Colombo", "Western", "12000"),
                new Customer_managemnt_form("C002", "Ms.", "Kumari", "1993-11-12", 52000, "No.15 Galle Road", "Colombo", "Western", "12000"),
                new Customer_managemnt_form("C002", "Ms.", "Kumari", "1993-11-12", 52000, "No.15 Galle Road", "Colombo", "Western", "12000"),
                new Customer_managemnt_form("C002", "Ms.", "Kumari", "1993-11-12", 52000, "No.15 Galle Road", "Colombo", "Western", "12000"),
                new Customer_managemnt_form("C002", "Ms.", "Kumari", "1993-11-12", 52000, "No.15 Galle Road", "Colombo", "Western", "12000")
        )

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {

        }
    }_
}

