import Rules.RuleProvider;
import Rules.SeatbeltRule;
import Rules.SpeedRule;
import Vehicles.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        RuleProvider ruleProvider = new RuleProvider();

        ruleProvider.register(VehicleType.PRIVATE, new SpeedRule(80, 300));
        ruleProvider.register(VehicleType.PRIVATE, new SeatbeltRule(100));

        ruleProvider.register(VehicleType.TRUCK, new SpeedRule(60, 300));
        ruleProvider.register(VehicleType.TRUCK, new SeatbeltRule(100));

        ruleProvider.register(VehicleType.BUS, new SpeedRule(60, 300));
        ruleProvider.register(VehicleType.BUS, new SeatbeltRule(100));

        Radar radar = new Radar(ruleProvider);

        Vehicle car = new Car("ABC1234", LocalDate.now(), 95, false);
        Vehicle bus = new Bus("BBe3", LocalDate.now(), 58, false);
        Vehicle truck = new Truck("DEF1234", LocalDate.now(), 55, true);

        System.out.println(Formatter.formatFine(radar.observe(car)));
        System.out.println(Formatter.formatFine(radar.observe(bus)));
        System.out.println(Formatter.formatFine(radar.observe(truck)));

        System.out.println(Formatter.formatAllFines(radar.getFines()));
        System.out.println(Formatter.formatViolationStats(radar.getViolationStat()));
    }
}