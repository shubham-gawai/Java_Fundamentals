package JavaFundaPractice;

public class Vehic {
    private String make;
    private String model;
    private int year;
    private int numWheels;
    private int mileage;
    private String plateNumber;
     public Vehic(String make, String model, int year, int numWheels) {
        this.make = make;
        this.model = model;
        if (year < 1900) {
            throw new IllegalArgumentException();
        }
        this.year = year;
        this.numWheels = numWheels;
        this.mileage = 0;
        this.plateNumber = "unknown";
    }public String getMake() {
        return this.make;
    }
    
    public String getModel() {
        return this.model;
    }
    
    public int getYear() {
        return this.year;
    }
    
    public int getNumWheels() {
        return this.numWheels;
    }
    
    public int getMileage() {
        return this.mileage;
    }
    
    public String getPlateNumber() {
        return this.plateNumber;
    }public void setMileage(int newMileage) {
        if (newMileage < this.mileage) {
            throw new IllegalArgumentException();
        }
        this.mileage = newMileage;
    }
 public void setPlateNumber(String plate) {
        this.plateNumber = plate;
    }public String toString() {
        String str = this.make + " " + this.model;
        return str;
    }
}

