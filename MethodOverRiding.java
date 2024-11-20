public class MethodOverRiding {
    public static void main(String args[]) {

        Animal myDog; //create a reference variable for Parent class
        myDog = new Dog();//Store the object reference of Dog class

        System.out.println();
        //call the  methods in the Dog class
        myDog.sound();
        myDog.eat();
        myDog.sleep();

        Animal myCat;//create a reference variable for Animal class(base class)
        myCat = new Cat();//Store the object reference of Cat class

        System.out.println();
        //call the methods in the Cat class
        myCat.sound();
        myCat.eat();
        myCat.sleep();

        Animal myCow;//create a reference variable for super class
        myCow = new Cow();//Store the object reference of the Cow class

        System.out.println();
        //call the methods in Cow class
        myCow.sound();
        myCow.eat();
        myCow.sleep();
    }
}

class Animal {//Parent class
    public void sound() {
        System.out.println(" Produce Unique Sound ");
    }

    public void eat() {
        System.out.println(" It eat food ");
    }

    public void sleep() {
        System.out.println("It is sleep");
    }
}

class Dog extends Animal {//child class
    @Override
    public void sound() {
        System.out.println("avov, avov, ...");
    }

    @Override 
    public void eat() {
        System.out.println("It eat Dog foods");
    }

    @Override 
    public void sleep() {
        System.out.println("It is sleep less hour because it is protect the people");
    }
}

class Cat extends Animal {//child class
    @Override
    public void sound() {
        System.out.println("Meow, Meow, ...");
    }

    @Override 
    public void eat() {
        System.out.println("It eat cat foods");
    }

    @Override 
    public void sleep() {
        System.out.println("It is sleep well");
    }
}

class Cow extends Animal {//child class
    @Override
    public void sound() {
        System.out.println("Maaa, Maaa ...");
    }

    @Override 
    public void eat() {
        System.out.println("It eat spaish and green leaf");
    }

    @Override 
    public void sleep() {
        System.out.println("It is sleep well");
    }
}
