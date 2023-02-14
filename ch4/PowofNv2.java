import java.util.Scanner;

public class PowofNv2 {

	public static double powofn(double a, double b) {

		double result = Math.pow(a,b);

		return result;
	}

	 public static void main(String[] args) {
		 
		 double a;
		 double b;
		 double answer;
		 Scanner in = new Scanner(System.in);
		 System.out.println("Lets do some addition.");
		 System.out.print("Enter a number: ");
		 a = in.nextInt();
		 System.out.print("Enter a second number: ");
		 b = in.nextInt();
		 answer = powofn(a,b);
		 System.out.printf("The answer is: %.1f\n", answer);
	 }
}
/*
pi@raspberrypi:~/Code_folder/java/thinkjava/ch4 $ java PowofNv2 
Lets do some addition.
Enter a number: 5
Enter a second number: 3
The answer is: 125.0
pi@raspberrypi:~/Code_folder/java/thinkjava/ch4 $ 
*/
