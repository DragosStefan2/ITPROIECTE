package Challenges;

public abstract class Vehicle {
    public String fuelType(){
        return "generic fuel";
    }
}

class Car extends Vehicle{
    @Override
    public String fuelType() {
        return "petrol";
    }
}

class Truck extends Vehicle{
    @Override
    public String fuelType() {
        return "diesel";
    }
}

