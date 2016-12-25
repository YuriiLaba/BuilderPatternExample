/**
 * Created by jlaba on 25.12.2016.
 */
public class Paperoni extends PizzaBuilder {
    /**
     * Implementation of pizza
     * Certain Builder
     */
    @Override
    public void buildCheese() {
        pizza.setCheese("Simple cheese");
    }

    @Override
    public void buildOil() {
        pizza.setOil("Without oil");

    }

    @Override
    public void buildMeat() {
        pizza.setMeat("Paperoni");

    }

    @Override
    public void buildseasoning() {
        pizza.setSeasoning("Basil, Salt");

    }
}
