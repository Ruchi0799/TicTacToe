package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    public static char computerLetter;
    public static char playerLetter;
    public static char[] initializeBoard(){
        char[] boardArray=new char[10];
        for (int i=1;i< boardArray.length;i++)
        {
            boardArray[i]='_';
        }
        return boardArray;
    }

    public static void userInput(){
        System.out.println("To play choose letter O or X");
        Scanner sc=new Scanner(System.in);
        playerLetter=sc.next().charAt(0);
        if(playerLetter=='O'){
            computerLetter='X';
        }
        else {
            computerLetter='O';
        }
        System.out.println("User letter: "+playerLetter);
        System.out.println("Computer letter: "+computerLetter);
    }

    public static void showBoard(char[] boardArray){
        for (int i=1;i< boardArray.length;i++){
            System.out.print(boardArray[i]+"\t");
            if (i%3==0)
            {
                System.out.println();
            }
        }

    }

}
