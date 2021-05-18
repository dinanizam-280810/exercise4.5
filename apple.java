package main7;

import main7.applediscount.duriandiscount;



public class apple extends fruit {

    private final double quantity;
    protected double price;

    public apple(String n, double w, double a, double b) {
        super(n, w);
        this.quantity = a;
        this.price = b;
        if (a <= 7) {
            totalprice();//overloading with no arguments 
            System.out.printf("\nTotal price  : RM%.2f", totalprice());
        } else if (a > 7 && a <= 100) {
            double c = 1.0; // c is price
            totalprice(c);//overloading with 1 arguments
            System.out.printf("\nIf quantity more than 20.Total price  : RM%.2f", totalprice(c));
        } else {//have discount if more than 100 , price will have changes
            double c;
            double discount = 0;

            if (n == "green apple" || n == "apple") {
                c = 0.80;
                applediscount d = new applediscount();//create new object for Apple discount

                System.out.println("Discount provided : " + (d.rateofdiscount() * 100) + " %.\n");
                discount = d.rateofdiscount();
                System.out.println(n);

            } else if (name == "durian") {
                c= 7.00;
                getdiscount d = new duriandiscount();//create new object for durian discount
               
                System.out.println(" Discount provided : " + (d.rateofdiscount() * 100) + " %.\n");
                discount = d.rateofdiscount();
                System.out.println(name);

            } else if (name == "Mango") {
               c= 5.00;
                getdiscount d = new mangodiscount();//create new object for Apple discount
               
                System.out.println(" Discount provided : " + (d.rateofdiscount() * 100) + " %.\n");
                discount = d.rateofdiscount();
                System.out.println(name);

         
                
            }

            totalprice(discount, c); //overloading with 2 arguments
            System.out.printf("If quantity MORE than 100, Total price: RM %.2f", totalprice(discount, c));
            System.out.println();

        }
        System.out.println();

    }

    apple(String apple, int i, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public double totalprice() {//overloading method
        return this.price * this.quantity;
    }

    public double totalprice(double c) {//overloading method
        return c * this.quantity;
    }

    public double totalprice(double discount, double c) {//overloading method
        return (c * this.quantity) * (1 - discount);
    }


    public String toString() { //overriding method-dif classes
        return "\nFruit name      :" + super.name
                + "\n" + "Weight \t\t:" + getweight();
    }
}


