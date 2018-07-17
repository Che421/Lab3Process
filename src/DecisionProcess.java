import java.util.Scanner;

public class DecisionProcess {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String answer1;

		do {
			System.out.println("Please enter a number 1 and 100");

			int userNum = input.nextInt();

			if (userNum % 2 == 1 && userNum <= 60) {
				System.out.println("Odd");
				
			} else if (userNum % 2 == 0 && userNum >= 2 && userNum <= 25) {
				System.out.println("Even and less than 25");

			} else if (userNum % 2 == 0 && userNum  >= 26 && userNum <= 60) {
				System.out.println("Even and between 26 and 60");
											
			} else if (userNum % 2 == 0 && userNum > 60) {
				System.out.println("Even");

			} else if (userNum % 1 == 0 && userNum % 2 > 60) {
				System.out.println("Odd and over 60");
				
			} else {
				System.out.println("Bye");
			}
			System.out.println("Continue Yes or No");
			answer1 = input.next();
		} while (answer1.equalsIgnoreCase("Yes"));
	}

}
