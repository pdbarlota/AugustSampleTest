package inheritance;


class grandparent{
	
	public grandparent() {
		System.out.println("I am in grandparent");
	}
	
}


class parent extends grandparent {
	
	public parent() {
		//super();
		System.out.println("I am in parent");
	}
	
	
}




public class son extends parent {
	
	public son() {
		//super();
		System.out.println("I am in son");
	}
	
	

	public static void main(String[] args) {
		
		son obj=new son();

	}

}
