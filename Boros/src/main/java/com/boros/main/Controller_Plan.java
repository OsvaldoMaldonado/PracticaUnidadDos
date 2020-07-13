package com.boros.main;

import com.boros.sqlite.SQLite;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import static com.boros.main.Controller.ekisde;

public class Controller_Plan implements Initializable {
    public Button Evaluar;
    public Button inicio;
    public TextField clv;
    public ComboBox carrera;
    public ComboBox nivel;
    public TextField nombre;
    Main main = new Main();

    public void guardarPlan(ActionEvent actionEvent) {
        SQLite.insercion_plan_estudios(clv.getText(),nombre.getText(),String.valueOf(nivel.getValue()),Integer.parseInt(String.valueOf(carrera.getValue())), ekisde);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try{
            FilteredList<String> filteredData = new FilteredList<>(FXCollections.observableList(SQLite.consultaCarrera()));
            carrera.setItems(filteredData);
            ObservableList list = FXCollections.observableArrayList();
            list.add("LIC");
            list.add("ING");
            list.add("MST");
            nivel.setItems(list);
        }catch (Exception e){
        }


    }
    public void ventanaProfesor(ActionEvent actionEvent) {
        main.nuevoProfesor();
        Stage stage = (Stage) this.inicio.getScene().getWindow();
        stage.close();
    }
    public void ventanaInicio(ActionEvent actionEvent) {
        main.nuevoInicio();
        Stage stage = (Stage) this.inicio.getScene().getWindow();
        stage.close();
    }
    public void ventanaMaterias(ActionEvent actionEvent) {
        main.nuevaMateria();
        Stage stage = (Stage) this.inicio.getScene().getWindow();
        stage.close();
    }
    public void ventanaAula(ActionEvent actionEvent) {
        main.nuevaAula();
        Stage stage = (Stage) this.inicio.getScene().getWindow();
        stage.close();
    }
    public void ventanaPlan(ActionEvent actionEvent) {
        main.nuevoPlan();
        Stage stage = (Stage) this.inicio.getScene().getWindow();
        stage.close();
    }
    public void ventanaEvaluar(ActionEvent actionEvent) {
        main.evaluacion();
        Stage stage = (Stage) this.inicio.getScene().getWindow();
        stage.close();
    }
}
