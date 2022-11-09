import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        System.out.print("Enter the first number: ");
        try (Scanner reader = new Scanner(System.in)) {
            if (reader.hasNextInt()) {
                int num1 = Integer.parseInt(reader.nextLine());
                System.out.print("Enter the second number: ");
                int num2 = Integer.parseInt(reader.nextLine());
                System.out.print("Enter the third number: ");
                int num3 = Integer.parseInt(reader.nextLine());
                int a = maxMethod(num1, num2, num3);
                int b = minMethod(num1, num2, num3);
                System.out.println("The maximum is: " + a);
                System.out.println("The minimum is: " + b);
            } else if (reader.hasNextDouble()) {
                double num1 = Double.parseDouble(reader.nextLine());
                System.out.print("Enter the second number: ");
                double num2 = Double.parseDouble(reader.nextLine());
                System.out.print("Enter the third number: ");
                double num3 = Double.parseDouble(reader.nextLine());
                double a = maxMethod(num1, num2, num3);
                double b = minMethod(num1, num2, num3);
                System.out.println("The maximum is: " + a);
                System.out.println("The minimum is: " + b);
            }
        }
    }
    public static int maxMethod(int num1, int num2, int num3) {
        if (num1 > num2 && num2 > num3) {
            return num1;
        } else if (num1 < num2 && num2 < num3) {
            return num3;
        } else {
            return num2;
        }
    }

    public static int minMethod(int num1, int num2, int num3) {
        if (num1 < num2 && num2 < num3) {
            return num1;
        } else if (num3 < num1 && num2 > num3) {
            return num3;
        } else {
            return num2;
        }

    }
    public static double maxMethod(double num1, double num2, double num3) {
        if (num1 > num2 && num2 > num3) {
            return num1;
        } else if (num1 < num2 && num2 < num3) {
            return num3;
        } else {
            return num2;
        }
    }
    public static double minMethod(double num1, double num2, double num3) {
        if (num1 < num2 && num2 < num3) {
            return num1;
        } else if (num3 < num1 && num2 > num3) {
            return num3;
        } else {
            return num2;
        }
    }
}