package shop;

class Apple extends Fruit {

    public static final String TYPE = "Jabłkowaty";
    private String vatiety;

    public Apple(double weight, String vatiety) {
        super(weight, TYPE);
        this.vatiety = vatiety;
    }

    @Override
    public String getInfo() {
      return super.getInfo() + "odmiana: " + vatiety;
   }
}