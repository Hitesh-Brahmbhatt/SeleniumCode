package PackageName;

public class SecondLargestNumber {

	public static void main(String[] args) {
		System.out.println(secondLarge(new int[]{45,25,68,12,98,71,20}));	
	}
	
	static int secondLarge(int[] input){
		 
	    int FirstLargest,SecondLargest;
		 
		if(input[0]>input[1]){
			FirstLargest = input[0];
			SecondLargest=input[1];
		}
		else{
			FirstLargest = input[1];
			SecondLargest=input[0];
		}
		
		for(int i=2;i<input.length;i++){
			if(input[i]>FirstLargest){
				SecondLargest=FirstLargest;
				FirstLargest=input[i];
			}else if(input[i]>SecondLargest && input[i]<FirstLargest){
			    SecondLargest = input[i];
			}
		}
		
		return SecondLargest;
	}

}
