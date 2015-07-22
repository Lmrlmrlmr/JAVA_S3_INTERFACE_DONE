package com.luismrocha;

import java.io.Serializable;

/**
 * Created by PaleToys on 7/21/2015.
 */
class Operations {
    /**
     * add items to the bucket by an input file
     */
    public void addByFile(){
        System.out.print("addByFile");
    }

    /**
     * add by sku to the bucket
     * @param  SKU which is used to add the item.
     */
    public  void addBySku(String SKU){
        System.out.print("addBySku");
    }

    /**
     * display an item from the bucket by the sku given
     * @param SKU
     */
    public  void displayBySku(String SKU){
        System.out.print("displayBySku");
    }

    /**
     * Display all the items in given bucket
     */
    public  void displayAll(){
        System.out.print("displayAll");
    }

    /**
     * Erase an item by the supplied sku
     * @param SKU
     */
    public  void eraseBySku(String SKU){
        System.out.print("eraseBySku");
    }

    /**
     * Erase the whole bucket
     */
    public  void eraseAll(){
        System.out.print("eraseAll");
    }

    /**
     * Display the menu with all the options 1-7 with 7 to quit.
     */
    public  void displayMenu(){
        System.out.println("Welcome");
        System.out.println("-------\n");
        System.out.println("Enter 1: Add by file");
        System.out.println("Enter 2: Add by sku");
        System.out.println("Enter 3: Display by sku");
        System.out.println("Enter 4: Display all");
        System.out.println("Enter 5: Erase by sku");
        System.out.println("Enter 6: Erase all");
        System.out.println("Enter 7: Exit");
        System.out.print("Choice : ");
    }
}
