import Rules.Rule;
import Rules.RuleProvider;
import Vehicles.Vehicle;
import Violations.Fine;
import Violations.Violation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Radar {
    private final RuleProvider ruleProvider;
    private final List<Fine> fines;

    public Radar(RuleProvider ruleProvider) {
        this.ruleProvider = ruleProvider;
        this.fines = new ArrayList<>();
    }
    public Fine observe(Vehicle vehicle) {
        List<Violation> violations = new ArrayList<>();
        List<Rule> rules = ruleProvider.getRules(vehicle.getType());

        for (Rule rule : rules) {
            Violation violation = rule.check(vehicle);
            if (violation != null) {
                violations.add(violation);
            }
        }

        if (!violations.isEmpty()) {
            Fine fine = new Fine(vehicle, violations);
            fines.add(fine);
            return fine;
        }
        return null;
    }
    public List<Fine> getFines() {
        return fines;
    }
    public Map<String, Integer> getViolationStat(){
        Map<String, Integer> map = new HashMap<>();
        for (Fine fine : fines) {
            for(Violation violation : fine.getViolations()){
                String ruleName = violation.getName();
                if(map.containsKey(ruleName)){
                    map.put(ruleName, map.get(ruleName) + 1);
                }
                else{
                    map.put(ruleName, 1);
                }
            }
        }
        return map;
    }
}