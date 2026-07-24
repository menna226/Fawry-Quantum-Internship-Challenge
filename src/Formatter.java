import Violations.Fine;
import Violations.Violation;

import java.util.List;
import java.util.Map;

public class Formatter {
    public static String formatFine(Fine fine) {
        if (fine == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        sb.append("Traffic fine for ")
                .append(fine.getVehicle().getType().getDisplayName())
                .append(" ")
                .append(fine.getVehicle().getPlateNumber())
                .append("\n");

        sb.append("Total amount: ")
                .append(fine.getTotalAmount())
                .append(" EGP\n");

        sb.append("Violations:\n");
        for (Violation violation : fine.getViolations()) {
            sb.append("- ")
                    .append(violation.getDescription())
                    .append(" : ")
                    .append(violation.getFee())
                    .append(" EGP\n");
        }
        return sb.toString();
    }

    public static String formatAllFines(List<Fine> fines) {
        StringBuilder sb = new StringBuilder();
        sb.append("All fines:\n");

        for (Fine fine : fines) {
            sb.append(fine.getVehicle().getPlateNumber())
                    .append(" : ")
                    .append(fine.getTotalAmount())
                    .append(" EGP\n");
        }
        return sb.toString();
    }

    public static String formatViolationStats(Map<String, Integer> stats) {
        StringBuilder sb = new StringBuilder();
        sb.append("Violations.Violation statistics:\n");

        for (Map.Entry<String, Integer> entry : stats.entrySet()) {
            sb.append(entry.getKey())
                    .append(" : ")
                    .append(entry.getValue())
                    .append("\n");
        }
        return sb.toString();
    }
}