package com.boros.main;

import com.boros.mysql.Tabla;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller_Materia implements Initializable {


    @FXML
    TableView <Tabla> Cuatri;

    @FXML
    TableColumn<Tabla, String> primero;
    @FXML
    TableColumn<Tabla, String> segundo;
    @FXML
    TableColumn<Tabla, String> tercero;
    @FXML
    TableColumn<Tabla, String> cuarto;
    @FXML
    TableColumn<Tabla, String> quinto;
    @FXML
    TableColumn<Tabla, String> sexto;
    @FXML
    TableColumn<Tabla, String> septimo;
    @FXML
    TableColumn<Tabla, String> octavo;
    @FXML
    TableColumn<Tabla, String> noveno;
    @FXML
    TableColumn<Tabla, String> decimo;


    //public void

    public void initialize(URL location, ResourceBundle resources) {

    }


}