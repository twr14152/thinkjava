import java.util.Scanner;

public class ScanBugWA {

	public static void main(String[] args) {
	        int age;
		String name;

		Scanner in = new Scanner(System.in);

		System.out.print("Whats your age? ");
		age = in.nextInt();
		in.nextLine(); // you need this line to get the next string to print
		System.out.print("Whats your full name? ");
		name = in.nextLine();
		System.out.printf("Your name is %s and you are %d years old.\n", name, age);
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
