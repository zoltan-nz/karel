import acm.program.*;
import acm.util.*;

public class SimpleRandom extends ConsoleProgram {

    public void run() {
        int kockaDobas = myRGen.nextInt(1, 6);
        println("Dobott szam: " + kockaDobas);
    }

    private RandomGenerator myRGen = RandomGenerator.getInstance();
}
