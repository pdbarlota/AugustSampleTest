package overriding;

public class SchoolRegistration {
	
	int rollno2;
	int rollno3;

	//variable declaration -accessmodifier nonaccess datatype identifier
	//array -accessmodifier nonaccess datatype[] identifier
	
	//static Array declaration 
	static int [] rollno;//[] we are going to hold multiple values 100*4
	public int [] c; //non-static array 
	public int[] d;
	public int []e;
	public int f[];
	//public [] int g;//wrong syntax
	
	//At max variable can hold single value
	//Array can hold multiple values 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arrayname=new <datatypeofArray> [size];
		rollno=new int[100];
		
		//access the value from array
		System.out.println("first value "+ rollno[0]);
		rollno[0]=100;
		System.out.println("first value "+ rollno[0]);
		
		SchoolRegistration obj=new SchoolRegistration();
		obj.c=new int[3];//size -how much value it is going to hold
		
		System.out.println(obj.e[0]);//if you try to access array without initlization we will get nullpointer
		

	}

}
