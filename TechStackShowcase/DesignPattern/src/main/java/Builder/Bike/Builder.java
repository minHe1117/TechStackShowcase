package Builder.Bike;
//abstract builder
public abstract class Builder {
     Bike bike = new Bike();
     protected abstract void buildFrame();
     protected abstract void buildSeat();

     protected abstract Bike createBike();
}
