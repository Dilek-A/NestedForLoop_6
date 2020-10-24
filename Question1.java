package assignments.NestedForLoop_6;

public class Question1 {

	public static void main(String[] args) {
		
		int row=8;
		for(int i=0; i<=row-1; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+ " ");
			}
			System.out.println("");
			
		}
		for(int i=row-1; i>=1; i--) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}

	}

}
