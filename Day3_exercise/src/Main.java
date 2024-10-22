import java.util.Scanner;

/*
Author: Ahmed Essam Taj
Date: 22, October
Day 3 Exercise

 */
public class Main {
    public static void main(String[] args) {
/*
Q1 /Write a program that checks the role of the user

 */

        // ===== answer Q1 ==============

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your role; (admin), (superuser), (user) ");
        String role = in.nextLine();

        if(role.equalsIgnoreCase("admin")) {
            System.out.println("welcome admin");
        }else if(role.equalsIgnoreCase("superuser")) {
            System.out.println("welcome superuser");
        }else {
            System.out.println("welcome user");
        }


/*
Q2 /Take three numbers from the user and print the greatest number

 */

        // ===== answer Q2 ==============

        System.out.println("Please enter first number: ");
        int firstNumber = in.nextInt();
        System.out.println("Please enter second number: ");
        int secondNumber = in.nextInt();
        System.out.println("Please enter third number: ");
        int thirdNumber = in.nextInt();

        if(firstNumber>=secondNumber && firstNumber>thirdNumber) {
            System.out.println("Greatest " + firstNumber);
        } else if (secondNumber>firstNumber && secondNumber>=thirdNumber) {
            System.out.println("Greatest " + secondNumber);
        } else if (thirdNumber==firstNumber && thirdNumber==secondNumber) {
            System.out.println("All numbers are equal");
        }else {
            System.out.println("Greatest "+thirdNumber);
        }


 /*
Q3 /Write a Java program that generates an integer between 1 and 7
and displays the name of the weekday.

 */

        // ===== answer Q3 ==============

        double weekDay = Math.floor(Math.random() * (7 - 1 + 1) + 1);
        System.out.println("Generated Number (weekday)  is "+(int)weekDay);

        switch ((int) weekDay){
            case 1:
                System.out.println("It's Sunday");
                break;
                case 2:
                    System.out.println("It's Monday");
                    break;
                    case 3:
                        System.out.println("It's Tuesday");
                        break;
                        case 4:
                            System.out.println("It's Wednesday");
                            break;
                            case 5:
                                System.out.println("It's Thursday");
                                break;
                                case 6:
                                    System.out.println("It's Friday");
                                    break;
                                    case 7:
                                        System.out.println("It's Saturday");
                                        break;
                                        default:
                                            System.out.println("this is not a valid day !");
        }


 /*
Q4  Write a program that takes a numeric score as input and prints
the corresponding letter grade using the following grading scale:

 */

        // ===== answer Q4 ==============

        System.out.println("Please enter your numeric score: ");
        int score = in.nextInt();
        System.out.println("Numeric Score: "+score);
        if (score>=90 && score<=100) {
            System.out.println("Letter Grade: A");
        }else if(score>=80 && score<90) {
            System.out.println("Letter Grade: B");
        }
        else if(score>=70 && score<80) {
            System.out.println("Letter Grade: C");

        }else if(score>=60 && score<70) {
            System.out.println("Letter Grade: D");
        }
        else if(score>=0 && score<60) {
            System.out.println("Letter Grade: F");
        }else {
            System.out.println("Grade Not Found!");
        }

         /*
Q5  Write a Java program that takes a person's age as input and
categorizes them into one of three age categories: "Child,"
"Teenager," or "Adult" using an if statement.
 */

        // ===== answer Q5 ==============
        System.out.println("Please enter your age: ");
        int age = in.nextInt();

        if (age<13 && age>=0){
            System.out.println("You are a child");
        }
        else if(age>=13 && age<=19){
            System.out.println("You are a Teenager");
        }
        else if(age>=20) {
            System.out.println("You are an adult");

        }else {
            System.out.println("Age must be a positive integer...");
        }

    }
}