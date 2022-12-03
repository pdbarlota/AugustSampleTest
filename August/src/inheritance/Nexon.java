package inheritance;

class Tata {
	
	int price;

	public Tata(int i){
		System.out.println("I am a parent parameter");
	}
	
	public Tata(int i, int j){
		System.out.println("I am a parent parameter");
	}
	
	
	//instance method 
	public void speed() {
			System.out.println("max speed 1200");
	}
	
	public void color() {
		System.out.println("most sell car color is white");
	}
	
}

public class Nexon extends Tata {

	int price;
	
	public Nexon(){
	   super(1);
		this.price=45;
		System.out.println("I am most secure car of the year");
	}

	//parameterised constructor
	public Nexon(int i){
	    this();
		System.out.println("I am in parameterized constructor");
	}
	
	//instance method 
	public void fourwheeler() {
		speed();
		System.out.println("four wheeler");
		
	}
	
	public void price(int price) {
		System.out.println("price of car" + price);
	}
	
	//instance method 
	public void speed() {
		System.out.println("max speed 120");
	}
	
	public static void main(String[] args) {
		Nexon car=new Nexon(1);
		/*car.fourwheeler();
		car.price(10);*/
	}
}

