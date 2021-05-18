
package main7;


public abstract class greenapple extends fruit{
    private String retailname, placeProduce,seasons;
	private double weight;

    public greenapple(String n, double w) {
        super(n, w);
    }
	public greenapple(String n,String pp,String s) {
		
		this.retailname = n;
		this.placeProduce = pp;
		this.seasons = s;
		
	}
	
	public String retailname(){
		return retailname;
	}
	
	public String placeProduce(){
		return placeProduce;
	}
	
	public String seasons(){
		return seasons;
	}
	
	
	
	
	
    @Override
	public String toString() { //overriding method-dif classes
		return "\nApple name      :" + super.name +
			  "\n" +
			  "\nRetail name     :" + this.retailname +
		      "\nProduce in      :" + this.placeProduce +
		      "\nSeasons Harvest :" + this.seasons;
		
	}
}
