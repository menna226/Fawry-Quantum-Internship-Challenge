package Rules;

import Vehicles.VehicleType;

import java.util.*;

public class RuleProvider {
    private final Map<VehicleType, List<Rule>> vehicleRules;

    public RuleProvider() {
        vehicleRules = new HashMap<>();
    }
    public void register(VehicleType type, Rule rule) {
        vehicleRules.computeIfAbsent(type, k -> new ArrayList<>()).add(rule);
    }
    public List<Rule> getRules(VehicleType type) {
        return vehicleRules.getOrDefault(type, Collections.emptyList());
    }
}