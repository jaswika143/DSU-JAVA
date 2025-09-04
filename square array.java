
    public class SquareArray {
    public static void main(String[] args) {
        // 1. Declare and Initialize the Array
        int[] squaresArray = new int[10];

        // 2. Populate the Array with Squares
        for (int i = 0; i < squaresArray.length; i++) {
            squaresArray[i] = i * i; 
        }

        // 3. Optional: Print the Array Elements
        System.out.println("Squares of numbers (0-9) stored in the array:");
        for (int i = 0; i < squaresArray.length; i++) {
            System.out.println("Square of " + i + " is: " + squaresArray[i]);
        }
    }
}

