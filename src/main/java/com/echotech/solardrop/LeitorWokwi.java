
package com.echotech.solardrop;

import gnu.io.SerialPort;
import gnu.io.rfc2217.TelnetSerialPort;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LeitorWokwi {
    public static void main(String[] args) {
        TelnetSerialPort porta = new TelnetSerialPort();

        try {
            porta.getTelnetClient().connect("localhost", 4000);

            porta.setSerialPortParams(
                9600,
                SerialPort.DATABITS_8,
                SerialPort.STOPBITS_1,
                SerialPort.PARITY_NONE
            );

            System.out.println("Conectado ao Wokwi!");

            BufferedReader leitor = new BufferedReader(
                new InputStreamReader(porta.getInputStream())
            );

            String valor;

            while ((valor = leitor.readLine()) != null) {
                System.out.println("Umidade recebida: " + valor);
            }

        } catch (Exception e) {
            System.out.println("Erro na conexao com o Wokwi:");
            e.printStackTrace();
        }
    }
}
