package FirstFile.Abstraction;

public abstract class Vehicle {
    
    private int noOfTyres;

    public Vehicle(int num){
        this.noOfTyres = num;
    }

    public int getNoOfTyres(){
        return noOfTyres;
    }

    public void setNoOfTyres(int num){
        noOfTyres = num;
    }

    public abstract void startVehicle();


}
