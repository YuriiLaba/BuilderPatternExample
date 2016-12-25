/**
 * Created by jlaba on 25.12.2016.
 */
public abstract class PizzaBuilder {
    /**
     * Abstract class for making pizza
     */

    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizza() {
        pizza = new Pizza();
    }

    public abstract void buildCheese();
    public abstract void buildOil();
    public abstract void buildMeat();
    public abstract void buildseasoning();
}
