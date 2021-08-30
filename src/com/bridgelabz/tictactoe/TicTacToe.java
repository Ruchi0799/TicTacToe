package com.bridgelabz.tictactoe;

import java.util.Arrays;
import java.util.Random;
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
        if(isIndexEmpty()){
            boardArray[userChoice]=playerLetter;
            indexArray[userChoice]='1';
            showBoard(boardArray);
        }
        else {
            System.out.println("I am in else part of  player");
        }


    }
    public static void makeMoveComputer(char[] boardArray) {

        Random random=new Random();
        Integer[] validcells={1,2,3,4,5,6,7,8,9};

        if(boardArray[1]==computerLetter && boardArray[2]==computerLetter || boardArray[5]==computerLetter && boardArray[7]==computerLetter||boardArray[6]==computerLetter && boardArray[9]==computerLetter
        ||boardArray[1]==playerLetter && boardArray[2]==playerLetter || boardArray[5]==playerLetter && boardArray[7]==playerLetter||boardArray[6]==playerLetter && boardArray[9]==playerLetter)
        {
            userChoice=3;
            if(isIndexEmpty()){
                userChoice=3;
            }
            else
            {
                userChoice=random.nextInt(9)+1;
            }
        }
        else if(boardArray[2]==computerLetter && boardArray[3]==computerLetter||boardArray[4]==computerLetter && boardArray[7]==computerLetter||boardArray[5]==computerLetter && boardArray[9]==computerLetter
                ||boardArray[2]==playerLetter && boardArray[3]==playerLetter||boardArray[4]==playerLetter && boardArray[7]==playerLetter||boardArray[5]==playerLetter && boardArray[9]==playerLetter)
        {
            userChoice=1;
            if(isIndexEmpty()){
                userChoice=1;
            }
            else
            {
                userChoice=random.nextInt(9)+1;
            }
        }
        else if(boardArray[1]==computerLetter && boardArray[4]==computerLetter||boardArray[5]==computerLetter && boardArray[3]==computerLetter||boardArray[8]==computerLetter && boardArray[9]==computerLetter
                ||boardArray[1]==playerLetter && boardArray[4]==playerLetter||boardArray[5]==playerLetter && boardArray[3]==playerLetter||boardArray[8]==playerLetter && boardArray[9]==playerLetter)
        {
            userChoice=7;
            if(isIndexEmpty()){
                userChoice=7;
            }
            else
            {
                userChoice=random.nextInt(9)+1;
            }
        }
        else if(boardArray[3]==computerLetter && boardArray[6]==computerLetter||boardArray[7]==computerLetter && boardArray[8]==computerLetter||boardArray[1]==computerLetter && boardArray[5]==computerLetter
                ||boardArray[3]==playerLetter && boardArray[6]==playerLetter||boardArray[7]==playerLetter && boardArray[8]==playerLetter||boardArray[1]==playerLetter && boardArray[5]==playerLetter)
        {
            userChoice=9;
            if(isIndexEmpty()){
                userChoice=9;
            }
            else
            {
                userChoice=random.nextInt(9)+1;
            }
        }
        else if(boardArray[2]==computerLetter && boardArray[8]==computerLetter||boardArray[4]==computerLetter && boardArray[6]==computerLetter||boardArray[3]==computerLetter && boardArray[7]==computerLetter||boardArray[1]==computerLetter && boardArray[9]==computerLetter
                ||boardArray[2]==playerLetter && boardArray[8]==playerLetter||boardArray[4]==playerLetter && boardArray[6]==playerLetter||boardArray[3]==playerLetter && boardArray[7]==playerLetter||boardArray[1]==playerLetter && boardArray[9]==playerLetter)
        {
            userChoice=5;
            if(isIndexEmpty()){
                userChoice=5;
            }
            else
            {
                userChoice=random.nextInt(9)+1;
            }
        }
        else if(boardArray[1]==computerLetter && boardArray[3]==computerLetter||boardArray[6]==computerLetter && boardArray[8]==computerLetter
                ||boardArray[1]==playerLetter && boardArray[3]==playerLetter||boardArray[6]==playerLetter && boardArray[8]==playerLetter)
        {
            userChoice=2;
            if(isIndexEmpty()){
                userChoice=2;
            }
            else
            {
                userChoice=random.nextInt(9)+1;
            }
        }

        else if(boardArray[1]==computerLetter && boardArray[7]==computerLetter||boardArray[5]==computerLetter && boardArray[6]==computerLetter
                ||boardArray[1]==playerLetter && boardArray[7]==playerLetter||boardArray[5]==playerLetter && boardArray[6]==playerLetter)
        {
            userChoice=4;
            if(isIndexEmpty()){
                userChoice=4;
            }
            else
            {
                userChoice=random.nextInt(9)+1;
            }
        }

        else if(boardArray[4]==computerLetter && boardArray[5]==computerLetter||boardArray[3]==computerLetter && boardArray[9]==computerLetter
                ||boardArray[4]==playerLetter && boardArray[5]==playerLetter||boardArray[3]==playerLetter && boardArray[9]==playerLetter)
        {
            userChoice=6;
            if(isIndexEmpty()){
                userChoice=6;
            }
            else
            {
                userChoice=random.nextInt(9)+1;
            }
        }

        else if(boardArray[2]==computerLetter && boardArray[5]==computerLetter||boardArray[7]==computerLetter && boardArray[9]==computerLetter
                ||boardArray[2]==playerLetter && boardArray[5]==playerLetter||boardArray[7]==playerLetter && boardArray[9]==playerLetter)
        {
            userChoice=8;
            if(isIndexEmpty()){
                userChoice=8;
            }
            else
            {
                userChoice=random.nextInt(9)+1;
            }
        }

        else {
            userChoice=random.nextInt(9)+1;
        }
        System.out.println("COMPUTER CHOICE IS "+userChoice);

        boolean ans=Arrays.asList(validcells).contains(userChoice) && isIndexEmpty();
        System.out.println(ans);
        if(ans==true){

            boardArray[userChoice]=computerLetter;
            indexArray[userChoice]='1';
            System.out.println("After Computer move");
            showBoard(boardArray);
        }
        else if(ans==false){

            makeMoveComputer(boardArray);
        }


    }

    public static void playDine() {
        Scanner sc = new Scanner(System.in);
        playFirst = (int) ((Math.random() * 10) % 2);
        int temp = playFirst;
        int dine=1;


        if (playFirst == 0) {
            makeMovePlayer(boardArray);
        } else {
            makeMoveComputer(boardArray);
        }
        while (haveWon() || temp==9 ) {
            temp++;
            System.out.println(temp);
            if (temp % 2 == 0) {
                makeMovePlayer(boardArray);
            } else if (temp % 2 == 1) {
                makeMoveComputer(boardArray);
            }
        }
    }


    public static boolean haveWon(){
        if(boardArray[1]==playerLetter && boardArray[2]==playerLetter && boardArray[3]==playerLetter ||
                boardArray[1]==computerLetter && boardArray[2]==computerLetter && boardArray[3]==computerLetter ||
                boardArray[4]==playerLetter && boardArray[5]==playerLetter && boardArray[6]==playerLetter ||
                boardArray[4]==computerLetter && boardArray[5]==computerLetter && boardArray[6]==computerLetter ||
                boardArray[7]==playerLetter && boardArray[8]==playerLetter && boardArray[9]==playerLetter ||
                boardArray[7]==computerLetter && boardArray[8]==computerLetter && boardArray[9]==computerLetter ||
                boardArray[1]==playerLetter && boardArray[4]==playerLetter && boardArray[7]==playerLetter ||
                boardArray[1]==computerLetter && boardArray[4]==computerLetter && boardArray[7]==computerLetter ||
                boardArray[2]==playerLetter && boardArray[5]==playerLetter && boardArray[8]==playerLetter ||
                boardArray[2]==computerLetter && boardArray[5]==computerLetter && boardArray[8]==computerLetter ||
                boardArray[3]==playerLetter && boardArray[6]==playerLetter && boardArray[9]==playerLetter ||
                boardArray[3]==computerLetter && boardArray[6]==computerLetter && boardArray[9]==computerLetter ||
                boardArray[1]==playerLetter && boardArray[5]==playerLetter && boardArray[9]==playerLetter ||
                boardArray[1]==computerLetter && boardArray[5]==computerLetter && boardArray[9]==computerLetter
        )
        {
            System.out.println("Congratulations you won");
            return false;
        }
        return true;
    }
    public static boolean isIndexEmpty(){
        System.out.println("index array of userchoice"+indexArray[userChoice]);
        if (indexArray[userChoice]=='0'){
            return true;
        }
        return false;
    }

}
