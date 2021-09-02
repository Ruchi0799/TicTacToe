package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        int choice;
        char[] boardArray = TicTacToe.initializeBoard();
        game.userInput();
        game.showBoard(boardArray);
        game.playDine();
        do {
            System.out.println("Do you want to play again 1.Enter 1 to play again 2.Enter 2 to stop");
            choice = sc.nextInt();

            if (choice == 1) {
                TicTacToe.initializeBoard();
                game.userInput();
                game.showBoard(boardArray);
                game.playDine();
            } else {
                System.out.println("Bye Bye");
                break;
            }

        }while(choice!=2);
    }
}
