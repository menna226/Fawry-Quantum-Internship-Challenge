package Violations;

import Vehicles.Vehicle;

import java.util.List;

public class Fine {
    private final Vehicle vehicle;
    private final List<Violation> violations;

    public Fine(Vehicle vehicle, List<Violation> violations) {
        this.vehicle = vehicle;
        this.violations = violations;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public List<Violation> getViolations() {
        return violations;
    }
    public int getTotalAmount() {
        int total = 0;
        for (Violation violation : violations) {
            total += violation.getFee();
        }
        return total;
    }
}