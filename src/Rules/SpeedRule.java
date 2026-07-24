package Rules;

import Vehicles.ISpeed;
import Violations.SpeedViolation;
import Violations.Violation;

public class SpeedRule implements Rule<ISpeed> {
    private final double violationFee;
    private final double speedLimit;

    public SpeedRule(double speedLimit, double fee) {
        this.speedLimit = speedLimit;
        this.violationFee = fee;
    }

    @Override
    public Violation check(ISpeed v) {
        if(v.getSpeed() > speedLimit){
            return new SpeedViolation(speedLimit, v.getSpeed(), violationFee);
        }
        return null;
    }
}
