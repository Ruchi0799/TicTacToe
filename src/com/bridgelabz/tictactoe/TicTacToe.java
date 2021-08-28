package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToe {
    public static void initializeBoard(){
        char[] boardArray=new char[10];
        for (int i=1;i< boardArray.length;i++)
        {
            boardArray[i]=' ';
        }
    }

    public static void userInput(){
        char computerLetter;
        System.out.println("To play choose letter O or X");
        Scanner sc=new Scanner(System.in);
        char playerLetter=sc.next().charAt(0);
        if(playerLetter=='O'){
            computerLetter='X';
        }
        else {
            computerLetter='O';
        }
        System.out.println("User letter: "+playerLetter);
        System.out.println("Computer letter: "+computerLetter);
    }

}
