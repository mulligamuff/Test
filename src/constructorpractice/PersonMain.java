package constructorpractice;

public class PersonMain {

    public static void main(String[] args) {

        //Vi skapar ett objekt av klassen Person
        Person adam = new Person("Adam Thelin",36,191,110);
        Person freddy = new Person("Freddy Mercury",30,185,75,false);
        Person emil = new Person("Emil Eriksson", 15, 175, 50);
        Person john = new Person();


        //Vi skriver ut informationen som returneras ifrån
        //getName i Person.
        //System.out.println(adam.getName());
        adam.printPersonInfo();
        freddy.printPersonInfo();
        //emil.printPersonInfo();
        adam.setHeight(80);
        //adam.printPersonInfo();
        emil.hello();
        john.printPersonInfo();
    }

}
