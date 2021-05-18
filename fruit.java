package main7;

public abstract class fruit {

    final String name;
    private final double weight;

    public fruit(String n, double w) {
        name = n;
        weight = w;
    }

    public String getname() {
        return name;
    }

    public double getweight() {
        return weight;
    }

    @Override
    public String toString() {
        return ("Name: " + name + "\n" + "weight: " + weight);
    }

    public abstract double totalprice();
}
