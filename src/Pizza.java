/**
 * Created by jlaba on 25.12.2016.
 */
public class Pizza {
    /**
     * Empty pizza
     */
    private String cheese = null;
    private String oil = null;
    private String meat = null;
    private String seasoning = null;

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setOil(String oil) {
        this.oil = oil;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setSeasoning(String seasoning) {
        this.seasoning = seasoning;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "cheese='" + cheese + '\'' +
                ", oil='" + oil + '\'' +
                ", meat='" + meat + '\'' +
                ", seasoning='" + seasoning + '\'' +
                '}';
    }
}
