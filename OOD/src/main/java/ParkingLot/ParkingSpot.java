package ParkingLot;

import java.util.List;

public class ParkingSpot {
    private final ParkingSpotType type;
    private int spotNumber;
    private Level level;
    private Vehicle parkedVehicle;//use to check if it is available

    public ParkingSpot(ParkingSpotType type, int spotNumber, Level level) {
        this.type = type;
        this.spotNumber = spotNumber;
        this.level = level;
    }
    public boolean isAvailable(){
        return parkedVehicle == null;
    }
    public boolean parkVehicle(Vehicle vehicle) {
        if (isAvailable() && type.equals(vehicle.vehicleType)) {
            parkedVehicle = vehicle;
            List<ParkingSpot> parkingSpots = level.getParkingSpots();
            parkingSpots.add(new ParkingSpot(type,spotNumber,level));
            int availableCount = level.getCurrentCount() + 1;
            level.updateCurrentCount(availableCount);
            return true;
        }
        return false;
    }
    public Ticket removeVehicle() {
        if (!isAvailable()) {
            Vehicle removedVehicle = parkedVehicle;
            parkedVehicle = null;
            int availableCount = level.getCurrentCount() - 1;
            List<ParkingSpot> parkingSpots = level.getParkingSpots();
            parkingSpots.remove(new ParkingSpot(type,spotNumber,level));
            level.updateCurrentCount(availableCount);
            return new Ticket(removedVehicle,spotNumber);
        }
        return null;
    }

}
