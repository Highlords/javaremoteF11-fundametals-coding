import java.rmi.ConnectIOException;
import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Task 1
        Perimeter perimeter = new Perimeter();
        double resultPerimeter = perimeter.calculatePerimeter(6.234f);
        System.out.println("Perimeter: %f , resultPerimeter");
        System.out.println("Perimeter: " + resultPerimeter + " , diameter = " + "6.234");

        // Task 17

        DayOff dayOff = new DayOff("2024-01-23");

        // Exercise

        double diameter;
        new CircleArea(45.5d);

        // Task 4

        Scanner scanner = new Scanner(System.in);

        System.out.println ("Enter a integer");
        int input = scanner.nextInt();
        new FizzBuzz(input);

        // Fibonacci series

        System.out.println("Fibonacci Series: \n Enter an Integer");
        int inputF = scanner.nextInt();
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.printFibonacciSeries(inputF);

    }
}




