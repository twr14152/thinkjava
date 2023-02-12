import java.util.Scanner;

public class ScanBugWA {

	public static void main(String[] args) {
	        int age;
		String name;

		Scanner in = new Scanner(System.in);

		System.out.print("Whats your age? ");
		age = in.nextInt();
    //Work-a-round
		in.nextLine(); // you need this line to get the next string to print after int type
    //
		System.out.print("Whats your full name? ");
		name = in.nextLine();
		System.out.printf("Your name is %s and you are %d years old.\n", name, age);
	}
}

