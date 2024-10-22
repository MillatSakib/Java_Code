package Java.OOP;

class MobilePhone {
    protected int battrayCapacity, chargerCurrentCapacity, price;
    protected String mobileName, brand, mobileWeight, os;
    protected double screenSize;

    MobilePhone(String mobileName, String brand, int battrayCapacity) {
        this.mobileName = mobileName;
        this.brand = brand;
        this.battrayCapacity = battrayCapacity;
    }

    MobilePhone(int battrayCapacity, int chargerCurrentCapacity, String mobileName, String brand, String mobileWeight, String os, double screenSize) {
        this.battrayCapacity = battrayCapacity;
        this.chargerCurrentCapacity = chargerCurrentCapacity;
        this.mobileName = mobileName;
        this.brand = brand;
        this.mobileWeight = mobileWeight;
        this.os = os;
        this.screenSize = screenSize;
    }

    String getMobileName() {
        return this.mobileName;
    }

    String getMobileBrand() {
        return this.brand;
    }

    String getMobileWeight() {
        return this.mobileWeight;
    }

    String getOS() {
        return os;
    }

    double getScreenSize() {
        return screenSize;
    }

    int getBattrayCapacity() {
        return battrayCapacity;
    }

    int getChargerCurrentCapacity() {
        return chargerCurrentCapacity;
    }

    int getPrice() {
        return price;
    }

    void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    void setMobileBrand(String brand) {
        this.brand = brand;
    }

    void setMobileWeight(String mobileWeight) {
        this.mobileWeight = mobileWeight;
    }

    void setOS(String os) {
        this.os = os;
    }

    void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    void setBattrayCapacity(int battrayCapacity) {
        this.battrayCapacity = battrayCapacity;
    }

    void setChargerCurrentCapacity(int chargerCurrentCapacity) {
        this.chargerCurrentCapacity = chargerCurrentCapacity;
    }

    void setPrice(int price) {
        this.price = price;
    }

    void FullMobileSpecification() {
        System.out.println("Mobile Name: " + mobileName);
        System.out.println("Brand Name: " + brand);
        System.out.println("Battery Capacity: " + battrayCapacity + " mAh");
        System.out.println("Charger Capacity: " + chargerCurrentCapacity + " mAh");
        System.out.println("Mobile Weight: " + mobileWeight + " gm");
        System.out.println("Operating System: " + os);
        System.out.println("Screen Size: " + screenSize + " inch");
    }


    void FullMobileSpecification(boolean displayNameAndBrand) {
        if (displayNameAndBrand) {
            System.out.println("Mobile Name: " + mobileName);
            System.out.println("Brand Name: " + brand);
        } else {
            FullMobileSpecification(); 
        }
    }
}



class FeaturePhone extends MobilePhone {
    private String hasBluetooth, hasCamera, hasFlashLight, hasFM;

    FeaturePhone(String mobileName, String brand, int battrayCapacity, String hasBluetooth, String hasCamera, String hasFlashLight, String hasFM, int chargerCurrentCapacity, String mobileWeight, String os, double screenSize) {
        super(mobileName, brand, battrayCapacity);
        this.chargerCurrentCapacity = chargerCurrentCapacity;
        this.mobileWeight = mobileWeight;
        this.os = os;
        this.screenSize = screenSize;
        this.hasBluetooth = hasBluetooth;
        this.hasCamera = hasCamera;
        this.hasFlashLight = hasFlashLight;
        this.hasFM = hasFM;
    }

    @Override
    void FullMobileSpecification() {
        super.FullMobileSpecification();
        System.out.println("Bluetooth Availability: " + hasBluetooth);
        System.out.println("Camera: " + hasCamera);
        System.out.println("Flash Light: " + hasFlashLight);
        System.out.println("FM Radio: " + hasFM);
    }

    String getHasBluetooth() {
        return hasBluetooth;
    }

