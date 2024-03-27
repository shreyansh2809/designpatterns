package Structural.Decorator.Toppings;

import Structural.Decorator.BasePizza.BasePizza;

public class CheeseToppings extends ToppingDecorator{

    BasePizza pizza;

    public CheeseToppings(BasePizza pizza) {
        this.pizza = pizza;
    }

    public int getCost() {
        return pizza.getCost() + 20;
    }
}
