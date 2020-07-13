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

public class Controller_Materia implements Initializable {
    public Button guardar;
    public ComboBox plan;
    public TextField credito;
    public TextField nombre;
    public TextField clv;
    public ComboBox cuatrimestre;
    public TextField posicion;
    public TextField tipo;
    public TextField horas;
    public Button Evaluar;
    public Button inicio;
    Main main = new Main();
    public void gurdarMateria(ActionEvent actionEvent) {
        SQLite.insercion_materia(nombre.getText(),clv.getText(),Integer.parseInt(credito.getText()),Integer.valueOf(String.valueOf(cuatrimestre.getValue())), Integer.valueOf(posicion.getText()),String.valueOf(plan.getValue()),Integer.parseInt(horas.getText()),tipo.getText(),ekisde);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        FilteredList<String> filteredData = new FilteredList<>(FXCollections.observableList(SQLite.consultaPlan()));
        plan.setItems(filteredData);
        ObservableList list = FXCollections.observableArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");
        list.add("9");
        list.add("10");
        cuatrimestre.setItems(list);
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
    public void ventanaMateria(ActionEvent actionEvent) {
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
