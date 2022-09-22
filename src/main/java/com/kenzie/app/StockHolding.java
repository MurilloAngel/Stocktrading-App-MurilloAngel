package com.kenzie.app;

public class StockHolding {
    // Create private instance properties
    private String name;
    private String ticker;
    private double price;
    private int numShares;

    // Create constructor
    public StockHolding (String name, String ticker, double price) {
        this.name = name;
        this.ticker = ticker;
        this.numShares = 0;
        this.price = price;
    }

    // create getters
    public String getName() {
        return this.name;
    }

    public String getTicker() {
        return this.ticker;
    }

    public double getPrice() {
        return this.price;
    }

    public int getNumShares() {
        return this.numShares;
    }

    // create buy, sell, and getBalance methods
    public void buy(int numShares) {
        if (numShares <= 0) {
            this.numShares = 0;
            System.out.println("You bought " + this.numShares + " shares for $" + this.numShares * getPrice());
        } else {
            this.numShares = this.numShares + numShares;
            System.out.println("You bought " + numShares + " shares for $" + numShares * getPrice());
        }
    }

    public double sell(int numShares) {
        if (this.numShares > 0 && numShares <= this.numShares && numShares > 0) {
            this.numShares = this.numShares - numShares;
            System.out.println("You sold " + numShares + " shares for $" + numShares * getPrice());
            return numShares * this.price;
        } else if (numShares <= 0) {
            System.out.println("Invalid number");
            return 0;
        } else {
            System.out.println("You do not have enough shares!");
            return 0;
        }
    }

    public double getBalance() {
        return numShares * this.price;
    }
}
