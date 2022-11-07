import java.util.Scanner;

public class Function {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter first number: ");
		int a = scanner.nextInt();
		System.out.print("Please enter second number: ");
		int b = scanner.nextInt();

		for (int i = a; i <= b; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}

		}

	}

}
