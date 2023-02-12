import java.util.Scanner;

public class AddSum {

	public static int addsum(int a, int b) {

		int result = a + b;

		return result;
	}

	 public static void main(String[] args) {
		 
		 int a;
		 int b;
		 Scanner in = new Scanner(System.in);
		 System.out.println("Lets do some addition.");
		 System.out.print("Enter a number: ");
		 a = in.nextInt();
		 System.out.print("Enter a second number: ");
		 b = in.nextInt();
		 System.out.printf("The answer is: %d\n", addsum(a, b));
	 }
}
/*
pi@raspberrypi:~/Code_folder/java/thinkjava/ch4 $ java AddSum 
Lets do some addition.
Enter a number: 9
Enter a second number: 5
The answer is: 14
pi@raspberrypi:~/Code_folder/java/thinkjava/ch4 $
*/
