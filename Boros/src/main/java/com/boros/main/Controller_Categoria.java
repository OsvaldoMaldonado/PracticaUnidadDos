package com.boros.main;

import com.boros.sqlite.SQLite;
import javafx.collections.FXCollections;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import static com.boros.main.Controller.ekisde;

public class Controller_Categoria implements Initializable {

    public Button Evaluar;
    public Button inicio;
    public TextField id;
    public TextField nombre;
    public TextField descripcion;

    public TextArea descripcionZ;
    public ComboBox categoriaZ;
    public TextField nombreZ;
    public TextField idZ;

    Main main = new Main();
    public void guardarCategoria(ActionEvent actionEvent) {
        SQLite.insercion_categorias_equipo(Integer.parseInt(id.getText()),nombre.getText(),descripcion.getText(), ekisde);
    }

    public void guardarEquipo(ActionEvent actionEvent){
        SQLite.insercion_equipo(Integer.parseInt(idZ.getText()),Integer.parseInt(String.valueOf(categoriaZ.getValue())),nombreZ.getText(),descripcionZ.getText(),ekisde);
    }

    public void ventanaCategoria(ActionEvent actionEvent) {
        main.nuevaCategoria();
        Stage stage = (Stage) this.idZ.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            FilteredList<String> filteredData = new FilteredList<>(FXCollections.observableList(SQLite.consultaCategoria()));
            categoriaZ.setItems(filteredData);
        }catch(Exception e){

        }
    }
    public void regresarEquipo(ActionEvent actionEvent) {
        main.nuevoEquipo();
        Stage stage = (Stage) this.descripcion.getScene().getWindow();
        stage.close();
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
