package com.boros.main;

import com.boros.sqlite.SQLite;
import com.boros.txt.Usuarios;
import javafx.beans.value.ObservableValueBase;
import javafx.collections.FXCollections;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;
import com.boros.main.Main;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Function;

import static com.boros.main.Controller.ekisde;

public class Controller_NuevoProfesor implements Initializable {
    public Button Evaluar;
    public Button inicio;
    @FXML
    Button guardar,AgregarN;
    @FXML
    ComboBox id_carrera;
    @FXML
    TextField clv, nombre, contrato, ads;
    public TableView <Usuarios> tabla = new TableView<>();

    Main main = new Main();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            FilteredList<String> filteredData = new FilteredList<>(FXCollections.observableList(SQLite.consultaCarrera()));
            id_carrera.setItems(filteredData);
        }catch(Exception e){

        }
        try{
            FilteredList<Usuarios> filteredData = new FilteredList<>(FXCollections.observableList(SQLite.consultaProfesorTodo()));
            tabla.getColumns().add(column("Clave Usuario", Usuarios::getClv_usuario));
            tabla.getColumns().add(column("Id Carrera", Usuarios::getId_carrera));
            tabla.getColumns().add(column("Nombre Usuario", Usuarios::getNombre_usuario));
            tabla.getColumns().add(column("Nivel ADS", Usuarios::getNivel_ads));
            tabla.getColumns().add(column("Contrato", Usuarios::getContrato));
            tabla.setItems(filteredData);
        }catch (Exception e){
        }
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

    public void guardarD(){
        SQLite.insercion_usuarios(clv.getText(),Integer.parseInt(String.valueOf(id_carrera.getValue())),nombre.getText(), ads.getText(),contrato.getText(), ekisde);
    }
    public void ventAgregarN() {
        main.nuevoProfesor();
        Stage stage = (Stage) this.AgregarN.getScene().getWindow();
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
