package com.await.pcbuilder.da.entity;

public class Accessories {

    public static class infoProduct {
        private String title;

        private String price;

        public void setPrice(String price) {
            this.price = price;
        }

        public String getPrice() {
            return price;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
    public static class motherboard extends infoProduct {
        private String socket;
        private String chipset;
        private String memorySupport;
        private String formFactor;

        public motherboard(String title,
                           String socket,
                           String chipset,
                           String memorySupport,
                           String formFactor,
                           String price) {
            setTitle(title);
            this.socket = socket;
            this.chipset = chipset;
            this.memorySupport = memorySupport;
            this.formFactor = formFactor;
            setPrice(price);
        }

        public String getSocket() {
            return socket;
        }

        public String getChipset(){
            return chipset;
        }

        public String getMemorySupport() {
            return memorySupport;
        }

        public String getFormFactor() {
            return formFactor;
        }

        public String viewMotherboard(){
            String viewMotherboardList = "";

            viewMotherboardList = getTitle() + " | "
                    + getSocket() + " | "
                    + getChipset() + " | "
                    + getMemorySupport() + " | "
                    + getFormFactor() + " | "
                    + getPrice() + " ₴";
            return viewMotherboardList;
        }

    }
    public static class cpu extends infoProduct {
        private String socket;
        private String cores;
        private String frequency;
        private String streams;

        public cpu(String title, String socket, String cores, String frequency, String streams, String price) {
            setTitle(title);
            this.socket = socket;
            this.cores = cores;
            this.frequency = frequency;
            this.streams = streams;
            setPrice(price);
        }

        public String getSocket() {
            return socket;
        }

        public String getCores() {
            return cores;
        }

        public String getFrequency() {
            return frequency;
        }

        public String getStreams() {
            return streams;
        }

        public String viewCPU(){
            String viewCPUList = "";

            viewCPUList = getTitle() + " | "
                        + getSocket() + " | "
                        + getCores() + " | "
                        + getFrequency() + " | "
                        + getStreams() + " | "
                        + getPrice() + " ₴";
            return viewCPUList;
        }
    }
    public static class operatingMemory extends infoProduct {
        private String sizeMemory;
        private String typeMemory;
        private String frequencyMemory;

        public operatingMemory(String title, String sizeMemory, String typeMemory, String frequencyMemory, String price) {
            setTitle(title);
            this.sizeMemory = sizeMemory;
            this.typeMemory = typeMemory;
            this.frequencyMemory = frequencyMemory;
            setPrice(price);
        }

        public String getSizeMemory() {
            return sizeMemory;
        }

        public String getTypeMemory() {
            return typeMemory;
        }

        public String getFrequencyMemory() {
            return frequencyMemory;
        }

        public String viewOperatingMemory() {
            String viewOperatingMemoryList = "";

            viewOperatingMemoryList = getTitle() + " | "
                    + getSizeMemory() + " | "
                    + getTypeMemory() + " | "
                    + getFrequencyMemory() + " | "
                    + getPrice() + " ₴";
            return viewOperatingMemoryList;
        }
    }
    public static class memoryStorage extends infoProduct {
        private String driveCapacity;
        private String connectionInterface;
        private String Technology;
        private String rpmSpeed;

        public memoryStorage(String title, String driveCapacity, String connectionInterface, String technology, String rpmSpeed, String price) {
            setTitle(title);
            this.driveCapacity = driveCapacity;
            this.connectionInterface = connectionInterface;
            this.Technology = technology;
            this.rpmSpeed = rpmSpeed;
            setPrice(price);
        }

        public String getDriveCapacity() {
            return driveCapacity;
        }

        public String getConnectionInterface() {
            return connectionInterface;
        }

        public String getTechnology() {
            return Technology;
        }

        public String getRpmSpeed() {
            return rpmSpeed;
        }

        public String viewMemoryStorage() {
            String viewMemoryStorageList = "";

            viewMemoryStorageList = getTitle() + " | "
                    + getDriveCapacity() + " | "
                    + getConnectionInterface() + " | "
                    + getTechnology() + " | "
                    + getRpmSpeed() + " | "
                    + getPrice() + " ₴";
            return viewMemoryStorageList;
        }

    }
    public static class powerSupplies extends infoProduct{
        private String power;
        private String processorPowerSupply;
        private String powerForGPU;

        public powerSupplies(String title, String power, String processorPowerSupply, String powerForGPU, String price) {
            setTitle(title);
            this.power = power;
            this.processorPowerSupply = processorPowerSupply;
            this.powerForGPU = powerForGPU;
            setPrice(price);
        }

        public String getPower() {
            return power;
        }

        public String getProcessorPowerSupply() {
            return processorPowerSupply;
        }

        public String getPowerForGPU() {
            return powerForGPU;
        }

        public String viewPowerSupplies(){
            String viewPowerSuppliesList = "";

            viewPowerSuppliesList = getTitle() + " | "
                    + getPower() + " | "
                    + getProcessorPowerSupply() + " | "
                    + getPowerForGPU() + " | "
                    + getPrice() + " ₴";
            return viewPowerSuppliesList;
        }

    }
    public static class gpu extends infoProduct{
        private String memorySize;
        private String memoryFrequency;
        private String coreFrequency;

        public gpu(String title, String memorySize, String memoryFrequency, String coreFrequency, String price) {
            setTitle(title);
            this.memorySize = memorySize;
            this.memoryFrequency = memoryFrequency;
            this.coreFrequency = coreFrequency;
            setPrice(price);
        }

        public String getMemorySize() {
            return memorySize;
        }

        public String getMemoryFrequency() {
            return memoryFrequency;
        }

        public String getCoreFrequency() {
            return coreFrequency;
        }

        public String viewGPU(){
            String viewGPUList = "";

            viewGPUList = getTitle() + " | "
                    + getMemorySize() + " | "
                    + getMemoryFrequency() + " | "
                    + getCoreFrequency() + " | "
                    + getPrice() + " ₴";
            return viewGPUList;
        }
    }
    public static class systemCooling extends infoProduct{
        private String powerConnectors;
        private String design;

        public systemCooling(String title, String powerConnectors, String design, String price) {
            setTitle(title);
            this.powerConnectors = powerConnectors;
            this.design = design;
            setPrice(price);
        }

        public String getPowerConnectors() {
            return powerConnectors;
        }

        public String getDesign() {
            return design;
        }

        public String viewSystemCooling(){
            String viewSystemCoolingList = "";

            viewSystemCoolingList = getTitle() + " | "
                    + getPowerConnectors() + " | "
                    + getDesign() + " | "
                    + getPrice() + " ₴";
            return viewSystemCoolingList;
        }
    }
}
