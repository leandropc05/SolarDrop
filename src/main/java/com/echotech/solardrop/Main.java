package com.echotech.solardrop;

import com.echotech.solardrop.hardware.LeitorWokwi;
import com.echotech.solardrop.model.Planta;
import com.echotech.solardrop.repository.PlantaDAO;
import com.echotech.solardrop.service.IrrigacaoService;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PlantaDAO dao = new PlantaDAO();
        LeitorWokwi leitor = new LeitorWokwi();
        IrrigacaoService irrigacao = new IrrigacaoService();

        try {
            leitor.conectar();

            List<Planta> plantas = dao.buscarTodas();

            while (true) {
                double umidadeSensor = leitor.lerUmidade();

                System.out.println("Umidade recebida do Wokwi: " + umidadeSensor + "%");

                for (Planta planta : plantas) {
                    irrigacao.verificarIrrigacao(planta, umidadeSensor);

                }
            }

        } catch (SQLException e) {
            System.out.println("Erro ao consultar as plantas.");
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("Erro ao receber dados do Wokwi.");
            e.printStackTrace();

        } finally {
            leitor.desconectar();
        }
    }
}
