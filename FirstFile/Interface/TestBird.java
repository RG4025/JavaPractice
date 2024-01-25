package FirstFile.Interface;


public class TestBird {

    public static void main(String[] args) {

        System.out.println("Using the interface declared The method and accessed in the Parrot Class!1");

        Parrot obj = new Parrot("Parrot");
        String breed =   obj.getBreed();
        System.out.println(breed + " is new Breed!");
        obj.fly();
    }
}
