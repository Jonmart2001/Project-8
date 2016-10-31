/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.pkg8;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author student
 */
public class Project8 {

    public static void main(String[] args) {
        Random rand = new Random();

        int secretNumber;
            secretNumber = (int) (Math.random() * 999 + 1);           
            Scanner keyboard = new Scanner(System.in);
            int guess;
            do {
                  System.out.print("Enter a guess (1-1000): ");
                  guess = keyboard.nextInt();
                  if (guess == secretNumber)
                        System.out.println("Your guess is correct. Congratulations!");
                  else if (guess < secretNumber)
                        System.out
                                   .println("Your guess is smaller than the secret number.");
                  else if (guess > secretNumber)
                        System.out
                                   .println("Your guess is greater than the secret number.");
            } while (guess != secretNumber);
      }
}
    


