package Violations;

public class SeatbeltViolation implements Violation {
    private final double fee;

    public SeatbeltViolation(double fee) {
        this.fee = fee;
    }
    @Override
    public String getDescription() {
        return "Seatbelt not fastened";
    }
    @Override
    public String getName() {
        return "Seatbelt Violations: ";
    }
    @Override
    public double getFee() {
        return fee;
    }
}