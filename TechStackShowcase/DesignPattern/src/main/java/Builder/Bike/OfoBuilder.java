package Builder.Bike;
//concrete builder
public class OfoBuilder extends Builder {
    @Override
    protected void buildFrame() {
        bike.setFrame("plastic frame");
    }

    @Override
    protected void buildSeat() {
        bike.setSeat("cloth seat");

    }

    @Override
    protected Bike createBike() {
        return bike;
    }
}
