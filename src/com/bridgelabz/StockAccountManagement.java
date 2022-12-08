package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class StockAccountManagement {
    /**
     *This is Main method is Used For Calculate the portfolio
     */
    public static void main(String[] args) {
        int flag = 0;
        Scanner scanner = new Scanner(System.in);
        StockPortfolio pf = new StockPortfolio();
        while (flag == 0) {
            System.out.println("Enter the details of Stock ");
            StockPortfolio.Stock stock = new StockPortfolio.Stock();
            System.out.println("Enter Company Name:");
            stock.company = scanner.nextLine();
            System.out.println("Enter number of share:");
            stock.NoOfShare = scanner.nextInt();
            System.out.println("Enter Price of share:");
            stock.price = scanner.nextDouble();

            pf.portfolio.add(stock);
            System.out.println("Do you want to add more Stocks? enter 0 for YES or 1 for NO!");
            flag = scanner.nextInt();
        }
        for (int i = 0; i < pf.portfolio.size(); i++) {
            System.out.println(pf.totalValue());

        }
    }
}
    /**
    *This is Non-Static method is Used For Calculate the Values Of portfolio
    */
    class StockPortfolio {
    ArrayList<Stock> portfolio = new ArrayList<>();
    double totalValue = 0;
    /**
     *This is class is used for details of portfolio likes numbers of shares , prices and company names
     */
    static class  Stock {
        int NoOfShare;
        String company;
        double price;
    }

    /**
     *This is Non-Static method is Used For Calculate the Values Of portfolio
     */

    public double totalValue() {
        for (Stock stock : portfolio) {
            totalValue += stock.price * stock.NoOfShare;
        }
        return totalValue;
    }
}
