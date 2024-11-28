public abstract class Animal {
    protected boolean alive;
    protected Location location;

    public Animal(Location location) {
        this.alive = true;  
        this.location = location; 
    }

    public boolean isAlive() {
        return alive;
    }

    public void setDead() {
        alive = false;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    // Metode abstrak yang harus diimplementasikan oleh kelas turunannya
    public abstract void act(Field currentField, Field updatedField);
}
