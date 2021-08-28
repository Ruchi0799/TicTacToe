package com.bridgelabz.tictactoe;

public class TicTacToe {
    public static void initializeBoard(){
        char[] boardArray=new char[10];
        for (int i=1;i<10;i++)
        {
            boardArray[i]='0';
        }
    }

}
