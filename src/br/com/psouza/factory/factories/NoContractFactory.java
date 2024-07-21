package br.com.psouza.factory.factories;

import br.com.psouza.factory.Car;
import br.com.psouza.factory.Factory;
import br.com.psouza.factory.cars.AudiCar;
import br.com.psouza.factory.cars.FiatCar;
import br.com.psouza.factory.cars.HondaCar;
import br.com.psouza.factory.cars.ToyotaCar;

public class NoContractFactory extends Factory {
    @Override
    protected Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new AudiCar(160, "full", "dark blue");
        } else if ("B".equals(requestedGrade)) {
            return new HondaCar(180, "full", "black");
        } else {
            System.out.println("Car unavailable!");
            return null;
        }
    }
}
