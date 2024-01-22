package FirstFile.Abstraction;

public class TestVehicle {
    public static void main(String[] args) {
        
        System.out.println("using abstract vehicle class access the properties and the methods of the vehicle class using the Car Class..");

        Car obj = new Car();
        obj.setNoOfTyres(10);
        int numOfTyres =   obj.getNoOfTyres();
        System.out.println("Total number of tyres is :" + numOfTyres);
        obj.startVehicle();
    }
}
