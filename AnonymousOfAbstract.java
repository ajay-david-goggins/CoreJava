class A {
    public static void main(String args[]) {
       B objRef = new B() // it is not create B class object. it is create  a new anomyous class
       {
    public void show() {
        System.out.println("in new show");
    }

    public void config() {
        System.out.println("in new config");
    }
       }; 
       
       objRef.show();
       objRef.config();
       objRef.powerOff();
    }
}

abstract class B {
    abstract public void show();
    abstract public void config();

    public void powerOff() {
        System.out.println("Power off");
    }
}

/*
//instead of inherit class using anomyous class to override the method
class C extends B {
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }
}
*/