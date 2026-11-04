import java.util.Scanner;
public class StudentCard { public static void main(String[] args) {

    // Creating a scanner object for the user's input.
    Scanner scan = new Scanner(System.in);

    /*
     * Reading the student's input
     * and storing them in variables.
     */
    System.out.println("What is your name?");
    String name = scan.nextLine();
    System.out.println("How old are you?");
    int age = Integer.valueOf(scan.nextLine());
    System.out.println("What program are you studying?");
    String program = scan.nextLine();
    System.out.println("How many hours do you study per day?");
    double hours = Double.valueOf(scan.nextLine());
    System.out.println("Are you a full-time student?");
    boolean student = Boolean.valueOf(scan.nextLine());

    // Writing out the student card
    System.out.println();
    System.out.println("--- STUDENT CARD ---");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Program: " + program);
    System.out.println("Study hours per day: " + hours);
    System.out.println("Full-time student: " + student);
}
}
