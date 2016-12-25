/**
 * Created by jlaba on 25.12.2016.
 */
public class Margarita extends PizzaBuilder {

    @Override
    public void buildCheese() {
        pizza.setCheese("Mozzarella");
    }

    @Override
    public void buildOil() {
        pizza.setOil("Olive oil");

    }

    @Override
    public void buildMeat() {
        pizza.setMeat("Without meat");

    }

    @Override
    public void buildseasoning() {
        pizza.setSeasoning("Basil, Salt");

    }
}
