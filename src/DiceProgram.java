import java.util.Random;
public class DiceProgram {
    public static void main(String[] args) {
        Random randomGenerator = new Random();

        int diceRoll = randomGenerator.nextInt(6)+1;

        System.out.println(diceRoll);
    }
}
