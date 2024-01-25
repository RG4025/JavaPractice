package FirstFile.Interface;

public abstract class Bird implements Flyable{
    
    private String breed;

    public  Bird(String bird){
        this.breed = bird;

    }
    public String getBreed() {
        return breed;
    }
}
