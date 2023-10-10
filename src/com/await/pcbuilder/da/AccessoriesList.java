package com.await.pcbuilder.da;

import com.await.pcbuilder.da.entity.Accessories;

public class AccessoriesList {

    public final Accessories.motherboard[] motherboardlist = {
      new Accessories.motherboard("Asus Prime H510M-K        ", "1200", "Intel H510","DDR4", "MicroATX", "2.822 "),
      new Accessories.motherboard("MSI H510M-A Pro           ", "1200", "Intel H510","DDR4", "MicroATX", "2.699 "),
      new Accessories.motherboard("GIGABYTE H310M S2         ", "1200", "Intel B85 ","DDR4", "MicroATX", "1.820 "),
      new Accessories.motherboard("GIGABYTE GA-AB350M-DS3H   ", "AM4 ", "AMD X370  ","DDR4", "MicroATX", "2.049 "),
      new Accessories.motherboard("Gigabyte X570 Aorus Xtreme", "AM4 ", "AMD X570  ","DDR4", "E-ATX   ", "32.238"),
    };

    public Accessories.cpu[] cpuList = {
      new Accessories.cpu("AMD Ryzen 5 5600G   ", "AM4 ", "6 ", "3900", "12", "7.039 "),
      new Accessories.cpu("Intel Core i5-11400F", "1200", "6 ", "2600", "12", "6.399 "),
      new Accessories.cpu("AMD Ryzen 9 5900X   ", "AM4 ", "12", "3700", "24", "17.989"),
      new Accessories.cpu("AMD Ryzen 7 5800X   ", "AM4 ", "8 ", "3400", "16", "19.899"),
      new Accessories.cpu("AMD A6-9500E        ", "AM4 ", "2 ", "3000", "4 ", "1.711 "),
    };

    public final Accessories.operatingMemory[] operatingMemoriesList = {
      new Accessories.operatingMemory("Kingston Fury DDR4-3200", "8192mb ", "DDR4", "3200MHz", "1.349"),
      new Accessories.operatingMemory("Kingston Fury DDR4-3600", "16384mb", "DDR4", "3600MHz", "3.232"),
      new Accessories.operatingMemory("Team Elite Plus DDR4   ", "16384mb", "DDR4", "2400MHz", "2.590"),
      new Accessories.operatingMemory("Kingston Fury DDR4-3400", "8192mb ", "DDR4", "3400MHz", "1.849"),
      new Accessories.operatingMemory("Goodram DDR4-3200      ", "16384mb", "DDR4", "3200MHz", "1.899"),
    };

    public final Accessories.memoryStorage[] memoryStoragesList = {
      new Accessories.memoryStorage("Western Digital Blue ", "1TB  ","SATAIII", "HDD", "7200   ", "1.519"),
      new Accessories.memoryStorage("Western Digital 500GB", "500GB","SATAIII", "HDD", "5000   ", "0.695"),
      new Accessories.memoryStorage("Western Digital Red  ", "4TB  ","SATAIII", "HDD", "7200   ", "5.399"),
      new Accessories.memoryStorage("HyperX Fury 3D 480GB ", "480GB","SATAIII", "SSD", "500mb/s", "2.359"),
      new Accessories.memoryStorage("Kingston SSD KC3000  ", "512GB","SATAIII", "HDD", "7000   ", "3.279"),
    };

    public final Accessories.powerSupplies[] powerSuppliesList = {
      new Accessories.powerSupplies("Aerocool VX Plus 500", "500w", "1x4+4pin", "1x(6+2pin)", "1.099"),
      new Accessories.powerSupplies("Aerocool VX Plus 600", "600w", "1x4+4pin", "1x(6+2pin)", "1.369"),
      new Accessories.powerSupplies("ASUS TUF Gaming 750W", "750w", "1x4+4pin", "1x(6+2pin)", "3.899"),
      new Accessories.powerSupplies("Chieftec GPS-600A8  ", "600w", "1x4+4pin", "1x(6+2pin)", "1.749"),
      new Accessories.powerSupplies("Vinga 750W          ", "750w", "1x4+4pin", "1x(6+2pin)", "3.289"),
      new Accessories.powerSupplies("Chieftec GPS-550A8  ", "550w", "1x4+4pin", "1x(6+2pin)", "1.589"),
    };

    public final Accessories.gpu[] gpuList = {
      new Accessories.gpu("MSI GeForce GTX 1650 ","4GB ","8000MHz ","1740MHz","8.339 "),
      new Accessories.gpu("Asus GeForce RTX 3060","12GB","15000MHz","1867MHz","17.949"),
      new Accessories.gpu("GeForce RTX 3070 Ti  ","8GB ","19000MHz","1575MHz","30.209"),
      new Accessories.gpu("ASUS GTX 1060 6Gb    ","6GB ","8008MHz ","1742MHz","7.070 "),
      new Accessories.gpu("Zotac GTX 1080Ti 11Gb","11GB","11200MHz","1770MHz","12.524"),
      new Accessories.gpu("AMD Radeon RX 480    ","4GB ","7000MHz ","1240MHz","4.847"),
    };

    public final Accessories.systemCooling[] systemCoolingsList = {
      new Accessories.systemCooling("PcCooler GI-U4 SRGB","4-pin","Tower","0.599 "),
      new Accessories.systemCooling("Enermax ETS-F40    ","4-pin","Tower","1.499 "),
      new Accessories.systemCooling("Pure Rock 2 Black  ","4-pin","Tower","1.899 "),
      new Accessories.systemCooling("Dark Rock Pro 4    ","4-pin","Tower","3.899 "),
      new Accessories.systemCooling("Pure Loop 2 FX 280 ","4-pin","WCS  ","5.699 "),
      new Accessories.systemCooling("Corsair H170i Elite","4-pin","WCS  ","15.399"),

    };
}
