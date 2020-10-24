package assignments.NestedForLoop_6;

public class Question4 {

	public static void main(String[] args) {

		for (int row = 1; row <= 6; row++) {
			
			for (int col = 1; col <= row; col++) {
				if(col%2==1) {
					System.out.print(1);
				}else {
					System.out.print(0);
				}
			}
			System.out.println();
		
		 }
		
		

	}

}
