import java.util.Scanner;

public class ComputerGuessTheNumbers {

    public static void main(String[] args) {
        int counter=0;
        int myNumber=0;
        boolean flag = true;

        while(true) {

            Scanner sc = new Scanner(System.in);
            System.out.print("My number is: " );
            myNumber = sc.nextInt();

            if(myNumber>100) {

                System.out.println("I have entered the number out of range. The range is: 0-100. I must enter the number again!!!");
            }
            else if(myNumber<0) {System.out.println("I have entered the number out of range. The range is: 0-100. "
                    + "I must enter the number again!!!");
            }
            else {break;}

        }

        System.out.println();

        while(flag) {

            int compNumber = 0+(int)(Math.random()*101);

            if(myNumber==compNumber) {

                System.out.println("\nWell done!!! Computer have guessed the number: "
                        + compNumber+". And my number is: " + myNumber
                        +". \n\nCongratulations, computer!!! You needed " + counter + " tries to guess the number.");
                flag = false;

            }

            else if(myNumber>compNumber) {
                counter++;
                System.out.println("Computer have entered the number: "+compNumber+".  My number is bigger !!!");

            }

            else if(myNumber<compNumber) {
                counter++;
                System.out.println("Computer have entered the number: "+compNumber+".  My number is lower !!!");

            }

        }


    }
}
