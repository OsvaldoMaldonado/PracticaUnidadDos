package com.boros.main;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller_Menu {


    public Button Evaluar;
    public Button usuarios2;
    public Button usuarios;

    Main main = new Main();
    public void VentanaUsuarios(ActionEvent actionEvent) {
        main.profesor();
        Stage stage = (Stage) this.Evaluar.getScene().getWindow();
        stage.close();
    }


    public void VentanaEvaluar(ActionEvent actionEvent) {
        main.evaluacion();
        Stage stage = (Stage) this.Evaluar.getScene().getWindow();
        stage.close();
    }

    public void ventanaCarreras(ActionEvent actionEvent) {
        main.carrera();
        Stage stage = (Stage) this.Evaluar.getScene().getWindow();
        stage.close();
    }
    public void ventanaAulas(ActionEvent actionEvent) {
        main.nuevaAula();
        Stage stage = (Stage) this.Evaluar.getScene().getWindow();
        stage.close();
    }
    public void ventanaMateria(ActionEvent actionEvent) {
        main.nuevaMateria();
        Stage stage = (Stage) this.Evaluar.getScene().getWindow();
        stage.close();
    }
    public void ventanaPrestamo(ActionEvent actionEvent) {
        main.nuevoPrestamo();
        Stage stage = (Stage) this.Evaluar.getScene().getWindow();
        stage.close();
    }
    public void ventanaEquipo(ActionEvent actionEvent) {
        main.nuevoEquipo();
        Stage stage = (Stage) this.Evaluar.getScene().getWindow();
        stage.close();
    }
    public void ventanaPlan(ActionEvent actionEvent) {
        main.nuevoPlan();
        Stage stage = (Stage) this.Evaluar.getScene().getWindow();
        stage.close();
    }

}
