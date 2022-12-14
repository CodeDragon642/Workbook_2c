import java.util.Random;

public class MaxAndMin {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        //intialise array1 with 10 numbers
        int[] numbers = new int [10];
        //generate 10 random numbers for the array, numbers should be between 1 to 20
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = randomGenerator.nextInt(20) + 1;
            System.out.print(numbers[i] + " ");
        }
        //initialise values for the maximum and minimum to be used for comparison
        int max = numbers[0];
        int min = numbers[0];
        //use a for loop to work through the array and if statements to check the value at the index against the max and min
        for (int i = 0; i<numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
            else if (numbers[i] < min){
                min = numbers[i];
            }
        }
        System.out.println(" ");
        System.out.println("The maximum value in the array is " + max + ". The minimum value in the array is " + min);
    }
}