package com.await.pcbuilder.ui;

import com.await.pcbuilder.da.entity.Accessories;
import com.await.pcbuilder.da.AccessoriesList;

import java.util.Scanner;

public class ChoiceAccessories {

    static Scanner sc = new Scanner(System.in);
    int choiceCPU;
    int choiceGPU;
    int choiceOperatingMemory;
    int choiceMemoryStorage;
    int choicePowerSupplies;
    int choiceSystemCooling;
    int saveResult;
    int choiceMotherboard;

    Accessories.cpu[] newArr;
    AccessoriesList motherboard = new AccessoriesList();
    AccessoriesList cpu = new AccessoriesList();
    AccessoriesList systemColling = new AccessoriesList();
    AccessoriesList powerSupplies = new AccessoriesList();
    AccessoriesList operatingMemory = new AccessoriesList();
    AccessoriesList memoryStorage = new AccessoriesList();
    AccessoriesList GPU = new AccessoriesList();
    int number = 0;


    public double choiceMotherboard(){
        //Вивід списку материнських плат
        System.out.println("Список материнських плат:");
        for(int i = 0; i<motherboard.motherboardlist.length; i++){
            System.out.println("[" + (i + 1) + "] " + motherboard.motherboardlist[i].viewMotherboard());
        }
        sc = new Scanner(System.in);
        saveResult = sc.nextInt();

        choiceMotherboard = saveResult - 1;

        if(saveResult > motherboard.motherboardlist.length){
            System.out.println("Введені хибні дані");
            choiceMotherboard();
        }

        double price = Double.parseDouble(motherboard.motherboardlist[choiceMotherboard].getPrice());

        return price;
    }

    public double choiceCPU(){
            //Вивід списку процесорів
            System.out.println("Список процесорів:");
            newArr = null;
            for (int i = 0; i < cpu.cpuList.length; i++) {
                if(!cpu.cpuList[i].getSocket().contains(motherboard.motherboardlist[choiceMotherboard].getSocket())){
                    newArr = new Accessories.cpu[cpu.cpuList.length];
                    for(int index = 0; index < i; index++){
                        newArr[index] = cpu.cpuList[index];
                    }
                    for(int j = i; j < cpu.cpuList.length - 1; j++){
                        newArr[j] = cpu.cpuList[j+1];
                    }
                    break;
                }
            }
            for(int i = 0; i < newArr.length - 1; i++){
                assert newArr != null;
                System.out.println("[" + (i + 1) + "] " + newArr[i].viewCPU());
            }

            sc = new Scanner(System.in);
            saveResult = sc.nextInt();

            choiceCPU = saveResult - 1;

            if(saveResult > newArr.length - 1){
                System.out.println("Введені хибні дані");
                choiceCPU();
            }

            double price = Double.parseDouble(newArr[choiceCPU].getPrice());

            return price;
    }

    public double choiceSystemCooling(){
            //Вивід списку охолодження
            System.out.println("Список охолодження:");
            for(int i = 0; i < systemColling.systemCoolingsList.length; i++){
                System.out.println("[" + (i + 1) + "] " + systemColling.systemCoolingsList[i].viewSystemCooling());
            }

            sc = new Scanner(System.in);
            saveResult = sc.nextInt();

            choiceSystemCooling = saveResult - 1;

            if(saveResult > systemColling.systemCoolingsList.length){
                System.out.println("Введені хибні дані");
                choiceSystemCooling();
            }

            double price = Double.parseDouble(systemColling.systemCoolingsList[choiceSystemCooling].getPrice());

            return price;
    }

    public double choiceOperatingMemory(){
            //Вивід списку оперативної пам'яті
            System.out.println("Список оперативної пам'яті:");
            for(int i = 0; i < operatingMemory.operatingMemoriesList.length; i++){
                System.out.println("[" + (i + 1) + "] " + operatingMemory.operatingMemoriesList[i].viewOperatingMemory());
            }

            sc = new Scanner(System.in);
            saveResult = sc.nextInt();

            choiceOperatingMemory = saveResult - 1;

            if(saveResult > operatingMemory.operatingMemoriesList.length){
                System.out.println("Введені хибні дані");
                choiceOperatingMemory();
            }


            double price = Double.parseDouble(operatingMemory.operatingMemoriesList[choiceOperatingMemory].getPrice());

            return price;
    }

