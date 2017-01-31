import java.util.Scanner;

/**
 * Created by davidshinabarger on 1/31/17.
 */
public class main {
    public static void main(String[] args) {
        String userinput = " ";
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String userName = scan.nextLine();
        System.out.println("Hello, " + userName + ". Nice to meet you.");




        //TODO add do/while loop here
        do {
            //check and see if user# is within range

            System.out.println("When you're ready, please enter a number, 1-100: ");
            int userNumber = scan.nextInt();
            scan.nextLine();
            if (userNumber > 100 || userNumber < 1) {
            System.out.println("Oops! That wasn't a # between 1 & 100!");
                System.out.println("Please enter another number: ");
                userNumber = scan.nextInt();
                scan.nextLine();
        }

        if (userNumber % 2 == 0 & userNumber > 25) {
            System.out.print("Thanks, " + userName + ". Your number was even. ");
        } else if (userNumber <= 25) {
            System.out.println("Thanks. Your number was even and less than 25.");
        }

        if (userNumber % 2 != 0) {
            System.out.print("Thanks, " + userName + ". Your number was odd. ");
        } else if (userNumber % 2 != 0 & userNumber > 60) {
            System.out.println("Thanks your number is odd and greater than 60.");
        }
            System.out.println("Would you like to play again? Type yes or no: ");
            userinput = scan.nextLine();
        } while (userinput.equalsIgnoreCase("yes"));

        System.out.println("Thanks so much, " + userName + ". Have a great day.");

    }
}

