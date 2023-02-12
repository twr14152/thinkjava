import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		
		int inch;
		double feet;
		double cm;
		final double CONV_VAR = 2.54;

		Scanner in = new Scanner(System.in);
		System.out.print("How many inches? ");
		inch = in.nextInt();
		
		cm = inch * CONV_VAR;
	        
	        System.out.printf("%d in = %.2f cm\n", inch, cm);	
		//System.out.print(inch + " in = ");
		//System.out.println(cm + " cm");
		System.out.println("Lets convert feet to inches.");
		System.out.print("Enter the number of feet to convert: ");
		//Scanner in = new Scanner(System.in);
		feet = in.nextDouble();
		final double FEET_TO_INCH = 12.0;
		System.out.printf("%.2f feet is equal to %.2f inches and is equal to %.2f cm\n", feet, (feet * FEET_TO_INCH), ((feet * FEET_TO_INCH) * CONV_VAR));





	}
}