    public double choicePowerSupplies(){
            //Вивід списку блока живлення
            System.out.println("Список блоків живлення:");
            for(int i = 0; i < powerSupplies.powerSuppliesList.length; i++){
                System.out.println("[" + (i + 1) + "] " + powerSupplies.powerSuppliesList[i].viewPowerSupplies());
            }

            sc = new Scanner(System.in);
            saveResult = sc.nextInt();

            choicePowerSupplies = saveResult - 1;

            if(saveResult > powerSupplies.powerSuppliesList.length){
            System.out.println("Введені хибні дані");
            choicePowerSupplies();
            }
            double price = Double.parseDouble(powerSupplies.powerSuppliesList[choicePowerSupplies].getPrice());

            return price;
    }

    public double choiceMemoryStorage(){
            //Вивід списку жорсткого диску
            System.out.println("Список жорстких дисків:");
            for(int i = 0; i < memoryStorage.memoryStoragesList.length; i++){
                System.out.println("[" + (i + 1) + "] " + memoryStorage.memoryStoragesList[i].viewMemoryStorage());
            }

            sc = new Scanner(System.in);
            saveResult = sc.nextInt();

            choiceMemoryStorage = saveResult - 1;

            if(saveResult > memoryStorage.memoryStoragesList.length){
                System.out.println("Введені хибні дані");
                choiceMemoryStorage();
            }
        double price = Double.parseDouble(memoryStorage.memoryStoragesList[choiceMemoryStorage].getPrice());

        return price;
    }

    public double choiceGPU(){
            //Вивід списку відеокарт
            System.out.println("Список відеокарт:");
            for (int i = 0; i < GPU.gpuList.length; i++) {
                System.out.println("[" + (i + 1) + "] " + GPU.gpuList[i].viewGPU());
            }

            sc = new Scanner(System.in);
            saveResult = sc.nextInt();

            choiceGPU = saveResult - 1;

            if(saveResult > GPU.gpuList.length){
                System.out.println("Введені хибні дані");
                choiceGPU();
            }

            double price = Double.parseDouble(GPU.gpuList[choiceGPU].getPrice());

            return price;
    }

    public void sourceAssembly(){
        String motherboardTitle = motherboard.motherboardlist[choiceMotherboard].getTitle();
        String motherboardPrice = motherboard.motherboardlist[choiceMotherboard].getPrice();

        String cpuTitle = newArr[choiceCPU].getTitle();
        String cpuPrice = newArr[choiceCPU].getPrice();

        String systemCoolingTitle = systemColling.systemCoolingsList[choiceSystemCooling].getTitle();
        String systemCoolingPrice = systemColling.systemCoolingsList[choiceSystemCooling].getPrice();

        String suppliesPowerTitle = powerSupplies.powerSuppliesList[choicePowerSupplies].getTitle();
        String suppliesPowerPrice = powerSupplies.powerSuppliesList[choicePowerSupplies].getPrice();

        String memoryOperatingTitle = operatingMemory.operatingMemoriesList[choiceOperatingMemory].getTitle();
        String memoryOperatingPrice = operatingMemory.operatingMemoriesList[choiceOperatingMemory].getPrice();

        String gpuTitle = GPU.gpuList[choiceGPU].getTitle();
        String gpuPrice = GPU.gpuList[choiceGPU].getPrice();

        String storageMemoryTitle = memoryStorage.memoryStoragesList[choiceMemoryStorage].getTitle();
        String storageMemoryPrice = memoryStorage.memoryStoragesList[choiceMemoryStorage].getPrice();


        System.out.println("Материнська плата: " + motherboardTitle + "\n" + " Ціна: " + motherboardPrice + "₴" + "\n"
                            + "Процесор: " + cpuTitle + "\n" +" Ціна: " + cpuPrice + "₴" + "\n"
                            + "Система охолодження: " + systemCoolingTitle + "\n" + " Ціна: " + systemCoolingPrice + "₴" + "\n"
                            + "Блок живлення: " + suppliesPowerTitle + "\n" + " Ціна: " + suppliesPowerPrice + " ₴" + "\n"
                            + "Оперативна пам'ять: " + memoryOperatingTitle + "\n" + " Ціна: " + memoryOperatingPrice + " ₴" + "\n"
                            + "Відеокарта: " + gpuTitle + "\n" + " Ціна: " + gpuPrice + " ₴" + "\n"
                            + "Жорсткий диск: " + storageMemoryTitle + "\n" + " Ціна: " + storageMemoryPrice + " ₴" +"\n");
    }
}
