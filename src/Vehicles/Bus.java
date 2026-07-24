package Vehicles;

import java.time.LocalDate;

public class Bus extends Vehicle implements ISpeed, ISeatBelt {
    private double speed;
    private boolean seatBeltFastened;

    public Bus(String plateNumber, LocalDate date, double speed,  boolean seatBeltFastened) {
        super(plateNumber, VehicleType.BUS, date);
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
