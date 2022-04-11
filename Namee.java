
public class Namee {

	String name;
	int age;
	String ad;
	
	static String ra ; 
	
	// Constructor 
	public Namee (String n , int a , String aa) {
		this.name = n ;
		this.age = a ;
        this.ad = aa ;	
		// this.«”„ «·„ €Ì— „⁄‰∆  «ﬂœ  
	}
	
	public void Print() {
		System.out.println(name + " " + (age + "year") +" "  + ad);
	}
	public void Newage(int Na) {
		age = Na;
	}
	public static void r() {
		System.out.println(ra);
	}
	
}
