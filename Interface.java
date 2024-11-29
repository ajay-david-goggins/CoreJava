interface Computer {
    void code(); // public abstract (default)
}

interface Customer01{
    int  lanline = 987878;// static and final(default)
    String address = " 9/112C, Trichy";
    String email = "companyemailaddress@yahoo.com";

    void retailSoftware();
    void billingSoftware();
}

interface Docuemnt extends Customer01 {
    void sendDocument();
    void sendManual(); 
}

class Desktop implements Computer{
    public void code() {
        System.out.println("code, debug, deploy : faster");
    }
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code, debug, deploy");
    }
}

class Developer {
    public void devApp(Computer com) {
        com.code();
    }
    public void retailSoftware() {
        System.out.println("Build a retail software with unique feature");
    }

    public void billingSoftware() {
        System.out.println("It is also Extend in the retails software");
    }
}

class Manager implements Customer01 {
    void sendDocument() {
        System.out.println("Give Document to Customer Email id : " + Customer01.email);
    }

    void sendManual() {
        System.out.println("post Manual to Address : " + Customer01.address);
    }

    public void retailSoftware() {
        System.out.println("Build a retail software with unique feature");
    }

    public void billingSoftware() {
        System.out.println("It is also Extend in the retails software");
    }
}

class Main {
   public static void main(String args[]) {
    Computer lap = new Laptop();
    Computer desk = new Desktop();

    Developer ajay = new Developer();
    Developer vijay = new Developer();

    Manager muthu = new Manager();
    ajay.devApp(lap);
    vijay.devApp(desk);

    ajay.retailSoftware();
    vijay.billingSoftware();
    
    muthu.sendDocument();
    muthu.sendManual();
   }  
}