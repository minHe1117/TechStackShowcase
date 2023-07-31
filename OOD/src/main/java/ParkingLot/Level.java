package ParkingLot;


import java.util.List;

public class Level {
    private List<ParkingSpot> parkingSpots;
    private int availableCount;

    public Level() {
        this.availableCount = Constant.NUM_SPORTS;
    }
    public ParkingSpot findAvailableSpot() {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.isAvailable()) {
                return spot;
            }
        }
        return null;
    }
    public int getCurrentCount(){
        return this.availableCount;
    }
    public void updateCurrentCount(int availableCount){
        this.availableCount = availableCount;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }
}