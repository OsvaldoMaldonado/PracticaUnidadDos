package com.boros.main;

import com.boros.sqlite.SQLite;
import javafx.collections.FXCollections;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import static com.boros.main.Controller.ekisde;

public class Controller_Prestamos implements Initializable {
    public Button inicio;
    public Button Evaluar;
    public ComboBox usuario;
    public ComboBox carrera;
    Main main = new Main();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        FilteredList<String> filteredData = new FilteredList<>(FXCollections.observableList(SQLite.consultaProfesor()));
        usuario.setItems(filteredData);
        FilteredList<String> filteredData2 = new FilteredList<>(FXCollections.observableList(SQLite.consultaCarrera()));
        carrera.setItems(filteredData2);
    }

    public void guardarPrestamo(ActionEvent actionEvent) {
        SQLite.insercion_prestamos(String.valueOf(usuario.getValue()),Integer.parseInt(String.valueOf(carrera.getValue())),ekisde);

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
