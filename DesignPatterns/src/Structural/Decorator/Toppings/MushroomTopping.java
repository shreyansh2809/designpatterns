package Structural.Decorator.Toppings;

import Structural.Decorator.BasePizza.BasePizza;

public class MushroomTopping extends ToppingDecorator{
    BasePizza pizza;

    public MushroomTopping(BasePizza pizza) {
        this.pizza = pizza;
    }

    public int getCost() {
        return pizza.getCost() + 30;
    }
}
