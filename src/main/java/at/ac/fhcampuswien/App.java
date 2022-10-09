package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        double highest = 0;

        System.out.print("Number " + count + ": ");
        double number = scanner.nextDouble(); //decimals

        if (number <= 0){ //check whether the first number is smaller/equal 0
            System.out.print("No number entered." + System.lineSeparator());
        } else {
            do {
                if (number > highest) {
                    highest = 0 + number;
                }
                {
                    count++;
                    System.out.print("Number " + count + ": ");
                    number = scanner.nextDouble();
                }
            } while (number > 0);
            System.out.printf("The largest number is %.2f", highest);
            System.out.println();
        }
    }

    //todo Task 2
    public void stairs() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 1;
        System.out.print("n: ");

        if (n <= 0) {
            System.out.println("Invalid number!");
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    int num = a++;
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
    }

    //todo Task 3
    public void printPyramid(){
        int a = 6;
        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < a - i; j++) {
                System.out.print(" ");
            }
            for (int s = 0; s < i * 2 - 1; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        Scanner scanner = new Scanner(System.in);
        int negative = 0;
        int sum = 0;
        int count = 0;

        for (int i = 1; i > 0; i++) {
            System.out.print("Mark " + i + ": ");
            int mark = scanner.nextInt();

            if (mark == 5) {
                sum = sum + mark;
                negative = negative + 1;
                count = count + 1;
            } else if (mark < 0 || mark > 5) { // <0 weil wir schon die Bedingung == 0 haben
                System.out.println("Invalid mark!");
                i = i - 1;
            } else {
                sum = sum + mark;
                count = count + 1;
            }
            if (mark == 0 && i == 1) {
                System.out.println("Average: 0.00");
                System.out.println("Negative marks: 0");
                break;
            } else if (mark == 0) {
                count = count - 1;
                double average = (double) sum / count;
                System.out.printf("Average: %.2f", average);
                System.out.println();
                System.out.print("Negative marks: " + negative);
                System.out.println();
                break;
            }
        }
    }

    //todo Task 6
    public void happyNumbers(){
        System.out.print("n: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = 0;
        while (result != 1 && result != 4){
            result = 0;
            while (num != 0) {
                int digit = num % 10;
                result = result + digit * digit;
                num = num / 10;
            }
            num = result;
        }
        if (result == 1) {
            System.out.print("Happy number!" + System.lineSeparator());
        } else {
            System.out.print("Sad number!" + System.lineSeparator());
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}