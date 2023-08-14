package practicenagp;

public class First {
	  //we have to explicitly define the integer type
	 int a = 5;
	//methods are block in our class 
	//below public is a access modifier (Pvt. default.protected)
	//methods - 10 lines of code so rather executing all the time 10 lines we directly call 
	public String getData()
	{
		System.out.println("i am a student");
		return "hello";
		
	}
	// object are the instances or reference of the classes
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // all execution come under java control directly come in this block
		//ln in println mean print  in new line 
		First fn = new First();//declaring an object 
		fn.getData();
		Second sn = new Second();// we have to make object of second class in this class to execute the method of second class
		sn.setdata();
		System.out.println(fn.a);
		System.out.print("hi World");
		System.out.print("Hello World");
		System.out.println("Abhishak khajuria  World");
		System.out.println("Abhishak khajuria  World");
		
		
	}
	private void a() {
		// TODO Auto-generated method stub
		
	}

}
