class wrapper {
    public static void main(String args[]) {
        int num = 7;

        Integer o = new Integer(num); // boxing 

        Integer O = 10; // auto - boxing

        int a = o.intValue(); // unboxing

        int A = O; // auto - unboxing

        System.out.println(" o : " + o);
        System.out.println(" O : " + O);
        System.out.println(" a : " + a);
        System.out.println(" A : " + A);

        String str = "128";
        String rts = "129.9";

        int x = Integer.parseInt(str);
        double y = Double.parseDouble(rts);

        System.out.println(" x : " + x);
        System.out.println(" y : " + y);
    }
}