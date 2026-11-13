package com.echotech.solardrop.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:C:/Users/leand/OneDrive/Desktop/SolarDropAtual/SolarDropJava/solardrop.db");
    }
}