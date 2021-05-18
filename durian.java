
package main7;

public class durian extends apple {
    private char thorns;
	protected int calories;
	
		
	
	public durian( char t,int c, int q, ) {
		
		this.thorns = t;
		this.calories = c;
		System.out.println("Durian constructor is invoked");
		
	}

    durian(String durian, int i, double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	public char HasThorns() {
		return 'y';
	}
	
	public int calories() {
		return this.calories;
	}
}

