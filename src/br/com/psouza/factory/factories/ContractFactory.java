package br.com.psouza.factory.factories;

import br.com.psouza.factory.Car;
import br.com.psouza.factory.Factory;
import br.com.psouza.factory.cars.FiatCar;
import br.com.psouza.factory.cars.ToyotaCar;

public class ContractFactory extends Factory {
    @Override
    protected Car retrieveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new FiatCar(100, "full", "white");
        } else if ("B".equals(requestedGrade)) {
            return new ToyotaCar(150, "full", "silver");
        } else {
            System.out.println("Car unavailable!");
            return null;
        }
    }
}
