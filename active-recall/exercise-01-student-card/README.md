# Student Card – Java Exercise 01

## About the Project

This is a simple Java program I made to practice working with user input and variables. The program asks for a student's name, age, study program, daily study hours, and whether they study full-time. It then uses that information to print a student card.

## Example Output

```text
What is your name?
Steffany
How old are you?
22
What program are you studying?
Computer and System Sciences
How many hours do you study per day?
9
Are you a full-time student?
true

--- STUDENT CARD ---
Name: Steffany
Age: 22
Program: Computer and System Sciences
Study hours per day: 9
Full-time student: true
```

## What I Practiced

- Using `Scanner` and `nextLine()` to read user input.
- Storing information in variables using `String`, `int`, `double`, and `boolean`.
- Converting user input with `Integer.valueOf()`, `Double.valueOf()`, and `Boolean.valueOf()`.
- Combining text and variables using `+`.
- Printing information using `System.out.println()`.
- Writing comments to make the code easier to understand.

## What I Learned

The mistakes I've made throughout the coding process are:

- **Importing Scanner:** Placed `import java.util.Scanner;` inside the `main` method, right before creating the Scanner object. Learned that imports need to be placed outside the class, usually at the top of the file.

- **Inconsistent variable names:** Accidentally used `scanner.nextLine()` later in the code, even though i've named my Scanner object `scan`. Realized later on that Java requires me to use the exact same variable name I declared.

- **Forgetting `new`:** I initially forgot to use the `new` keyword when creating the Scanner object. I knew of `Scanner(System.in)`, but forgot to write `new` in order to call the instructor.


## Tools Used

- Java
- IntelliJ IDEA
