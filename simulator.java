public class Simulator {
    public static void main(String[] args) {
        Field field = new Field(10, 10);

        Location foxLocation = new Location(4, 4);
        Location rabbitLocation = new Location(5, 5);

        Fox fox = new Fox(foxLocation);
        Rabbit rabbit = new Rabbit(rabbitLocation);

        field.place(fox, foxLocation);
        field.place(rabbit, rabbitLocation);

        System.out.println("Sebelum tindakan:");
        System.out.println("Rubah di: " + fox.getLocation());
        System.out.println("Kelinci di: " + rabbit.getLocation());

        fox.act(field, field);
        rabbit.act(field, field);

        System.out.println("\nSetelah tindakan:");
        System.out.println("Rubah di: " + fox.getLocation());
        System.out.println("Kelinci di: " + rabbit.getLocation());
    }
}
