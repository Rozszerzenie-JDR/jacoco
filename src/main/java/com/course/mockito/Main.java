package com.course.mockito;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        NumberRater numberRater = new NumberRater(
                new Random()
        );

        System.out.println(numberRater.rateRandomNumber());
    }
}
 /*
         DODAC JACOCO!!!!


        Stwórz klasę IntelligentTrafficLightController, która będzie wyświetlała odpowiedni kolor światła w zależnosci od
        godziny, pogody, predkosci samochodu.
        Sygnalizacja ma działać w następujący sposób:

        - Jeżeli jest słonecznie i jest dzień (od 6 do 18), a prędkość samochodu jest mniejsza niż 50 km/h to światło ma być zielone
        - Jeżeli jest słonecznie i jest dzień (od 6 do 18), a prędkość samochodu jest większa niż 50 km/h to światło ma być żółte
        - Jeżeli jest słonecznie i jest dzień (od 6 do 18), a prędkość samochodu jest większa niż 80 km/h to światło ma być czerwone

        - Jeżeli jest słonecznie i jest noc (od 18 do 6), a prędkość samochodu jest mniejsza niż 50 km/h to światło ma być zielone
        - Jeżeli jest słonecznie i jest noc (od 18 do 6), a prędkość samochodu jest większa niż 70 km/h to światło ma być żółte
        - Jeżeli jest słonecznie i jest noc (od 18 do 6), a prędkość samochodu jest większa niż 100 km/h to światło ma być czerwone

        - Jeżeli jest deszczowo i jest dzień (od 6 do 18), a prędkość samochodu jest mniejsza niż 30 km/h to światło ma być zielone
        - Jeżeli jest deszczowo i jest dzień (od 6 do 18), a prędkość samochodu jest większa niż 30 km/h to światło ma być żółte
        - Jeżeli jest deszczowo i jest dzień (od 6 do 18), a prędkość samochodu jest większa niż 50 km/h to światło ma być czerwone

        - Jeżeli jest deszczowo i jest noc (od 18 do 6), a prędkość samochodu jest mniejsza niż 20 km/h to światło ma być zielone
        - Jeżeli jest deszczowo i jest noc (od 18 do 6), a prędkość samochodu jest większa niż 40 km/h to światło ma być żółte
        - Jeżeli jest deszczowo i jest noc (od 18 do 6), a prędkość samochodu jest większa niż 60 km/h to światło ma być czerwone

        Stwórz odpowiednie interfejsy iklasy, przetestuj zachowanie funkcji wyświetlającej światło za pomocą testów jednostkowych
        oraz Mockito.
         */