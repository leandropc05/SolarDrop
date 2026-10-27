
package com.echotech.solardrop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlantaDAO {

    public void cadastrar(Planta planta) throws SQLException {
        String sql = "INSERT INTO plantas (nome, umidade_minima) VALUES (?, ?)";

        try (Connection conexao = ConexaoBanco.conectar();
             PreparedStatement comando = conexao.prepareStatement(sql)) {

            comando.setString(1, planta.getNome());
            comando.setDouble(2, planta.getUmidadeMinima());

            comando.executeUpdate();
        }
    }

    
public void listar() throws SQLException {
    String sql = "SELECT * FROM plantas";

    try (Connection conexao = ConexaoBanco.conectar();
         PreparedStatement comando = conexao.prepareStatement(sql);
         java.sql.ResultSet resultado = comando.executeQuery()) {

        while (resultado.next()) {
            String nome = resultado.getString("nome");
            double umidadeMinima = resultado.getDouble("umidade_minima");

            System.out.println("Planta: " + nome);
            System.out.println("Umidade mínima: " + umidadeMinima + "%");
            System.out.println("--------------------");
        }
    }
}


public List<Planta> buscarTodas() throws SQLException {
    List<Planta> plantas = new ArrayList<>();

    String sql = "SELECT * FROM plantas";

    try (Connection conexao = ConexaoBanco.conectar();
         PreparedStatement comando = conexao.prepareStatement(sql);
         java.sql.ResultSet resultado = comando.executeQuery()) {

        while (resultado.next()) {
            String nome = resultado.getString("nome");
            double umidadeMinima = resultado.getDouble("umidade_minima");

            Planta planta = new Planta(nome, 0, umidadeMinima);
            plantas.add(planta);
        }
    }

    return plantas;
}



}