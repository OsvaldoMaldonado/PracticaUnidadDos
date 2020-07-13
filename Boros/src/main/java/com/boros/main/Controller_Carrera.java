package com.boros.main;

import com.boros.sqlite.SQLite;
import com.boros.txt.Carrera;
import javafx.beans.value.ObservableValueBase;
import javafx.collections.FXCollections;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Function;

import static com.boros.main.Controller.ekisde;

public class Controller_Carrera implements Initializable {
    public Button Evaluar;
    public Button agregarCarrera;
    public TextField nombre;
    public Button guardar;
    public TextField id;
    public Button inicio;
    Main main = new Main();
    public TableView <Carrera> tabla = new TableView<>();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try{
            FilteredList<Carrera> filteredData = new FilteredList<>(FXCollections.observableList(SQLite.consultaCarreraTodo()));
            tabla.getColumns().add(column("Clave Usuario", Carrera::getId_carrera));
            tabla.getColumns().add(column("Id Carrera", Carrera::getNombre_carrera));
            tabla.setItems(filteredData);
        }catch (Exception e){
        }
    }

    public void ventAgregarCarrera(ActionEvent actionEvent) {
        main.nuevaCarrera();
        Stage stage = (Stage) this.agregarCarrera.getScene().getWindow();
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


    public void guardarCarrera(ActionEvent actionEvent) {
        SQLite.insercion_carrera(id.getText(),nombre.getText(),ekisde);
    }
    private static <S,T> TableColumn<S,T> column(String title, Function<S,T> property) {
        TableColumn<S,T> col = new TableColumn<>(title);
        col.setCellValueFactory(cellData -> new ObservableValueBase<T>() {
            @Override
            public T getValue() {
                return property.apply(cellData.getValue());
            };
        });
        return col ;
    }
}
