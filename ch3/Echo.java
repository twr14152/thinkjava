import java.util.Scanner;

public class Echo {

	public static void main(String[] args) {
		String line;
		Scanner in = new Scanner(System.in);

		System.out.print("Enter first name: ");
		line = in.nextLine();
		System.out.println("Your name is: " + line);

		System.out.print("What is your full name?: ");
		line = in.nextLine();
		System.out.println("Hello, " + line);
	}
}
