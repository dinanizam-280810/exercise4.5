package main7;

public abstract class mango extends fruit {

    private String size;
    private int weight;

    public mango(String name, String s, int w) {
        super(n, w);
        this.size = s;
        this.weight = w;

        System.out.println("Mango constructor is invoked");
    }

    public String sizeMango() {
        return this.size;
    }

    public int weightMango() {
        return this.weight;
    }
}
