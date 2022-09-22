package com.kenzie.app;

import java.util.Scanner;

public class Main {

    public static void displayMenu() {
        System.out.println("Enter a selection (1-4)");
        System.out.println("1. Check your Balance");
        System.out.println("2. Buy");
        System.out.println("3. Sell");
        System.out.println("4. Exit");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Kenzie Stock Exchange");
        Scanner in = new Scanner(System.in);
        System.out.println("What is the Stock's name?");
        String name = in.nextLine();
        System.out.println("What is the Stock's ticker symbol?");
        String ticker = in.nextLine();
        System.out.println("What is the Stock's current price?");
        double price = Double.parseDouble(in.nextLine());

        // Create your StockHolding using the values above
        StockHolding input = new StockHolding(name, ticker, price);

        // Create your Execution Loop
        displayMenu();
        int number = Integer.parseInt(in.nextLine());

        while (!(number <= 4 && number > 0)) {
            System.out.println("Selection is unrecognized. Please select a number from 1 to 4.");
            displayMenu();
            number = Integer.parseInt(in.nextLine());
        }

        while (true) {
            if (number == 1) {
                System.out.println("You own " + input.getNumShares() + " shares of " + input.getName() + " (" + input.getTicker() + ")");
                System.out.println("Your balance is: " + "$" + input.getBalance());
                displayMenu();
                number = Integer.parseInt(in.nextLine());

            } else if (number == 2) {
                System.out.println("How many shares would you like to buy?");
                int numberTwo = Integer.parseInt(in.nextLine());
                input.buy(numberTwo);
                displayMenu();
                number = Integer.parseInt(in.nextLine());

            } else if (number == 3) {
                System.out.println("How many shares would you like to sell?");
                int numberThree = Integer.parseInt(in.nextLine());
                input.sell(numberThree);
                displayMenu();
                number = Integer.parseInt(in.nextLine());

            } else if (number == 4) {
                System.out.println("Goodbye!");
                break;
            }
            while (!(number <= 4 && number > 0)) {
                System.out.println("Selection is unrecognized. Please select a number from 1 to 4.");
                displayMenu();
                number = Integer.parseInt(in.nextLine());
            }
        }
    }
}
