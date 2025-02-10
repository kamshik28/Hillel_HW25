package org.example;

class CarFactory extends TransportFactory {
    @Override
    Transport createTransport() {
        System.out.println("Машину створено!");
        return new Car();
    }
}
