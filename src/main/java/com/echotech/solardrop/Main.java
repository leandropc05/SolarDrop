
package com.echotech.solardrop;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PlantaDAO dao = new PlantaDAO();

        try {
            List<Planta> plantas = dao.buscarTodas();

            double umidadeSensor = 25;

            for (Planta planta : plantas) {
                planta.setUmidadeAtual(umidadeSensor);

                System.out.println("Planta: " + planta.getNome());
                System.out.println("Umidade atual: " + planta.getUmidadeAtual() + "%");
                System.out.println("Umidade mínima: " + planta.getUmidadeMinima() + "%");

                if (planta.precisaIrrigar()) {
                    System.out.println("Recomendacao: irrigar.");
                } else {
                    System.out.println("Recomendacao: nao irrigar.");
                }

                System.out.println("--------------------");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao consultar as plantas.");
            e.printStackTrace();
        }
    }
}
