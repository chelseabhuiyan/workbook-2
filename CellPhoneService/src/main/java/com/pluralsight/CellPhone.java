package com.pluralsight;

public class CellPhone {
    //Create fields
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    //Default constructors (if no parameters given it sets to default values)
    public CellPhone(){
        this.serialNumber=0;
        this.model="";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    //Constructor with set values
    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    //Getters
    public int getSerialNumber() {
        return serialNumber;
    }

    public String getModel() {
        return model;
    }

    public String getCarrier() {
        return carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    // Setters
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
