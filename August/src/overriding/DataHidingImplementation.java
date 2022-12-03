package overriding;


class DataHiding{
	
	private int a=45;
	
	//I want outside world can only read the data
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a=a;
	}
}

public class DataHidingImplementation {

	public static void main(String[] args) {
	DataHiding obj=new DataHiding();
	System.out.println(obj.getA());

	}

}
