package com.boros.main;

import com.boros.mysql.*;
import com.boros.rutas.*;
import com.boros.txt.*;
import com.boros.xlsx.*;

import com.mysql.jdbc.Connection;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.SQLException;

public class Main extends Application {

    public static String usuario;
    public static String contrasenia;
    public static String rutaTXT;
    public static String rutaXLSX;

    public static void main(String[] args) throws SQLException, IOException {

        launch(args);
/*      System.out.println("---- Lectura de Rutas ----");
        System.out.println("");
        RunRutas.cambioRuta();
        System.out.println("---- Lectura de TXT ----");
        RunTXT.lecturaTXT(rutaTXT);
        System.out.println("");
        System.out.println("---- Lectura XLSX ----");
        System.out.println("");
        RunXLSX.lecturaXLSX(rutaXLSX);
        System.out.println("");
        Connection connect = Conexion.conexion();
        if(connect != null){
            System.out.println("---- CRUD de MySQL ----");
            try {
                RunDB.baseDeDatos();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }else{
            System.out.println("No se pudo realizar el CRUD de MySQL debido a un fallo en la conexion");
        }
        */
    }

    public void start(Stage stage) throws Exception{

            stage  = FXMLLoader.load(getClass().getResource("/login.fxml"));
            stage.show();

    }
    public void recursos(){
        try {
            Stage op = FXMLLoader.load(getClass().getResource("/recursos.fxml"));
            op.show();
        } catch (IOException e) {
        }
    }


}