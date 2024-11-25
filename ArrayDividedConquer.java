class Array {
    public static void main(String args[]) {
        int[] arr = {12, 234 ,343, 342, -34, 34, 45 ,34, -345, 345};
        Pair result = dividedConquer(arr, 0, arr.length -1);
        System.out.println("The Maximux Value is : " + result.max);
        System.out.println("The Minimum Value is : " + result.min);
    }
    public static Pair dividedConquer(int[] arr, int low, int high) {//return the object reference for the Pair class with parameterized constructor 
        if (high == low) {//for single elelment
            return new Pair(arr[low], arr[high]);
        }
         
        if (high == low + 1) {//for double element
            if (arr[high] > arr[low]) {
                return new Pair(arr[low], arr[high]); 
            } else {
                return new Pair(arr[high], arr[low]);
            }
        }

        //more than 2 elelments
        int mid = ( high + low ) / 2;
        Pair left = dividedConquer(arr, low, mid);
        Pair right = dividedConquer(arr, (mid + 1), high);

        int max = Math.max(left.max, right.max);
        int min = Math.min(left.min, right.min);
        
        return new Pair(min, max);
    }
}

class Pair {//Storing values in seperate class 
    int min;
    int max;

    public Pair(int min, int max) {
        this.min = min;
        this.max = max;
    }
}
