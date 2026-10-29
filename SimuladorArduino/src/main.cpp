#include <Arduino.h>

void setup() {
    Serial.begin(9600);
}

void loop() {
    int leitura = analogRead(A0);

    int umidade = map(leitura, 0, 1023, 0, 100);

    Serial.println(umidade);

    delay(1000);
}
