package com.luismrocha;

import java.util.Scanner;

public class  Main
{
    /**
     *Driver file for the PROGRAM
     *
     */
    public static void main(String[] args)
    {


        String SKU = "";
        Operations operations = new Operations();

        int choice = 0;
        Scanner input = new Scanner(System.in);
        while(choice != 7){
            operations.displayMenu();
            choice = input.nextInt();

            switch(choice) {
                case 1:
                    operations.addByFile();
                    break;
                case 2:
                    operations.addBySku(SKU);
                    break;
                case 3:
                    operations.displayBySku(SKU);
                    break;
                case 4:
                    operations.displayAll();
                    break;
                case 5:
                    operations.eraseBySku(SKU);
                    break;
                case 6:
                    operations.eraseAll();
                    break;
                case 7:
                    break;
            }
        }
    }
}
