import java.util.Scanner;

public class challengeTwo {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("What is Your name?");
        String name = reader.nextLine();

        boolean checker = false;

        while (!checker) {
            if (name != "" && name.chars().allMatch(Character::isLetter)) {
                System.out.println("Hello " + name);
                checker = true;
            } else {
                System.out.println("Please enter Your name again!");
                name = reader.nextLine();
            }
        }
    }
}

// Task : Print out Hello + user input, but only if input contains only letters (no numbers. special char. or empty input)