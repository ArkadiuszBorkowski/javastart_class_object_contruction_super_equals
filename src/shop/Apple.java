package shop;

public class Apple extends Fruit {

    public static final String TYPE = "jabłkowate";
    private String variety;

    public Apple(double weight, String variety) {
        super(TYPE, weight);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override
    public String GetInfo() {
        return super.GetInfo() + ", odmiana: " + variety;
    }
}
