package JavaPractice;

public class CheckingDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int array[]={10,20,30,40,20,99,35,30,20};
		boolean flag=false;
		for(int i=0;i<array.length;i++) {
			
			flag=false;
			
			for(int j=i+1;j<array.length;j++) {
				
				if(i!=j) {
				
					if(array[i]==array[j]) {
						
						flag=true;
						continue;
					}
					
				}
				
			}
			if(flag) {
				
				System.out.println("\n Duplicate element  "+array[i]+" found ");
			}
			
		}
		
		
		
	}

}
