package com.boros.main;

import com.boros.rutas.RunRutas;
import com.boros.sqlite.SQLite;
import com.boros.txt.RunTXT;
import com.boros.xlsx.RunXLSX;
import javafx.fxml.Initializable;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Controller{

    public static java.sql.Connection ekisde = SQLite.creacion_volatil();
    public static String rutaTXT;
    public static String rutaXLSX;

    public static void initialize() {
        RunRutas.cambioRuta();
        System.out.println(rutaTXT);
        System.out.println(rutaXLSX);
        try {
            RunTXT.lecturaTXT(rutaTXT);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            RunXLSX.lecturaXLSX(rutaXLSX);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
