import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;


public class Inputs_Outputs {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input number");
		int No = sc.nextInt();
		System.out.println(No*5);
		
		/*InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
	
		String input="";
		System.out.println("Please enter the input number");
		input=br.readLine();
		int number=Integer.parseInt(input);
		System.out.println((number*5));*/
	
		
		/*String FirstNumber="";
		String SecondNumber="";
		
		
			int Num1;
		int Num2;
		
		
		
		System.out.println("Please enter the First input number");
		FirstNumber=br.readLine();
		System.out.println("Please enter the Second input number");
		SecondNumber=br.readLine();
		int number1=Integer.parseInt(FirstNumber);
		int number2=Integer.parseInt(SecondNumber);
		System.out.println((number1*number2));	*/	
	}
}
