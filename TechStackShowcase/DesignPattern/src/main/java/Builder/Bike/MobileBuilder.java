package Builder.Bike;
//concrete builder
public class MobileBuilder extends Builder {
    @Override
    protected void buildFrame() {
        bike.setFrame("iron frame");
    }

    @Override
    protected void buildSeat() {
        bike.setSeat("leather seat");

    }

    @Override
    protected Bike createBike() {
        return bike;
    }
}
