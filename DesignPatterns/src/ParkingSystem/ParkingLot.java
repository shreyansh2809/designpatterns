package ParkingSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {

    private Map<VehicleType, List<ParkingSpot>> spotsByType;

    public ParkingLot(int capacity) {
        spotsByType = new HashMap<>();
        for (VehicleType type : VehicleType.values()) {
            spotsByType.put(type, new ArrayList<>(capacity / 3)); // Equal distribution for each type
        }
        for (int i = 1; i <= capacity; i++) {
            for (VehicleType type : VehicleType.values()) {
                spotsByType.get(type).add(new ParkingSpot(i));
            }
        }
    }

    public ParkingSpot findAvailableSpot(VehicleType type) {
        // Logic to find an available spot based on vehicle type
        for (ParkingSpot spot : spotsByType.get(type)) {
            if (!spot.isOccupied()) {
                return spot;
            }
        }
        return null; // No available spot found
    }

}
