package com.boros.main;

import com.boros.mysql.CRUD;
import com.boros.rutas.RunRutas;
import com.boros.sqlite.SQLite;
import com.boros.txt.RunTXT;
import com.boros.xlsx.RunXLSX;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.ResourceBundle;

import static com.boros.main.Controller.ekisde;

public class Controller_AutoEvaluacion implements Initializable {
    public Button Evaluar;
    public Button inicio;
    @FXML
    ComboBox plan, materia, profesor, PConfianza, PDirector;
    @FXML
    Button agregar;
    CRUD crud = new CRUD();
    Main main = new Main();
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        FilteredList<String> filteredData = new FilteredList<>(FXCollections.observableList(SQLite.consultaPlan()));
        plan.setItems(filteredData);
        FilteredList<String> filteredData2 = new FilteredList<>(FXCollections.observableList(SQLite.consultaProfesor()));
        profesor.setItems(filteredData2);
        ObservableList list = FXCollections.observableArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        PConfianza.setItems(list);
        PDirector.setItems(list);
    }
    public void seleccion(javafx.event.ActionEvent actionEvent) {
        FilteredList<String> filteredData = new FilteredList<>(FXCollections.observableList(SQLite.consultaMateria((String) plan.getValue())));
        materia.setItems(filteredData);
    }
    public void agregarDatos(){
        SQLite.insercion_materia_usuarios(String.valueOf(materia.getValue()),String.valueOf(plan.getValue()),String.valueOf(profesor.getValue()),Integer.parseInt(String.valueOf(PConfianza.getValue())),Integer.parseInt(String.valueOf(PDirector.getValue())), ekisde);
    }
    public void ventanaProfesor(javafx.event.ActionEvent actionEvent) {
        main.nuevoProfesor();
        Stage stage = (Stage) this.inicio.getScene().getWindow();
        stage.close();
    }
    public void ventanaInicio(javafx.event.ActionEvent actionEvent) {
        main.nuevoInicio();
        Stage stage = (Stage) this.inicio.getScene().getWindow();
        stage.close();
    }
    public void ventanaMateria(javafx.event.ActionEvent actionEvent) {
        main.nuevaMateria();
        Stage stage = (Stage) this.inicio.getScene().getWindow();
        stage.close();
    }
    public void ventanaAula(javafx.event.ActionEvent actionEvent) {
        main.nuevaAula();
        Stage stage = (Stage) this.inicio.getScene().getWindow();
        stage.close();
    }
    public void ventanaPlan(javafx.event.ActionEvent actionEvent) {
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
