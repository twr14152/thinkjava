import java.util.Scanner;

public class PowofN {
	

	public static void main(String[] args) {
		
		double a;
		double b;
		double answer;
	
		Scanner in = new Scanner(System.in);
		System.out.println("Whats a n to the power of n.");
		System.out.print("Enter a number: ");
		a = in.nextInt();
		System.out.print("Enter a second number: ");
		b = in.nextInt();
		answer = Math.pow(a,b);
		System.out.println("Answer: " + answer);

	}
}



/*
pi@raspberrypi:~/Code_folder/java/thinkjava/ch4 $ java PowofN 
Whats a n to the power of n.
Enter a number: 6
Enter a second number: 3
Answer: 216.0
pi@raspberrypi:~/Code_folder/java/thinkjava/ch4 $ 
*/
