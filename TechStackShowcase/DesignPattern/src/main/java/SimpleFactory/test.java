package SimpleFactory;

public class test {
    public static void main(String[] args) {
        //Create a coffeeStore
        CoffeeStore coffeeStore= new CoffeeStore();
        Coffee coffee = coffeeStore.orderCoffee("MochaCoffee");
        System.out.println(coffee.getName());
    }

}
