public Fox(Location location) {
        super(location);  
    }

    @Override
    public void act(Field currentField, Field updatedField) {
        if (isAlive()) {
            List<Location> adjacent = currentField.adjacentLocations(getLocation());
            for (Location loc : adjacent) {
                Object animal = currentField.getObjectAt(loc);
                if (animal instanceof Rabbit) {
                    Rabbit rabbit = (Rabbit) animal;
                    rabbit.setDead();  
                    setLocation(loc); 
                    updatedField.place(this, loc);  
                    return;  
                }
            }
            
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
