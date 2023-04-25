
		/*
		 * author: Sebastian Hilarski
		 */

public class MainClass {
		
	public static void main(String[] args) {
		//System.out.println("Hello World");
		
		//MainFrame myFrame = new MainFrame();
		//myFrame.initialize();
		
		/*
		 * Print out even numbers from 1 to 100
		 */
		System.out.println("Print out even numbers from 1 to 100");
		for(int i = 1; i <= 100; i++ ){
			if (i % 2 == 0)
				System.out.print(i + " ");
			
		}
		System.out.println();
		/*
		 * Print out odd numbers from 1 to 100
		 */
		System.out.println("Print out odd numbers from 1 to 100");
		for(int i = 1; i <= 100; i++ ){
			if (i % 2 != 0)
				System.out.print(i + " ");
			
		}
		System.out.println();
		/*
		 * Print out even numbers from 100 to 1
		 */
		System.out.println("Print out even numbers from 100 to 1");
		for(int i = 100; i >= 1; i-- ){
			if (i % 2 == 0)
				System.out.print(i + " ");
			
		}
		System.out.println();

		/*
		 * Print out odd numbers from 100 to 1
		 */
		System.out.println("Print out odd numbers from 100 to 1");
		for(int i = 100; i >= 1; i-- ){
			if (i % 2 != 0)
				System.out.print(i + " ");
			
		}
		
	}
}
