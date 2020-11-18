package com.company;

import entity.manager.Product;
import entity.manager.User;
import managers.ProductManager;
import managers.UserManager;

import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);


    private ProductManager productManager = new ProductManager();
    private UserManager userManager = new UserManager();

    public void GeneralTasks() {
        System.out.println("------ OPTIONS ------");
        System.out.println("0 -- -- TO QUIT ");
        System.out.println("1 -- -- TO ADD CHEMISTRY PRODUCT");
        System.out.println("2 -- -- TO SHOW CHEMISTRY PRODUCTS");
        System.out.println("3 -- -- TO ADD USER");
        System.out.println("4 -- -- TO SHOW USERS");
        System.out.println("5 -- -- TO BUY PRODUCT");
    }

    public void run () {

        boolean isRunning = true;
        int task;


        do {
            System.out.println("------ Chemistry Shop ------");
            GeneralTasks();
            task = input.nextInt();
            switch(task) {
                case 0 :
                System.out.println("Quiting the shop");
                isRunning = false;
                    break;
                case 1 :
                    productManager.createProduct();
                    break;
                case 2 :
                    productManager.displayProduct();
                    break;
                case 3 :
                    userManager.createUser();
                    break;
                case 4 :
                    userManager.displayUsers();
                    break;
                case 5 :
                    System.out.println("starting buying process");
                    buying();
                    break;
                default :
                    System.out.println("No task like this");
            }


        } while (isRunning);





    }

    public void buying () {
        int userID;
        int productID;
        double price;
        double balance;


        productID = productManager.ChooseProduct();
        userID = userManager.ChooseUser();

        price = productManager.getProductPrice(productID);
        balance = userManager.getUserBalance(userID);

        if (price <= balance)  {
             userManager.decreaseBalance(userID, price);
             productManager.removeProduct(productID);
         } else {
            System.out.println("Not enough money for the operation");
        }



    }

}
