package Vehicles;

import java.time.LocalDate;

public abstract class Vehicle {
    private  final String plateNumber;
    private final VehicleType type;
    private final LocalDate date;

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
