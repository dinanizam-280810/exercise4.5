
package main7;


public class Main7 {

   
    public static void main(String[] args) {
    durian r = new durian("Durian",120,6.00);
		System.out.println(r);//print using overriding method
		System.out.println();
		
		mango m = new mango("Mango",110,3.50) {

     
    
		System.out.println(m);//print using overriding method
                }
		System.out.println();
		
		apple a = new apple("Apple",200,1.80);
		System.out.println(a);//print using overriding method
		System.out.println();
                }
		
		RedApple pl = new RedApple("Pink Lady" , 300 ,1.80 , "Red" ,"Cripps Pink", "Western Australia" , "November to August" , 133.0);
		System.out.println(pl);//print using overriding method
		System.out.println();
		
		GreenApple gs = new GreenApple("Granny Smith" , 300 , "Green" , 1.54 , "No retail name" , "US" , "beginning in August and are available year round" , 128.0);
		System.out.println(gs);//print using overriding method
		System.out.println();
		
		
		System.out.println("------------------------Thankyou-----------------------");
		
		}
    }
    
}
