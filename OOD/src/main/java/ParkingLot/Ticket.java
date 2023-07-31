package ParkingLot;

import java.util.Date;

public class Ticket {
    private String id;
    private float amount;
    private Vehicle vehicle;
    private int parkingSpotNumber;
    private Date enterTime;
    private Date exitTime;


    private int status;//paid and unpaid
    private int paymentMethod;//Credit, Debit, Cash

    public Ticket(Vehicle vehicle,int parkingSpotNumber) {
        this.vehicle = vehicle;
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public Date getEnterTime() {
        return enterTime;
    }

    public Date getExitTime() {
        return exitTime;
    }
    public float Calculate(){
        return 0.0f;
    }

}
