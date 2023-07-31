package ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private String name;
    private int availableSpots;
    private boolean available;
    private List<Level> levels;

    public ParkingLot(String name, List<Level> levels) {
        this.name = name;
        levels = new ArrayList<Level>();
        for(int i = 0; i < Constant.LEVEL;i++){
            levels.add(new Level());
        }
    }
    public boolean isAvailable(){
        return available;
    }
    public Level findAvailableLevel() {
        for (Level level : levels) {
            if (level.getCurrentCount() != 0) {
                return level;
            }
        }
        return null;
    }

}
