package Vehicles;

import java.time.LocalDate;

public abstract class Vehicle {
    private  String plateNumber;
    private VehicleType type;
    private LocalDate date;

    public  Vehicle(String plateNumber, VehicleType type, LocalDate date) {
        this.plateNumber = plateNumber;
        this.type = type;
        this.date = date;
    }
    public String getPlateNumber() {
        return plateNumber;
    }
    public VehicleType getType() {
        return type;
    }
    public LocalDate getDate() {
        return date;
    }
}
