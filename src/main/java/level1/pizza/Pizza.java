package level1.pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Pizza {

    private final PizzaSize size;
    private final PizzaDoughType doughType;
    private final List<String> toppings;

    public Pizza(PizzaSize size, PizzaDoughType doughType, List<String> toppings) {
        this.size = size;
        this.doughType = doughType;
        this.toppings = new ArrayList<>(toppings);
    }

    public PizzaSize getSize() {
        return size;
    }

    public PizzaDoughType getDoughType() {
        return doughType;
    }

    public List<String> getToppings() {
        return List.copyOf(toppings);
    }

    @Override
    public String toString() {
        return "Size: " + size.toString().toLowerCase() + "\nDough: " + doughType.toString().toLowerCase() + "\nToppings: " + String.join(", ", toppings);
    }
}
