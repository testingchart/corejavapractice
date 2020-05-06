package Inheritance_Polymorphism;

public class Bus extends AbstractVehicle {

    @Override
    public String getVehicleName() {
        return "Bus";
    }

    @Override
    public Integer getWheels() {
        return 10;
    }

    @Override
    public Integer getSeats() {
        return 32;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }
}
