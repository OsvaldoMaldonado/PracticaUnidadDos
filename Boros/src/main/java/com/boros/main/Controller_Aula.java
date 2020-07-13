package com.boros.main;

import com.boros.sqlite.SQLite;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

import static com.boros.main.Controller.ekisde;

public class Controller_Aula{
    public TextField id;
    public TextField nombre;
    public TextField capacidad;
    public TextField descripcion;
    public TextField ubicacion;
    public TextField tipo;
    public Button guardar;
    public Button Evaluar;
    public Button inicio;
     Main main = new Main();

    public void guardarAula(ActionEvent actionEvent) {

        SQLite.insercion_aulas(id.getText(),nombre.getText(),tipo.getText(),Integer.parseInt(capacidad.getText()),descripcion.getText(),ubicacion.getText(), ekisde);
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
