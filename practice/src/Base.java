import Inheritance_Polymorphism.Bus;
import Inheritance_Polymorphism.Car;

public class Base {
    public static void main(String[] args) throws Exception {
        //Loops.forLoops();
        //Loops.whileLoops();
        //DataStructures.array();
        //DataStructures.arrayList();
        //DataStructures.map();
        //DataTypes.primitiveTypes();
        //DataTypes.referenceTypes();
        /* Methods.Java
        Methods.voids();
        Methods.booleans();
        int num = Methods.integers();
        System.out.println(num);
        double temp = Methods.doubles();
        System.out.println(temp);
        String getString = Methods.strings();
        System.out.println(getString);
        String s = Methods.parameterizedMethod("Kodi");
        System.out.println(s);
        String moreMthdz = Methods.userLogin("Kodizen", 123456);
        System.out.println(moreMthdz);*/

        /* Objects
        Object.createUser();
        Object.verifyLogin();*/

       //Inheritance_Polymorphism.Vehicle vehicle = new Bus(); won't work until implements interface Vehicle.java
        Inheritance_Polymorphism.AbstractVehicle abstractVehicle = new Bus();
        System.out.println(abstractVehicle.toString());
    }
}
