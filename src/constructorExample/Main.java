package constructorExample;


public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Silver");
        Car mySecondCar = new Car("Red");

        String myCarColor = myCar.getColor();
        String mySecondCarColor = mySecondCar.getColor();

        System.out.println(myCarColor);
        System.out.println(mySecondCarColor);

    }


}
