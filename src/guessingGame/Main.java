package guessingGame;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        int UserNum = 0;
        int ComputerNum = (int)(Math.random()*50+1) ;
        int Counter = 1;

        System.out.println(ComputerNum);

        while(UserNum != ComputerNum)
        {
            System.out.println("Enter a guess between 1 & 50");
            Scanner num = new Scanner(System.in);
            UserNum = num.nextInt();
            System.out.print(determineGuess(UserNum,ComputerNum,Counter));
        }
    }

    public static String determineGuess(int UserNum,int ComputerNum,int Counter){
        if(UserNum <0 || UserNum >50){
            return "invalid Guess";
        }
        else if (UserNum < ComputerNum){
            return "Guess too low" +Counter;
        }
        else if(UserNum > ComputerNum){
            return "Guess too high" +Counter;
        }
        else if(UserNum == ComputerNum){
            return "Correct answer"+Counter;
        }
        else {
            return "your guess is incorrect"+Counter;
        }


    }
}
