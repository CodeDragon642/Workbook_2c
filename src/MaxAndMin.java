import java.util.Random;

public class MaxAndMin {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        //intialise array1 with 10 numbers
        int[] numbers = new int [10];
        //generate 10 random numbers for the array, numbers should be between 1 to 20
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = randomGenerator.nextInt(10) + 1;
            System.out.print(numbers[i] + " ");
        }
        //initialise values for the maximum and minimum to be used for comparison
        int max = numbers[0];
        int min = numbers[0];

        //use a for loop to work through the array and if statements to check the value at the index against the max and min
        for (int i = 0; i<numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println(" ");
        System.out.println("The maximum value in the array is " + max + ". The minimum value in the array is " + min);

        int [] oddNumbers= new int[10];
        int [] evenNumbers= new int[10];

        System.out.print("The odd numbers in the array are: ");
        for (int i=0; i<numbers.length; i++) {
            if (!(numbers[i] % 2 == 0)) {
                oddNumbers[i] = numbers[i];
                System.out.print(oddNumbers[i] + " ");
            }
        }
        System.out.println(" ");
        System.out.print("The even numbers in the array are: ");
        for (int i=0; i<numbers.length; i++){
            if (numbers[i]%2==0){
                evenNumbers[i] = numbers[i];
                System.out.print(evenNumbers[i] + " ");
            }
        }

        //int oddNumbers=0;
        //int evenNumbers=0;

        //for (int i:numbers){
            //if(!(i%2==0)){
                //System.out.print(numbers[i]);
                //oddNumbers++;
            //}
            //else if (i%2==0){
                //System.out.print(i);
                //evenNumbers++;
            //}
        //}
        //System.out.println("There are " + oddNumbers + " odd numbers in the array.");
        //System.out.println("There are " + evenNumbers + " even numbers in the array.");
    }
}