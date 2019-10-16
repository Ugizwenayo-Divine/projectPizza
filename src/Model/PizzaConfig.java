package Model;

public class PizzaConfig {

    private double base_price;
    private OptionSet[] optionset;
    private String size;
    private String PizzaName;
    private String deliveryMode;

    public double getBase_price() {
        return base_price;
    }

    public void setBase_price(double base_price) {
        this.base_price = base_price;
    }

    public OptionSet[] getOptionset() {
        return optionset;
    }

    public void setOptionset(OptionSet[] optionset) {
        this.optionset = optionset;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPizzaName() {
        return PizzaName;
    }

    public void setPizzaName(String PizzaName) {
        this.PizzaName = PizzaName;
    }

    public String getDeliveryMode() {
        return deliveryMode;
    }

    public void setDeliveryMode(String deliveryMode) {
        this.deliveryMode = deliveryMode;
    }

   
    
    
}
