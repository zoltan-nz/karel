import acm.program.ConsoleProgram;

/**
 * Created by szines on 27/08/14.
 */
public class AddTwoIntegers extends ConsoleProgram {

    public void run() {

        int x = 5;
        double y = (double)x/2;

        println(y);

        int first = readInt("Enter the first number: ");
        int second = readInt("Enter the second number: ");
        int sum = first + second;
        println("Sum: " + sum);
    }
}
