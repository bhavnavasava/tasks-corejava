package task11To22.task15;

import java.util.Scanner;

public class GoogleApi {
	public static void main(String[] args) {
		String email;

		try (Scanner snr = new Scanner(System.in)) {

			while (true) {
				System.out.println("Enter Email");

				try {
					email = snr.next();
					if (email.matches(".*[0-9].*") && email.endsWith("@gmail.com")) { // email.contains("[a-zA-Z]")&&
						System.out.println("Email is valid ");
						System.out.println("Email : " + email);
						System.exit(0);
					} else {

						throw new InvalidEmailException("Invalid Email");
					}
				} catch (InvalidEmailException e) {
					System.out.println(e);
				}
			}
		}
	}
}

class InvalidEmailException extends Exception {
	public InvalidEmailException(String s) {
		super(s);
	}

}
