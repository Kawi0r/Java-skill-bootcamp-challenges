import java.util.Scanner;

import java.util.Random;

import java.util.Timer;
import java.util.TimerTask;


public class challengeOne {
    public static void main(String[] args) {

        String[] strJokes = new String[] {
                "Q. How did the programmer die in the shower?\n" +
                        "A. He read the shampoo bottle instructions: Lather. Rinse. Repeat.",

                "How many programmers does it take to change a light bulb?\n" +
                        "None – It’s a hardware problem",

                "There are only 10 kinds of people in this world: those who know binary and those who don’t.",

                """
            “Knock, knock.”
            “Who’s there?”
            very long pause….
            “Java.”""",

                "“I just saw my life flash before my eyes and all I could see was a close tag…”",

                "The computer is mightier than the pen, the sword, and usually, the programmer.",

                "Debugging: Removing the needles from the haystack.",

                "Q:\tWhy does God allow evil to happen?\n" +
                        "A:\tGod thought He eliminated evil in one of the earlier versions.",

                """
            Just because I'm a programmer doesn't mean I can fix your printer
            I mean...
            I can fix it...
            But not because I'm a programmer!""",

                """
            Designers:
            D1: Look, we have similar ideas.
            D2: No! You stole my Idea!
            Programmers:
            P1: Man, I stole your code.
            P2: It's not my code..."""
        };

        int arrayLength = strJokes.length;

        Random rand = new Random();
        int int_random = rand.nextInt(arrayLength);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Press Enter!");
                new Scanner(System.in).nextLine();
                System.out.println(strJokes[int_random]);
            }
        },3000, 1000);
    }
}
