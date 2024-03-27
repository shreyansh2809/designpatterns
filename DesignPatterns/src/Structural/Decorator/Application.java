package Structural.Decorator;

import Structural.Decorator.BasePizza.BasePizza;
import Structural.Decorator.BasePizza.FarmHouse;
import Structural.Decorator.Toppings.CheeseToppings;
import Structural.Decorator.Toppings.MushroomTopping;

public class Application {
    public static void main(String[] args) {
        BasePizza pizza = new FarmHouse();
        pizza = new CheeseToppings(pizza);
        pizza = new MushroomTopping(pizza);
        System.out.println(pizza.getCost());
    }
}
