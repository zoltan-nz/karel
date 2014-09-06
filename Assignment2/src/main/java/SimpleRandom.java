import acm.program.*;
import acm.util.*;

public class SimpleRandom extends ConsoleProgram {

    private static final int KOCKA_OLDAL_SZAMA = 6;

    public void run() {

        while(true) {
            myRGen.setSeed(1);
            int kockakSzama = readInt("Hany darab kockad van? ");
            int maxEzJohetKi = kockakSzama * KOCKA_OLDAL_SZAMA;
            int dobasSzamlalo = 0;
            while (true) {
                int dobottOsszeg = rollDice(kockakSzama);
                dobasSzamlalo++;
                if (dobottOsszeg == maxEzJohetKi) break;
                println(dobottOsszeg);
            }

            println(dobasSzamlalo + " " + maxEzJohetKi);
            if (readInt("Exit for 0: ") == 0) break;
        }
    }

    private int rollDice(int numDice) {
        int ossszesen = 0;
        for (int i=0; i<numDice; i++) {
            ossszesen += myRGen.nextInt(1, KOCKA_OLDAL_SZAMA);
        }
        return ossszesen;
    }

    private RandomGenerator myRGen = RandomGenerator.getInstance();
}
