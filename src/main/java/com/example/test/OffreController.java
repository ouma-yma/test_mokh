package com.example.test;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import java.net.URL;
import java.util.ResourceBundle;

public class OffreController implements Initializable {

    @FXML
    private Label myLabel;

    @FXML
    private ChoiceBox<String> myChoixBox;
    final String[] trades={
            "Purchasing / Logistics",
            "Administration/ Secretariat",
            "Aeronautics/ Aviation / Travel",
            "Call Center / Telesales",
            "Cosmetics /Perfumery/ Luxury",
            "Colture / Audiovisual",
            "Commercial / Sales / Distribution",
            "Chemistry /Biology /Physics",
            "IT / Multimedia",
            "Human Resources / Social",
            "Textile /Leather",
            "Transport / Delivery / Handing",
            "Marketing / Advertising / Communication",
            "Bank / Insurances / Finance / Market",
            "Accounting/ Management / Audit",
            "Consultant / Study / Consulting ",
            "Direction / Management / Strategy",
            "Education / Training",
            "Law / Taxation / Legal",
            "Electronics / Electricity / Energy",
            "Export / Transit",
            "Engineer / Industry / Production",
            "Maintenance / Quality ",
            "Telecoms / Networks",
            "Agriculture /Agribusiness / Environment",
            "Health / Paramedical / Optics",
            "Crafts",
            "Real Estate / Architecture"
    };


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        myChoixBox.getItems().addAll(trades);
    }

}
