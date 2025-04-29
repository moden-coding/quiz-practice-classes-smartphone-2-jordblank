public class Smartphone {
    String brand;
    String model;
    int storageCapacity;
    int batteryPercentage;
    boolean isOn;


    public Smartphone(String b, String m, int sC, int bP){
        brand = b;
        model = m;
        storageCapacity = sC;
        batteryPercentage = bP;
        isOn = false;

    }
    
   
   

   
    public void turnOn() {
            if (batteryPercentage > 0 && isOn == false){
                isOn = true;
                System.out.println(true); 
            }
            if (batteryPercentage == 0){
               isOn = false;
               System.out.println(false);
            
        }
    }

    public void turnOff() {
            isOn = false;
        
    }

    public void chargePhone(int chargeAmount) {
        batteryPercentage += chargeAmount;
        if (batteryPercentage > 100){
            batteryPercentage = 100;
        }
    }

    public String toString() {
        return ("Brand: " + brand + " Model " + model + " Storage: " + storageCapacity + " Battery: " + batteryPercentage + " On: " + isOn);

    
        }
    }
