package Apartment2;

public class for_loop {
	
	public static int p;

	public static void main(String[] args) {
	
		int a=sum(1, sum(0,1));
		System.out.println(a);
		
		//int sum(int x,int b){
		
		
		
		// it is not mandatory to write initilization,condition or increment
		//condition is true
		/*for(;;) {
			System.out.println("infinite loop");
		}*/
		
		//Case -2 you can declare variable outside for loop
		/*int i; //declare the variable outside for loop 
		
		for(i=1;i<=50;i++) {
			System.out.println("value of i "+ i);
		}*/
		
		//Case -3 you can declare variable outside for loop but initilization mandatory
		//int i=50; //declare the variable outside for loop 
		for(for_loop.p=1;for_loop.p<=50;++for_loop.p) {
					System.out.println("value of for_loop.p "+ for_loop.p);
		}
		
		//Iteration 1 --> 
			//intilization p=1
			//conditon 1<=50
		    //if condition is true it will run for loop 
		   // it will increment the value p=2
		
		//interation 2 -->
		   //condition 2<=50
		  // for loop 
		  //p increment by p=3
		
		//iteration 3-->
			//condition 3<=50
		   // for loop execution
		  // increment 
		
		
		
		//case 4 : prefix /postfix doesn't work 
		
		//i want to print the value from 100 to 1 
		 //starting point is 100
		//condition till value is great or equal 1
		//decrement by 1
		
		for(int j=100;j>=0;--j) {
				System.out.print("value of j" +j);
		}
		

		
	}
	

	//return statement execution is mandatory 
	public static int sum(int x,int b){
		if(x+b>10) {
			return 0;
		}
		System.out.println(x+b) ;
		return x+b;
		//return 1;
		}

}
