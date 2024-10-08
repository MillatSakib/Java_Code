package OOP;

class MobilePhone{
    protected int battrayCapacity,chargerCurrentCapacity, price;
    protected String mobileName, brand, mobileWeight, os;
    protected double screenSize;
    private boolean allInitiate = false;
    MobilePhone(String mobileName, String brand, int battrayCapacity){
        this.mobileName = mobileName;
        this.brand = brand;
        this.battrayCapacity = battrayCapacity;
    }

    MobilePhone(int betaryCapacity, int chargerCurrentCapacity, String mobileName, String brand, String mobileWeight, String os, double screenSize){
        this.battrayCapacity = battrayCapacity;
        this.brand = brand;
        this.mobileName = mobileName;
        this.chargerCurrentCapacity = chargerCurrentCapacity;
        this.mobileWeight = mobileWeight;
        this.os = os;
        this.screenSize = screenSize;
    }
    
    String getMobileName(){
        return this.mobileName;
    }
    String getMobileBrand(){
        return this.mobileName;
    }
    String getMobileWeight(){
        return this.mobileName;
    }
    String getOS(){
        return os;
    }
    double getScreenSize(){
        return screenSize;
    }
    int getBettaryCapacity(){
        return betaryCapacity;
    }
    int getChargerCurrentCapacity(){
        return chargerCurrentCapacity;
    }
    
    int getPrice(){
        return price;
    }


    void setMobileName(String mobileName){
         this.mobileName = mobileName ;
    }
    void setMobileBrand(String mobileName){
         this.setMobileBrand = setMobileBrand ;
    }
    void getMobileWeight(String mobileWeight){
        this.mobileWeight = mobileWeight;
    }
    void setOS(String os){
         this.os = os ;
    }
    void setScreenSize(double screenSize){
         this.screenSize = screenSize ;
    }
    void setBettaryCapacity(int betaryCapacity){
         this.betaryCapacity = betaryCapacity ;
    }
    void setChargerCurrentCapacity(int chargerCurrentCapacity){
         this.chargerCurrentCapacity = chargerCurrentCapacity ;
    }
    
    void setChargerCurrentCapacity(int price){
         this.price = price ;
    }

    void FullMobileSpecification(){
        System.out.println("Mobile Name: "+ mobileName);
        System.out.println("Brand Name: "+ brand);
        System.out.println("Battary Capacity: "+ battrayCapacity+" mAh");
        System.out.println("Charger Capacity: "+ chargerCurrentCapacity+" mAh");
        System.out.println("Mobile Weight: "+ mobileWeight+" gm");
        System.out.println("Operating System: "+ os);
        System.out.println("Screen Size: "+ screenSize+" inch");
    }

}

class FeaturePhone extends MobilePhone{
    private String hasBluetooth, hasCamera, hasFlashLight, hasFM;
    FeaturePhone(String hasBluetooth, String hasCamera, String hasFlashlight, String hasFM){
        this.hasBluetooth = hasBluetooth;
        this.hasCamera = hasCamera;
        this.hasFlashLight = hasFlashlight;
        this.hasFM = hasFM;
    }
    @Override
    void FullMobileSpecification(){
        System.out.println("Mobile Name: "+ mobileName);
        System.out.println("Brand Name: "+ brand);
        System.out.println("Battary Capacity: "+ battrayCapacity+" mAh");
        System.out.println("Charger Capacity: "+ chargerCurrentCapacity+" mAh");
        System.out.println("Mobile Weight: "+ mobileWeight+" gm");
        System.out.println("Operating System: "+ os);
        System.out.println("Screen Size: "+ screenSize+" inch");
        System.out.println("Bluetooth Availability: "+ hasBluetooth);
        System.out.println("Camera: "+ hasCamera);
        System.out.println("Flash Light: "+ hasFlashLight);
        System.out.println("FM Radio: "+ hasFM);

    }
}

class SmartPhone extends MobilePhone{
    private double cameraMP, processorClockSpeed;
    private int numberOfFlash, numberOfCamera, numberOfCore, sizeOfRam;
    private boolean allInitiate = false;
    

    @Override
    void FullMobileSpecification(){
        System.out.println("Mobile Name: "+ mobileName);
        System.out.println("Brand Name: "+ brand);
        System.out.println("Battary Capacity: "+ battrayCapacity+" mAh");
        System.out.println("Charger Capacity: "+ chargerCurrentCapacity+" mAh");
        System.out.println("Mobile Weight: "+ mobileWeight+" gm");
        System.out.println("Operating System: "+ os);
        System.out.println("Screen Size: "+ screenSize+" inch");
        System.out.println("Chepset: "+);
    }
}

public class Inheritance {
    
}
