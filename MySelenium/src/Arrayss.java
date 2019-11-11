import java.util.Scanner;
public class Arrayss {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		System.out.println("Enter Size of Array ");
		int n= scann.nextInt();
		int Marks[]= new int[n];//Initializing Array with Size
		System.out.println("Array Length is "+ Marks.length);
			System.out.println("Enter" +n+ "Elements");
			for(int i=0;i<Marks.length;i++){
			Marks[i]=scann.nextInt();
		}
			int Total=0;
			System.out.println("Elements are ");
			for(int i=0;i<Marks.length;i++){
			System.out.println(Marks[i]);
			Total = Total+Marks[i];
		}
		System.out.println("Total of Elements is "+Total);	
			}
	}

