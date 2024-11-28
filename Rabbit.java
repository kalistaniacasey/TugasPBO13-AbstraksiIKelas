import java.util.Random;

public class Rabbit extends Animal {
    private static final Random rand = new Random();

    public Rabbit(Location location) {
        super(location); 
    }

    @Override
    public void act(Field currentField, Field updatedField) {
        if (isAlive()) {
            Location newLocation = updatedField.freeAdjacentLocation(getLocation());
            if (newLocation != null) {
                setLocation(newLocation);
                updatedField.place(this, newLocation); 
            } else {
                setDead(); 
            }
        }
    }
}