    void setHasBluetooth(String hasBluetooth) {
        this.hasBluetooth = hasBluetooth;
    }

    String getHasCamera() {
        return hasCamera;
    }

    void setHasCamera(String hasCamera) {
        this.hasCamera = hasCamera;
    }

    String getHasFlashLight() {
        return hasFlashLight;
    }

    void setHasFlashLight(String hasFlashLight) {
        this.hasFlashLight = hasFlashLight;
    }

    String getHasFM() {
        return hasFM;
    }

    void setHasFM(String hasFM) {
        this.hasFM = hasFM;
    }
}

class SmartPhone extends MobilePhone {
    private double cameraMP, processorClockSpeed;
    private int numberOfFlash, numberOfCamera, numberOfCore, sizeOfRam;
    private String chipSet;

    SmartPhone(String mobileName, String brand, int battrayCapacity, double cameraMP, double processorClockSpeed, int numberOfCamera, int numberOfCore, int sizeOfRam, String chipSet, int chargerCurrentCapacity, String mobileWeight, String os, double screenSize) {
        super(mobileName, brand, battrayCapacity);
        this.cameraMP = cameraMP;
        this.processorClockSpeed = processorClockSpeed;
        this.numberOfCamera = numberOfCamera;
        this.numberOfCore = numberOfCore;
        this.sizeOfRam = sizeOfRam;
        this.chipSet = chipSet;
        this.chargerCurrentCapacity = chargerCurrentCapacity;
        this.mobileWeight = mobileWeight;
        this.os = os;
        this.screenSize = screenSize;
    }

    @Override
    void FullMobileSpecification() {
        super.FullMobileSpecification();
        System.out.println("Chipset: " + chipSet);
        System.out.println("Number of Camera: " + numberOfCamera);
        System.out.println("Processor Clock: " + processorClockSpeed);
        System.out.println("Number of Core: " + numberOfCore);
        System.out.println("RAM: " + sizeOfRam + " GB");
    }

    public double getCameraMP() {
        return cameraMP;
    }

    public void setCameraMP(double cameraMP) {
        this.cameraMP = cameraMP;
    }

    public double getProcessorClockSpeed() {
        return processorClockSpeed;
    }

    public void setProcessorClockSpeed(double processorClockSpeed) {
        this.processorClockSpeed = processorClockSpeed;
    }

    public int getNumberOfFlash() {
        return numberOfFlash;
    }

    public void setNumberOfFlash(int numberOfFlash) {
        this.numberOfFlash = numberOfFlash;
    }

    public int getNumberOfCamera() {
        return numberOfCamera;
    }

    public void setNumberOfCamera(int numberOfCamera) {
        this.numberOfCamera = numberOfCamera;
    }

    public int getNumberOfCore() {
        return numberOfCore;
    }

    public void setNumberOfCore(int numberOfCore) {
        this.numberOfCore = numberOfCore;
    }

    public int getSizeOfRam() {
        return sizeOfRam;
    }

    public void setSizeOfRam(int sizeOfRam) {
        this.sizeOfRam = sizeOfRam;
    }

    public String getChipSet() {
        return chipSet;
    }

    public void setChipSet(String chipSet) {
        this.chipSet = chipSet;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        MobilePhone basicPhone = new MobilePhone("Nokia 1100", "Nokia", 900);
        basicPhone.FullMobileSpecification();
        basicPhone.FullMobileSpecification(true);

        System.out.println();

        FeaturePhone featurePhone = new FeaturePhone("Nokia 3310", "Nokia", 1200, "Yes", "Yes", "Yes", "Yes", 500, "150 gm", "Symbian", 2.4);
        featurePhone.FullMobileSpecification();

        System.out.println();

        SmartPhone smartPhone = new SmartPhone("iPhone 14", "Apple", 3300, 12, 2.9, 3, 8, 6, "A16 Bionic", 20, "172 gm", "iOS", 6.1);
        smartPhone.FullMobileSpecification();
    }
}
