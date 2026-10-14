package com.echotech.solardrop.controller;

import org.springframework.web.bind.annotation.RestController;
import com.echotech.solardrop.model.SensorUmidade;
import com.echotech.solardrop.service.ClimaService;
import com.echotech.solardrop.service.IrrigacaoService;
import com.echotech.solardrop.service.SensorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController 
public class SolarDropController {
  
  @GetMapping("/solardrop")
  public String getTesteSolarDrop() {
      return "SolarDrop funcionando!";
  }

  @GetMapping("/clima")
  public String getClima() {
      return climaService.consultarPrevisao();
  }
  
  
  @GetMapping("/sensor")
  public String getSensorUmidade(@RequestParam double umidade) {
    SensorUmidade sensor = sensorService.criarSensor(umidade);
    irrigacaoService.verificarIrrigacao(sensor);

    return "Umidade do solo: " + sensor.getUmidade() + "%" + "<br>" + "Precisa irrigar? " + sensor.precisaIrrigar() + "<br>" + "Bomba ligada? " + irrigacaoService.estaBombaLigada();
  }

  private SensorService sensorService;
  private IrrigacaoService irrigacaoService;
  private ClimaService climaService; 

  public SolarDropController(SensorService sensorService, IrrigacaoService irrigacaoService, ClimaService climaService){
    this.sensorService = sensorService;
    this.irrigacaoService = irrigacaoService;
    this.climaService = climaService;
  
  }
  
  
}
