import java.util.Random;

public class ArrayOne {
    public static void main(String args[]) {
        
        int[] arr01; //recommend declaration
        int arr02[]; //also acceptable
    
        int[] arr03 = new int[5]; //initialization
        
        int[] arr04 = {0, 1, 2, 3, 4}; // also declare declare and initialize in single step

        //Accessing elements

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        //printing the element using for loop
        System.out.println("--------------------for-loop----------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("        " + arr[i]);
        }
        
        //printing the element using for each or enhanced for loop
        System.out.println("-------------------for-each---------------------------------");
        
        for (int num : arr) {
            System.out.println("        " + num);
        }

        System.out.println("--------------------One-Dimensional-Array-------------------");

        System.out.println();
        OneDimensionalArray oneDi1 = new OneDimensionalArray(); //Default Array
        System.out.println("Default Array");
        oneDi1.printArray();

        System.out.println();
        OneDimensionalArray oneDi2 = new OneDimensionalArray(10); //Parameterized Array 
        System.out.println("Customized Array");
        oneDi2.printArray();

        System.out.println("--------------------Two-Dimensional-Array-------------------");

        System.out.println();
        TwoDimensionalArray twoDi1 = new TwoDimensionalArray(); //Default Array
        System.out.println("Default Array");
        twoDi1.printArray();

        System.out.println();
        TwoDimensionalArray twoDi2 = new TwoDimensionalArray(5, 5); //Parameterized Array 
        System.out.println("Customized Array");
        twoDi2.printArray();
        
        System.out.println("------------------Three-Dimensional-Array-------------------");

        System.out.println();
        ThreeDimensionalArray threeDi1 = new ThreeDimensionalArray(); //Default Array
        System.out.println("Default Array");
        threeDi1.printArray();

        System.out.println();
        ThreeDimensionalArray threeDi2 = new ThreeDimensionalArray(5, 5, 5); //Parameterized Array 
        System.out.println("Customized Array");
        threeDi2.printArray();

        System.out.println("------------------------Jagged-Array--------------------------");

        System.out.println();
        JaggedArray jagged = new JaggedArray();
        System.out.println("Default Array");
        jagged.printArray();

        System.out.println();
        JaggedArray jag = new JaggedArray(3, 4, 5);
        jag.printArray();

    }
}

class OneDimensionalArray {
    
    private int[] arr; 
    private int size;

    OneDimensionalArray() { // Default Constrcutor
        size = 5;
        arr = new int[size];
        populateArray();
    }

    OneDimensionalArray(int n) { // Parameterized Constructor
       size = n;
       arr = new int[size];
       populateArray();
    }

    private void populateArray() { 
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(10);
        }
    }

    public void printArray() {
        System.out.println();
        for (int val : arr) {
            System.out.print(val + "  ");
        }
        System.out.println();
    }
}

class TwoDimensionalArray {
    private int[][] arr;
    private int row, col;

    TwoDimensionalArray() {//default constructor
        row = 3;
        col = 3;
        arr = new int[row][col];
        populateArray();
    }

    TwoDimensionalArray(int r, int c) {//parameterized constructor
        row = r;
        col = c;
        arr = new int[row][col];
        populateArray();
    }

    private void populateArray() {//random elements initialize value to the array
        Random random = new Random();
        for (int[] roo : arr) {
            for (int i = 0; i < roo.length; i++) {
                roo[i] = random.nextInt(10);
            }
        }
    }

    public void printArray() {
        for (int[] roo : arr) {
            for (int col: roo) {
                System.out.print("  " + col);
            }
            System.out.println();
        }
    }
}

class ThreeDimensionalArray {
    private int[][][] arr;
    private int i, j, k;

    ThreeDimensionalArray() {//default constructor
        i = 3;
        j = 3;
        k = 3;
        arr = new int[i][j][k];
        populateArray();
    }

    ThreeDimensionalArray(int i, int j, int k) {//parameterized constructor
        this.i = i;
        this.j = j;
        this.k = k;
        arr = new int[i][j][k];
        populateArray();
    }

    private void populateArray() {//random elements initialize value to the array
        Random random = new Random();
        for (int[][] layer: arr) {
            for (int[] roo : layer) {
                for (int i = 0; i < roo.length; i++) {
                    roo[i] = random.nextInt(10);
                }
            }
        }
    }

    public void printArray() {
        for (int i = 0; i < arr.length ; i++  ) {
            System.out.println("Layer " + (i+1) + " : ");
            for (int[] roo : arr[i]) {
                for (int val : roo) {
                    System.out.print("  " + val);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

class JaggedArray {

    private int[][] arr;
    private int i, j, k;

    public JaggedArray() {
        i = 5;
        j = 3;
        k = 4;
        arr = new int[3][];
        arr[0] = new int[i];
        arr[1] = new int[j];
        arr[2] = new int[k];

        populateArray();
    }

    public JaggedArray(int i, int j, int k) {
        this.i = i;
        this.j = j;
        this.k = k;
        arr = new int[3][];
        arr[0] = new int[i];
        arr[1] = new int[j];
        arr[2] = new int[k];

        populateArray();
    }

    private void populateArray() {
        Random random = new Random();
        for (int[] roo : arr) {
            for (int i = 0; i < roo.length; i++) {
                roo[i] = random.nextInt(10);
            }
        }
    }

    public void printArray() {
        for (int[] roo : arr) {
            for (int val : roo) {
                System.out.print(" " + val);
            }
            System.out.println();
        }
    }


