package FirstFile.Interface;

public class Parrot extends Bird{


    public Parrot(String bird) {
        super(bird);
    }

    @Override
    public void fly() {
        System.out.println(this.getBreed() + " is Flying");
    }
}
