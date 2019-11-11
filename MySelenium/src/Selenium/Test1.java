package Selenium;

public class Test1 {
	
	/*static Test3 t3= new Test3();
	static Test2 t2= new Test2();*/
	

	public static void main(String[] args) {
		
		Test3 t3= new Test3();
		//Test2 t2= new Test2();
		
	
		
		System.out.println("I am in Main Method");

		Seleniumtest();
		t3.testme();
		t3.printme();
		Test2.callingtest();
		System.out.println(" I am in After Main Method");
		
	}
	
	public static void Seleniumtest(){
		System.out.println(" I am in Seleniumtest Method");
	}

}
