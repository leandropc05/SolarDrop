package com.echotech.solardrop;

import gnu.io.SerialPort;
import gnu.io.rfc2217.TelnetSerialPort;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LeitorWokwi {
    private TelnetSerialPort porta;
    private BufferedReader leitor;

    public void conectar() throws Exception {
        porta = new TelnetSerialPort();
        porta.getTelnetClient().connect("localhost", 4000);

        porta.setSerialPortParams(
            9600,
            SerialPort.DATABITS_8,
            SerialPort.STOPBITS_1,
            SerialPort.PARITY_NONE
        );

        leitor = new BufferedReader(
            new InputStreamReader(porta.getInputStream())
        );

        System.out.println("Conectado ao Wokwi!");
    }

    public double lerUmidade() throws Exception {
        String valor = leitor.readLine();
        return Double.parseDouble(valor);
    }

    public void desconectar() {
        try {
            if (porta != null) {
                porta.getTelnetClient().disconnect();
            }
        } catch (Exception e) {
            System.out.println("Erro ao desconectar do Wokwi.");
        }
    }
}
