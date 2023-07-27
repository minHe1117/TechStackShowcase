package SimpleFactory;

public class CoffeeFactory {

    public Coffee makeCoffee(String coffeeType){
        Coffee coffee = null;
        if(coffeeType.equals("LatteCoffee")){
            coffee = new LatteCoffee();
        }else if(coffeeType.equals("MochaCoffee")){
            coffee = new MochaCoffee();
        }else{
            throw new RuntimeException("Sorry, we don't have this kind of coffee");
        }

        return coffee;
    }
}
