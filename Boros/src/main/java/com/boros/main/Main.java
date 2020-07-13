package com.boros.main;

import com.boros.mysql.*;
import com.boros.xlsx.*;
import com.boros.txt.*;
import com.boros.rutas.*;
import com.boros.sqlite.*;
import com.mysql.jdbc.Connection;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class Main extends Application {

    public static void main(String[] args) throws SQLException {
        Controller.initialize();
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {
        stage  = FXMLLoader.load(getClass().getResource("/menu.fxml"));
        stage.show();
    }
    public void evaluacion(){
        try {
            Stage op = FXMLLoader.load(getClass().getResource("/Evaluar.fxml"));
            op.show();
        } catch (IOException e) {

        }
    }
    public void profesor(){
        try {
            Stage op = FXMLLoader.load(getClass().getResource("/Nuevo_Profesor.fxml"));
            op.show();
        } catch (IOException e) {

        }
    }
    public void nuevoProfesor(){
        try {
            Stage op = FXMLLoader.load(getClass().getResource("/Formulario_Nuevo_Profesor.fxml"));
            op.show();
        } catch (IOException e) {

        }
    }
    public void carrera(){
        try {
            Stage op = FXMLLoader.load(getClass().getResource("/Carreras.fxml"));
            op.show();
        } catch (IOException e) {
        }
    }
    public void nuevaCarrera(){
        try {
            Stage op = FXMLLoader.load(getClass().getResource("/Formulario_Nueva_Carreras.fxml"));
            op.show();
        } catch (IOException e) {
        }
    }
    public void nuevaAula(){
        try {
            Stage op = FXMLLoader.load(getClass().getResource("/Formulario_Nueva_Aula.fxml"));
            op.show();
        } catch (IOException e) {
        }
    }

    public void nuevaMateria(){
        try {
            Stage op = FXMLLoader.load(getClass().getResource("/Nueva_Materia.fxml"));
            op.show();
        } catch (IOException e) {
        }
    }
    public void nuevoPrestamo(){
        try {
            Stage op = FXMLLoader.load(getClass().getResource("/Formulario_Prestamo.fxml"));
            op.show();
        } catch (IOException e) {
        }
    }
    public void nuevoEquipo(){
        try {
            Stage op = FXMLLoader.load(getClass().getResource("/Formulario_Equipo.fxml"));
            op.show();
        } catch (IOException e) {
        }
    }

    public void nuevaCategoria(){
        try {
            Stage op = FXMLLoader.load(getClass().getResource("/Nueva_Categoria.fxml"));
            op.show();
        } catch (IOException e) {
        }
    }
    public void nuevoPlan(){
        try {
            Stage op = FXMLLoader.load(getClass().getResource("/Formulario_Plan.fxml"));
            op.show();
        } catch (IOException e) {
        }
    }
    public void nuevoInicio(){
        try {
            Stage op = FXMLLoader.load(getClass().getResource("/menu.fxml"));
            op.show();
        } catch (IOException e) {
        }
    }
}
