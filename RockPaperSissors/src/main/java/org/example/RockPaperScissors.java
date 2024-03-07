package org.example;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            while (true) {
                String[] rps = {"r", "p", "s"};
                String computerMove = rps[new Random().nextInt(rps.length)];


                String playerMove;

                while (true) {
                    System.out.println("Please enter your move (r, p, OR s)");
                    playerMove = scanner.nextLine();
                    if (playerMove.equals("r") ||
                            playerMove.equals("p") ||
                            playerMove.equals("s")) {
                        break;
                    }
                    System.out.println(playerMove + " is not an input you little..... nevermind.");
                    System.out.println();

                }

                System.out.println("Computer played " + computerMove);

                if (playerMove.equals(computerMove)) {
                    System.out.println("The game was a tie!");
                } else if (playerMove.equals("r")) {
                    if (computerMove.equals("p")) {
                        System.out.println("WOMP WOMP... Get Wrapped!");
                    } else if (computerMove.equals("s")) {
                        System.out.println("You WON!!!");
                    }
                } else if (playerMove.equals("p")) {
                    if (computerMove.equals("s")) {
                        System.out.println("WOMP WOMP... Get Cut!");
                    } else if (computerMove.equals("r")) {
                        System.out.println("You WON!!!");
                    }
                } else if (playerMove.equals("s")) {
                    if (computerMove.equals("r")) {
                        System.out.println("WOMP WOMP... Get Stoned!");
                    } else if (computerMove.equals("p")) {
                        System.out.println("You WON!!!");
                    }
                }
                System.out.println();
                System.out.println("Play again fellow earthling? (y/n)");
                String playAgain = scanner.nextLine();

                if (playAgain.equals("n")) {
                    System.out.println("see ya later.. Alligator.. *wink* *wink*");
                    break;
                }
                scanner.close();
            }
    }
}