class MethodOverloading {

    public static void main(String args[]) {

        Calc obj; //creating reference variable for storing the object reference

        obj = new Calc();
        
        //variable declaration and definition
        int n = 10;
        int m = 20;
        int o = 30;

        double nn = 10.10;
        double mm = 20.20;
        double oo = 30.30;

        int twoPara = 0; 
        int threePara = 0;
        
        double twoPa = 0.0;
        double threePa = 0.0;
        
        //intiale value to the variables from the instance of the different argumented method
        twoPara = obj.addNum(n, m);
        threePara = obj.addNum(n, m, o);

        twoPa = obj.addNum(nn, mm);
        threePa = obj.addNum(nn, mm, oo);

        //print the details
        System.out.println("Two Integer parameter result is         : " + twoPara);
        System.out.println("Three Integer parameter result is       : " + threePara);

        System.out.println("Two double parameter result is          : " + twoPa);
        System.out.println("Three double parameter result is        : " + threePa);

    }

}

class Calc {//Method Overlaoding

    public int addNum(int n, int m) {//same method name with two integer parameter
        return n + m;//return integer value 
    }

    public int addNum(int n, int m, int o) {//same method name with three integer parameter
        return n + m + o;//return integer value 
    }

    public double addNum(double n, double m) {//same method name with two double parameter
        return n + m;//return double value
    }

    public double addNum(double n, double m, double o) {//same method name with three double parameter
        return n + m + o;//return double value
    }
}

