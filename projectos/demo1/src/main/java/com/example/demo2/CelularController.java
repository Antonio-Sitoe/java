package com.example.demo2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class CelularController {
    @FXML
    private Button Buttom;

    @FXML
    private Label Labela;
    @FXML
   protected  void SaySomething(){
       Labela.setText("Hello owrld");
   }

}
