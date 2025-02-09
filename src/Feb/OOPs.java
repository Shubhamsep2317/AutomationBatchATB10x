package Feb;

public class OOPs {
    public static void main(String[] args) {
        Dog d=new Dog("Timmy","LebraDog",5);
        System.out.println(d.name);
        System.out.println(d.breed);
        System.out.println(d.age);


        Dog d1=new Dog();
        System.out.println(d1.name);
        System.out.println(d1.breed);
        System.out.println(d1.age);

    }
}

class Dog{
    String name;
    String breed;
    int age;

    // Default Constructor
    Dog(){
        System.out.println("I am the default Constructor");
    }
    // Parameterised Constructor
    Dog(String dogName, String dogBreed, int dogAge){
        this.name=dogName;
        this.breed=dogBreed;
        this.age=dogAge;
    }
}
