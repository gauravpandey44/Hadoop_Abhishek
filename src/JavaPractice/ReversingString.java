package JavaPractice;

public class ReversingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="I love my India";
		
		//char ch[]=new char[str.length()];
		for(int i=(str.length()-1);i>=0;i--) {
			 
		  System.out.print(str.charAt(i));	
		}
		
	}

}
