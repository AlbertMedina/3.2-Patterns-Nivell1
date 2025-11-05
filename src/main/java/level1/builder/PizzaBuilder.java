package level1.builder;

import level1.pizza.Pizza;
import level1.pizza.PizzaDoughType;
import level1.pizza.PizzaSize;

import java.util.List;

public interface PizzaBuilder {

    void setSize(PizzaSize size);

    void setDoughType(PizzaDoughType doughType);

    void setToppings(List<String> toppings);

    Pizza getResult();
}
