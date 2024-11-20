class Person {
    //properties
    private String name;
    private int age;
    private float height;
    private String color;
    
    //Behaviour
    public Person( String name, int age, float height, String color) {//Constructor with Argument
        this.name = name;
        this.age = age;
        this.height = height;
        this.color = color;
    }

    public Person() {//constructor without Argument
        name = "Noob";
        age = 18;
        height = 155.67f;
        color = "Black";
    }

    public void Details() {// get all properties details along the object
        System.out.println( name + "'s Age is " + age + " and his height is " + height + " than his color is " + color);
    }

    public void setName(String Name) {//setter method for Name 
        this.name = Name;
    }
    
    public void setAge(int age) {//setter method for Age
        this.age = age;
    }

    public void setHeight(float height) {//setter method for Height
        this.height = height;
    }

    public void setColor(String color) {//setter method for Color
        this.color = color;
    }
}

public class DemoClass { //Main class

    public static void main(String args[]) {

        Person ajay = new Person("Ajay", 22, 165, "brown");//first object Passing arguments

        ajay.Details();//print the details

        Person vijay = new Person();//without passing argument

        vijay.Details();//now print the Details

        Person asra = new Person();

        asra.setName("Asra");
        asra.setAge(20);
        asra.setHeight(160);
        asra.setColor("SandelBrown");

        asra.Details();
    }


}
