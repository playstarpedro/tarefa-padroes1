package br.com.psouza.factory;

import br.com.psouza.factory.factories.ContractFactory;
import br.com.psouza.factory.factories.NoContractFactory;

public class Demo {
    public static void main(String args[]) {
        Customer customer1 = new Customer("A", false);
        Factory factory1 = getFactory(customer1);
        Car car1 = factory1.create(customer1.getGradeRequest());
        car1.startEngine();
    }

    private static Factory getFactory(Customer customer) {
        if (customer.hasCompanyContract()) {
            return new ContractFactory();
        } else {
            return new NoContractFactory();
        }
    }
}
