package com.await.pcbuilder.ui;

import com.await.pcbuilder.bl.SelectAccessories;
import com.await.pcbuilder.bl.ViewAccessories;

import java.util.Scanner;
public class Menu {
    private static int mainMenu;

    public static void printMenu(){
        Scanner mainInput = new Scanner(System.in);
        ViewAccessories accessoriesView = new ViewAccessories();
        ChoiceAccessories accessories = new ChoiceAccessories();
        double price = 0;
        do{
            System.out.println("Вітаємо в PC Builder");
            System.out.println();
            System.out.println("[1] Почати збірку комп'ютера");
            System.out.println("[2] Перегляд всіх комплектуючих");
            System.out.println("[3] Вихід");
            mainMenu = mainInput.nextInt();
            switch (mainMenu){
                case 1:
                    SelectAccessories.listAccessories();
                    break;
                case 2:
                    accessoriesView.view();
                    returnMenu();
                    break;
                case 3:
                    System.out.println("Дякуємо що скористалися нашими послугами");
                    System.exit(3);
                    break;
            }
            if(mainMenu > 3){
                System.out.println();
                System.out.println("Введено хибні дані");
            }
        }while (mainMenu != 3);
    }

    public static void returnMenu(){
        Scanner returnInMenu = new Scanner(System.in);
        int choice;

        do {
            System.out.println();
            System.out.println("[1] Повернутися до меню");
            System.out.println("[2] Вийти з програми");
            choice = returnInMenu.nextInt();
            switch (choice){
                case 1:
                    printMenu();
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Дякуємо що скористалися нашими послугами");
                    System.exit(2);
                    break;
            }
            if(choice > 2){
                System.out.println();
                System.out.println("Введено хибні дані");
            }
        }while (choice != 2);

    }


}
