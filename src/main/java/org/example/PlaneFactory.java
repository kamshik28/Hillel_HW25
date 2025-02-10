package org.example;

class PlaneFactory extends TransportFactory {
    @Override
    Transport createTransport() {
        System.out.println("Літак створено!");
        return new Plane();
    }
}
