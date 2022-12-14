import java.util.Random;

public class Duplicates {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        //intialise array1 with 10 numbers
        int[] array1 = new int [10];
        System.out.print("array1 = ");
        //generate 10 random numbers for array1, numbers should be between 1 to 20
        for (int i=0; i<array1.length; i++){
            array1[i] = randomGenerator.nextInt(20)+1;
            System.out.print(array1[i] + " ");
        }
        System.out.println(" "); //used for layout purposes

        //initialise array2 and fill with random values, then print to check.
        int[] array2 = new int [10];
        System.out.print("array2 = ");
        for (int i=0; i<array2.length; i++){
            array2[i] = randomGenerator.nextInt(20)+1;
            System.out.print(array2[i] + " ");
        }
        //extra print commands for a prettier layout
        System.out.println(" ");
        System.out.println("The duplicate numbers from the two arrays are: ");

        //use nested for loops to check for duplicate numbers by comparing the values in array1 with array2
        for (int i=0; i<array1.length; i++){
            for (int j=0; j<array2.length; j++){
                if (array1[i] == array2[j]){
                    System.out.println(array1[i]);
                }
            }
        }
    }
}