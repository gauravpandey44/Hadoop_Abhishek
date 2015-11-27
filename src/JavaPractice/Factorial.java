package JavaPractice;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=4;
		long factorial=1;
		for(int i=number;i>=1;i--) {
			
			factorial=factorial*i;
		}
		System.out.println("\n Factorial of a given number "+number+" is "+factorial);
		
	}

}
