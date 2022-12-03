package Apartment1;

public class this_parameter {
	
	int percentage;
	int age;

	public static void main(String[] args) {
		
		this_parameter student1=new this_parameter();
		student1.SampleObject(70);
		this_parameter student2=new this_parameter();
		student2.SampleObject(80);
		
		System.out.println(student1.percentage); //o
		System.out.println(student2.percentage);

	}
	
	public static void main(int a) {
		
	}
	
	public void SampleObject(int p) { //p=70
		//this_parameter student3=new this_parameter();
		SetUpPercentage(p); //this.SetupPercentage(p);
		//this.SetupPercentage(70);
		//TO call instance method we need object
	}
	
	public void SetUpPercentage(int a) {//70
		percentage=a;  //student3.percentage=70
	}

}
