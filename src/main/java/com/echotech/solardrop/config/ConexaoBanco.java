package com.echotech.solardrop.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:solardrop.db");
    }
}