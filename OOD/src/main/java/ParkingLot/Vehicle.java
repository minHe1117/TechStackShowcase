package ParkingLot;

public abstract class Vehicle {
   protected String brand;
   protected String plateNo;
   protected final VehicleType vehicleType;

   protected Vehicle(VehicleType vehicleType) {
      this.vehicleType = vehicleType;
   }


}
