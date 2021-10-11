import java.util.Scanner;

public class NumberToGuess {
    public static void main(String[] args) {
        int compNumber = (int)(Math.random()*100);
        boolean flag = true;
        //System.out.println("Generated number: "+compNumber);


        while(flag) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Please, enter the number: " );

            int playerNumber = sc.nextInt();

            if(playerNumber==compNumber) {
                System.out.println("Well done!!! You have guessed the number!!! The number is: " + compNumber);
                flag = false;

            }
            else if(playerNumber>compNumber) {
                System.out.println("You have entered a bigger number!!! ");

            }
            else if(playerNumber<compNumber) {
                System.out.println("You have entered a lower number!!! ");

            }


        }


    }

}
