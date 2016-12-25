/**
 * Created by jlaba on 25.12.2016.
 */
public class PizzaExample {
    /**
     * Run
     */
    public static void main(String[] args) {
        Director director = new Director();
        PizzaBuilder Margarita = new Margarita();

        director.setPizza(Margarita);
        director.constructPizza();

        Pizza pizza = director.getPizza();
        System.out.println(pizza);
    }
}
