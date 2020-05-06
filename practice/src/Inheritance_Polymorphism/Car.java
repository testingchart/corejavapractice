package Inheritance_Polymorphism;

public class Car extends AbstractVehicle {

    @Override
    public String getVehicleName() {
        return "Car";
    }

    @Override
    public Integer getWheels() {
        return 4;
    }

    @Override
    public Integer getSeats(){
        return 5;
    }

}
