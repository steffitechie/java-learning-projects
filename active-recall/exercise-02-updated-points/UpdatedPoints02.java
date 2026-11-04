import java.util.Scanner;
public class UpdatedPoints02 {public static void main(String [] args){
Scanner scanner = new Scanner(System.in);

System.out.println("What is your player name?");
String name= scanner.nextLine();
System.out.println("How many points do you have?");
int points = Integer.valueOf(scanner.nextLine());
System.out.println("How many bonus points did you earn?");
int bonusPoints = Integer.valueOf(scanner.nextLine());

System.out.println("");
System.out.println("___ PLAYER PROFILE ___");
System.out.println("Player: " + name);
System.out.println("Previous points: " + points);
points += bonusPoints;  // The existing points update without having to declare it again.
System.out.println("Updated points: " + points);
}
}
