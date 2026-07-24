package Rules;

import Vehicles.ISeatBelt;
import Violations.SeatbeltViolation;
import Violations.Violation;

public class SeatbeltRule implements Rule<ISeatBelt> {
    private final double violationFee;
    public  SeatbeltRule(double violationFee) {
        this.violationFee = violationFee;
    }

    @Override
    public Violation check(ISeatBelt v) {
        if(!v.isSeatBeltFastened()){
            return new SeatbeltViolation(violationFee);
        }
        return null;
    }
}
