package fruktKorg;

 //ovnLektion7
public class Fruit {
    private String name;
    private String color;

    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
        printColor(); // Skriver ut färgen vid skapandet av fruktobjektet
    }

    public String getName() {
        return name;
    }

    private void printColor() {
        System.out.println("Frukten är " + name + " och den är " + color + " i färgen.");
    }
}
