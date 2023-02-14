import java.util.Scanner;

public class CalcDist {

	public static double calcdist(double x1, double y1, double x2, double y2) {
		
		double dx = x2 - x1;
		double dy = y2 - y1;
		double de2 = (dx * dx) + (dy * dy);
		double result = Math.sqrt(de2);
		return result;
	}
	
	public static void main(String[] args) {
		 
		 double a1, a2;
		 double b1, b2;
		 double answer;
		 Scanner in = new Scanner(System.in);
		 System.out.println("Find the distance between a and b.");
		 System.out.print("Enter num for a1: ");
		 a1 = in.nextInt();
		 System.out.print("Enter num for a2: ");
		 a2 = in.nextInt();
		 System.out.print("Enter num for b1: ");
		 b1 = in.nextInt();
		 System.out.print("Enter num for b2: ");
		 b2 = in.nextInt();
		 answer = calcdist(a1, b1, a2, b2);
		 System.out.printf("The answer is: %.1f\n", answer);
	 }
}
/*
pi@raspberrypi:~/Code_folder/java/thinkjava/ch4 $ java CalcDist 
Find the distance between a and b.
Enter num for a1: 5
Enter num for a2: 15
Enter num for b1: 3
Enter num for b2: 18
The answer is: 18.0
pi@raspberrypi:~/Code_folder/java/thinkjava/ch4 $ 
*/
