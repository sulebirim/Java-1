/*
*MakingChange.java
*@author Vlad Vasiljevs
*09/02/16
*
*/

import java.util.Scanner;

public class MakingChange {

public static void main(String[] args) {



    Scanner keyboard;

    keyboard = new Scanner(System.in);

	//Declaring final variable name/value
    final int fifties = 50;
    final int twenties = 20;
    final int tenners = 10;
    final int fivers = 5;
    final int two = 2;
    final int one = 1;

	//Asking user to input cost of items
    System.out.print("Please enter the cost of itmes ");
    int amountDue = keyboard.nextInt();

    //Asking user to input amount given
    System.out.print("Please Enter the amount paid ");
    int amountReceived = keyboard.nextInt();


	//Calculations for calculating change owed
    int changeOwed = amountReceived - amountDue;
    int fifty = changeOwed / fifties;
    changeOwed = changeOwed % fifties;
    int twenty = changeOwed / twenties;
    changeOwed = changeOwed % twenties;
    int ten = changeOwed / tenners;
    changeOwed = changeOwed % tenners;
    int five = changeOwed / fivers;
    changeOwed = changeOwed % fivers;
    int twoEuro = changeOwed / two;
    changeOwed = changeOwed % two;

	//Printing out change vaules and total change
    System.out.println("Fifties:  		" + fifty);
    System.out.println("Twenties:  		" + twenty);
    System.out.println("Tenners:    		" + ten);
    System.out.println("Fivers:  		" + five);
    System.out.println("Two:     		" + twoEuro);
    System.out.println("One:  			" + changeOwed);
    System.out.println("Total Change:    	" + (amountReceived - amountDue));

    }
}
