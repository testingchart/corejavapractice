package Inheritance_Polymorphism;

public abstract class AbstractVehicle {

    public abstract Integer getWheels();
    public abstract Integer getSeats();
    public abstract String getVehicleName();

    public String getFuelType(){
        return "Gas";
    }

    @Override
    public String toString() {
        return  "It is a "+getVehicleName()+"\nSeats : " + getSeats() +"\nRuns of wheels: "+ getWheels() +"\nuses : "+getFuelType();
    }

}
