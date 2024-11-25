class Array {
    public static void main(String args[]) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};//acutal array
        ReverseArray obj = new ReverseArray();
        obj.reverseArray(arr);
        for (int i : arr) {
            System.out.println(" " + i);
        }
    }
}

class ReverseArray {

    public void reverseArray(int[] array) { //two pointers algorithm for array reversal
       
        int start = 0, end = 0, temp = 0;//declaration
        end = array.length - 1;

        while (start < end) {//while loop to reverse the array 
            temp = array[start];
            array[start] = array[end];
            array [end] = temp;
            start++;
            end--;
        }

    }

}
