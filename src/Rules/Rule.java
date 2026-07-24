package Rules;

import Violations.Violation;

public interface Rule<T> {
    Violation check(T vehicle);
}