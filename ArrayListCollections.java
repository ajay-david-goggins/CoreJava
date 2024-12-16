import java.util.ArrayList; //classs

public class ArrayListCollections {
    public static void main(String args[]) {
        //declare and initialize an ArrayList of String 
        
        ArrayList<String> developers = new ArrayList<>();

        // Add elements
        developers.add("Ajay");
        developers.add("Vijay");
        developers.add("Aravinth");
        developers.add("MuthuKrishnan");
        developers.add("Dheena");
        
        System.out.println("\nInitiale ArrayList      : " +  developers);

        // Access an specific index Element (--objectReference.get(index);--)
        System.out.println("\nAccessing second Element      : " + developers.get(2));
        System.out.println("Accessing third Element       : " + developers.get(3));
        System.out.println("Accessing fourth Element      : " + developers.get(4));

        // insert an specific index
        developers.add(2,"Dinesh");
        
        System.out.println("\nAfter insert new Element to ArrayList      : " +  developers);

        // remove an specific index
        developers.remove("Ajay");

        System.out.println("\nAfter removed an Element to ArrayList      : " +  developers);

        //update or modify an element (--objectReference.set(index)--);
        developers.set(0, "MSC");
        developers.set(1, "Ethical Hacker");
        developers.set(2, "DataAnalyist");
        developers.set(3, "Professor");
        developers.set(4, "Server-side-security Maintener");

        System.out.println("After Modifying ArrayList : " + developers);


        //search for an element (--objectReference.contains("element");--)
        System.out.println("Hacker is in the developer ArrayLit      : " + developers.contains("Ethical Hacker"));
        System.out.println("Msc student in the developer ArrayList   : " + developers.contains("MSC"));
        System.out.println("Terorist is in the developer ArrayList   : " + developers.contains("Terrorist")); // false. becase no terrorist is in the Array list 

        //Find index of an element (obectReference.indexOf(index));
        System.out.println("Index of Professor          :        " + developers.indexOf("Professor"));
        System.out.println("Index of Ethical Hacker     :        " + developers.indexOf("Ethical Hacker"));
    


    ArrayList<String> fighters = new ArrayList<>();

    fighters.add("BruceLee");
    fighters.add("Donniyen");
    fighters.add("Jackiechan");
    fighters.add("MickeTyson");
    fighters.add("MuhamadAli");

    //Traversing on ArrayList
    //using for loop 
    for (int i = 0; i < fighters.size(); i++) {
        System.out.println("Figher No " + (i + 1) +  " : " + fighters.get(i));
    }

    //using Enhanced for loop
    int i = 1;
    for (String developer : developers) {
        System.out.println("Developer " + (i++) + "'s status is " + developer);
    }

    //clear the ArrayList
    developers.clear();
    System.out.println("After clear the ArrayList  : " + developers);

    //checking the element in the ArrayList is Empty or not
    System.out.println("Is the Developers ArrayList is Empty : " + developers.isEmpty());

    //find the size of the ArrayLit
    System.out.println("The size of the ArrayList is :  " + fighters.size());

    //sorting ArrayList
    java.util.Collections.sort(fighters);
    System.out.println("Sorted ArrayList is : " + fighters);

    //ArrayList to Array
    String[] array = fighters.toArray(new String[5]);

    System.out.println("Array :");
    for (String j : array) System.out.println(j);


    //Array to ArrayList
    ArrayList<String> savage = new ArrayList<>(java.util.Arrays.asList(array));
    
    System.out.println("ArrayList :");
    for (String x : savage) System.out.println(x);

    }

}

//ArrayList
/*
    -> ArrayList is a resizeable array in java 
    -> it is part of java.util package 
    -> Unlike array, the size of an ArrayList can dynamically shrink and grow.

Operations:

* Basics of ArrayList
* Adding, Accessing, Modifying, and Removing elements
* Sorting and Searching
* Traversing an ArrayList
* Conversion between arrays and lists
* Advanced operations (clear, isEmpty, size

 */
 

