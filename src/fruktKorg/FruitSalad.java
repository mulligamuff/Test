package fruktKorg;

 //ovnLektion7

public class FruitSalad {
    public static void main(String[] args) {
        Fruit firstFruit = new Fruit("Apple", "Green");
        Fruit secondFruit = new Fruit("Lemon", "Yellow");
        Fruit thirdFruit = new Fruit("Orange", "Orange");

        Fruit[] fruitSalad = {firstFruit, secondFruit, thirdFruit};

        System.out.print("Fruktsalladen innehåller: ");
        for (Fruit fruit : fruitSalad) {
            System.out.print(fruit.getName() + ", ");
        }
    }
}