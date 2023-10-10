package com.await.pcbuilder.bl;

import com.await.pcbuilder.da.AccessoriesList;

public class ViewAccessories {
    public static void view(){
        //Вивід списку материнських плат
        AccessoriesList motherboard = new AccessoriesList();
        System.out.println("Список материнських плат:");
        for(int i = 0; i<motherboard.motherboardlist.length; i++){
            System.out.println(motherboard.motherboardlist[i].viewMotherboard());
        }
        System.out.println();

        //Вивід списку процесорів
        AccessoriesList cpu = new AccessoriesList();
        System.out.println("Список процесорів:");
        for(int i = 0; i<cpu.cpuList.length; i++){
            System.out.println(cpu.cpuList[i].viewCPU());
        }
        System.out.println();

        //Вивід списку відеокарт
        AccessoriesList gpu = new AccessoriesList();
        System.out.println("Список відеокарт:");
        for(int i = 0; i<gpu.gpuList.length; i++){
            System.out.println(gpu.gpuList[i].viewGPU());
        }
        System.out.println();

        //Вивід списку оперативної пам'яті
        AccessoriesList OperatingMemory = new AccessoriesList();
        System.out.println("Список оперативної пам'яті:");
        for(int i = 0; i<OperatingMemory.operatingMemoriesList.length; i++) {
            System.out.println(OperatingMemory.operatingMemoriesList[i].viewOperatingMemory());
        }
        System.out.println();

        //Вивід списку дисків накопичення
        AccessoriesList memoryStorage = new AccessoriesList();
        System.out.println("Список дисків накопичення:");
        for(int i = 0; i<memoryStorage.memoryStoragesList.length; i++) {
            System.out.println(memoryStorage.memoryStoragesList[i].viewMemoryStorage());
        }
        System.out.println();

        //Вивід списку блоків живлення
        AccessoriesList powerSupplies = new AccessoriesList();
        System.out.println("Список блоків живлення:");
        for(int i = 0; i<powerSupplies.powerSuppliesList.length; i++) {
            System.out.println(powerSupplies.powerSuppliesList[i].viewPowerSupplies());
        }
        System.out.println();

        //Вивід списку охолодження процесора
        AccessoriesList SystemCooling = new AccessoriesList();
        System.out.println("Список систем охолодження:");
        for(int i = 0; i<SystemCooling.systemCoolingsList.length; i++) {
            System.out.println(SystemCooling.systemCoolingsList[i].viewSystemCooling());
        }
        System.out.println();

    }
}
