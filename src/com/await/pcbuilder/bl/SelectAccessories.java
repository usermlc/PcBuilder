package com.await.pcbuilder.bl;

import com.await.pcbuilder.ui.ChoiceAccessories;
import com.await.pcbuilder.ui.Menu;

public class SelectAccessories {


    public static void listAccessories(){
        ChoiceAccessories accessories = new ChoiceAccessories();
        double price = 0;

        price += accessories.choiceMotherboard();
        price += accessories.choiceCPU();
        price += accessories.choiceSystemCooling();
        price += accessories.choicePowerSupplies();
        price += accessories.choiceOperatingMemory();
        price += accessories.choiceGPU();
        price += accessories.choiceMemoryStorage();
        accessories.sourceAssembly();
        System.out.println("Ваша збірка буде коштувати: " + price + "₴");
        Menu.returnMenu();
    }

}
