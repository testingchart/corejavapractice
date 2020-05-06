package Inheritance_Polymorphism;

public class Motorcycle extends AbstractVehicle {

    @Override
    public String getVehicleName() {
        return "MotorCycle";
    }

    @Override
    public Integer getWheels() {
        return 2;
    }

    @Override
    public Integer getSeats() {
        return 2;
    }

    @Override
    public String getFuelType() {
        return "Petrol";
    }
}
