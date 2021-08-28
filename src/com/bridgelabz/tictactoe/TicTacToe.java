package com.bridgelabz.tictactoe;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static char computerLetter;
    public static char playerLetter;
    public static char[] indexArray={'0','0','0','0','0','0','0','0','0','0',};
    public static int userChoice;
    public static int playFirst;
    public static char[] boardArray=new char[10];
    public static char[] initializeBoard(){

        for (int i=1;i< boardArray.length;i++)
        {
            boardArray[i]='_';
        }
        return boardArray;
    }

    public static void userInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("To play choose letter O or X");
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

    public static void makeMovePlayer(char[] boardArray) {


        Integer[] validcells={1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
            System.out.println("What is your move player?");
            userChoice = sc.nextInt();
            if (Arrays.asList(validcells).contains(userChoice) && isIndexEmpty()) {
                boardArray[userChoice]=playerLetter;
                showBoard(boardArray);


            }

    }
    public static void makeMoveComputer(char[] boardArray) {


        Integer[] validcells={1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
            System.out.println("What is your move computer?");
            userChoice = sc.nextInt();
            if (Arrays.asList(validcells).contains(userChoice) && isIndexEmpty()) {
                boardArray[userChoice]=computerLetter;
                showBoard(boardArray);


            }

    }

    public static void playDine(){
        Scanner sc = new Scanner(System.in);
        playFirst=(int) ((Math.random()*10)%2);
        int temp=playFirst;
        System.out.println(temp);
        if(playFirst==0)
        {
            makeMovePlayer(boardArray);
        }
        else
        {
            makeMoveComputer(boardArray);
        }
        for (int i=temp+1;i<= temp+8;i++)
        {
            if(i%2==0){
                makeMovePlayer(boardArray);
            }
            else if(i%2==1) {
                makeMoveComputer(boardArray);
            }
        }


    }

    public static boolean isIndexEmpty(){
        if (indexArray[userChoice]=='0'){
            indexArray[userChoice]='1';
            return true;
        }

        return false;
    }

}
