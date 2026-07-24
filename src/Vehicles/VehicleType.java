package Vehicles;

public enum VehicleType {
    PRIVATE("Vehicles.Car"),
    TRUCK("Vehicles.Truck"),
    BUS("Vehicles.Bus");

    private final String displayName;

    VehicleType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}