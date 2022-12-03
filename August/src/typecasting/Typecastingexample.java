package typecasting;

public class Typecastingexample {

	//converting one data type into another data type
	
	int a=5; //int=int
	float b=10.25f;
	double c=a;
	//Double=int
	
	public static void main(String[] args) {
		Typecastingexample obj=new Typecastingexample();
		System.out.println(obj.c);
		obj.c=(double)obj.b; //homegenoue
		obj.c=(double)obj.a; //
		obj.a=(int)obj.b;//hetrogenoue(int) 10.25
		//0.5*10000000=500000
		//5-1000
		System.out.println(obj.a);
		

	}

}
