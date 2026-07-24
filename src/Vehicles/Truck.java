package Vehicles;

import java.time.LocalDate;

public class Truck extends Vehicle implements ISpeed, ISeatBelt {
    private double speed;
    private boolean seatBeltFastened;

    public Truck(String plateNumber, LocalDate date, double speed,  boolean seatBeltFastened) {
        super(plateNumber, VehicleType.TRUCK, date);
        this.speed = speed;
        this.seatBeltFastened = seatBeltFastened;
    }

    @Override
    public boolean isSeatBeltFastened() {
        return  seatBeltFastened;
    }

    @Override
    public double getSpeed() {
        return speed;
    }
}
