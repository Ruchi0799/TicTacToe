package com.bridgelabz.tictactoe;

public class TicTacToeRunner {
    public static void main(String[] args) {
        TicTacToe game=new TicTacToe();
        char[] boardArray=TicTacToe.initializeBoard();
        game.userInput();
        game.showBoard(boardArray);
        game.playDine();

    }
}
