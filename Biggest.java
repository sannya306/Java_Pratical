public class Biggest {
    private int[] array;
    
    // Constructor
    public Biggest(int[] arr) {
        this.array = arr;
    }
    
    // Method to find and display the largest element
    public void display() {
        if (array == null || array.length == 0) {
            System.out.println("Array is empty.");
            return;
        }
        
        int largest = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        
        System.out.println("The largest element in the array is: " + largest);
    }
    
    public static void main(String[] args) {
        // Sample array
        int[] numbers = {23, 45, 12, 78, 34, 56, 19};
        
        // Create instance of Biggest class
        Biggest big = new Biggest(numbers);
        
        // Display the array
        System.out.print("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Find and display the largest element
        big.display();
    }
}
