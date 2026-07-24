package Violations;

public class SpeedViolation implements Violation {
    private final double fee;
    private final double speedLimit;
    private final double recordedSpeed;

    public SpeedViolation(double speedLimit, double recordedSpeed ,double fee) {
        this.speedLimit = speedLimit;
        this.recordedSpeed = recordedSpeed;
        this.fee = fee;
    }
    @Override
    public String getDescription() {
        return "speed of " +  recordedSpeed +
                " exceeded max allowed " + speedLimit;
    }
    @Override
    public String getName() {
        return "Speed Violations: ";
    }
    @Override
    public double getFee() {
        return fee;
    }
}
