package SimpleFactory;

public class CoffeeStore {

    public Coffee orderCoffee(String coffeeType){
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee coffee = coffeeFactory.makeCoffee(coffeeType);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }

}
