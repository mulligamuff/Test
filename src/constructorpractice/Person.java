package constructorpractice;

public class Person {
    //Vi skapar attribut som inte innehåller några värden
    //Vi använder private istället för public
    //vilket gör att vi enbart kan komma åt variablerna innifrån
    //vår klass!
    private String name;
    private int age;
    private int height;
    private int weight;
    private boolean isAdult;
    private boolean isAlive;

    //Vi skapar en konstruktor, notera att konstruktorn inte måste
    //innehålla något, men det som vi skriver i konstruktorn
    //kommer att utföras när vi skapar ett Objekt av Klassen Person
    Person(String myName, int myAge, int myHeight, int myWeight){
        //Vi sätter name (private name) Till värdet som vi skickar in ifrån
        //Main metoden.
        name = myName;
        age = myAge;
        height = myHeight;
        weight = myWeight;
        //vi sätter ett standardvärde på alive i konstruktorn.
        isAlive = true;
        //Om personen är över 18 år så är adult = true, men
        //isAdult är false när vi skapar den.
        if (myAge >= 18){
            isAdult = true;
        }
    }
    //En andra konstruktor! Vi har lagt till myLife och sätter ett värde på isAlive igenom konstruktorns signatur
    Person(String myName, int myAge, int myHeight, int myWeight, boolean myLife){
        //Vi sätter name (private name) Till värdet som vi skickar in ifrån
        //Main metoden.
        name = myName;
        age = myAge;
        height = myHeight;
        weight = myWeight;
        // Vi ger isAlive ett startvärde i den här konstruktorn
        isAlive = myLife;
        //Om personen är över 18 år så är adult = true, men
        //isAdult är false när vi skapar den.
        if (myAge >= 18){
            isAdult = true;
        }
    }
    //Vi kan ha en tredje konstruktor som bara har standardvärden!
    //Detta innebär att vi kan ha olika konstruktorer beroende på vilka värden
    //som vi skickar in i konstruktorns signatur
    Person(){
        name = "John Doe";
        age = 30;
        height = 185;
        weight = 85;
        isAlive = true;
        isAdult = true;
    }
    //Vi bestämmer vilken sorts variabel vi ska returnera
    //igenom att skriva "String, double, int, void etc" i vår metod.
    public String getName(){
        //Vi skickar tillbaka innehållet i name.
        return name;
    }
    //Vi har satt metodens return type till void.
    //Detta betyder att metoden inte skickar tillbaka någon
    //specifik information.
    public void printPersonInfo(){
        System.out.println(name + " is " + age + " years old, and is " +
                height + "cm tall, " + name + " weighs " + weight + "kg.");
        System.out.println(name + " is an adult:" + isAdult);
        System.out.println(name + " is alive:" + isAlive);
    }
    //Personen säger hej igenom att vi kallar på det satta namnet.
    public void hello(){
        System.out.println(name + " says hello!");
    }
    // Vi bestämmer en ny height igenom att ta in newHeight ifrån
    // huvudmetoden och sätter height i Person klassen till newHeight!
    public void setHeight(int newHeight){
        height = newHeight;
    }

}
