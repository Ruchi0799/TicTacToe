package com.bridgelabz.tictactoe;

public class TicTacToeRunner {
    public static void main(String[] args) {
        TicTacToe game=new TicTacToe();
        char[] boardArray=TicTacToe.initializeBoard();
        TicTacToe.userInput();
        TicTacToe.showBoard(boardArray);
        TicTacToe.makeMove(boardArray);
        TicTacToe.showBoard(boardArray);
    }
}
