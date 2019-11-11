package PackageName;

public class Leader {

	public static void main(String[] args) {
		leaderElement(new int[]{20,55,91,74,10,59,83,2});
	}
	
	static void leaderElement(int[] input){
		int max;
		
		max=input[input.length-1];
		
		for(int i=input.length-2;i>=0;i--){
			if(input[i]>max){
				System.out.println(input[i]);
				max=input[i];
			}
		}
	
	}

}
