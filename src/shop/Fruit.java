package shop;

public class Fruit {
    private String type;
    private double weight;


    public Fruit(String type, double weight) {
        this.weight = weight;
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String GetInfo() {
        return "Waga: " + weight + ", " + "typ: " + type;
    }


}
