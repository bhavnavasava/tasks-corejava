package task11To22.task14;

import java.util.ArrayList;
import java.util.Scanner;


public class BankApp {
	static String Name;
	static String name, pass;
	static String Password;
	static long Money;
	static int AcNumber;

	public int getAcNumber() {
		return AcNumber;
	}

	public void setAcNumber(int acNumber) {
		AcNumber = acNumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public long getMoney() {
		return Money;
	}

	public void setMoney(long money) {
		Money = money;
	}

	public String toString() {
		return Name;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<BankApp> bankapp = new ArrayList<>();
		while (true) {
			BankApp bank = new BankApp();
			System.out.println("1---Create account");
			System.out.println("2----Deposite");
			System.out.println("3----Check balance");
			System.out.println("4----Withdraw");
			System.out.println("5----exit");

			System.out.println("enter your choice");
			switch (sc.nextInt()) {
			case 1: {
				System.out.println("enter your name");
				bank.setName(sc.next());
				System.out.println("enter password");
				bank.setPassword(sc.next());

				while (true) {
					System.out.println("enter money you want to deposite");
					long j = sc.nextLong();
					if (j < 5000) {
						System.out.println("please enter money more than 5000");

					} else {
						bank.setMoney(sc.nextLong());
						break;
					}
				}

				int ac = (int) (Math.random() * 1000);
				bank.setAcNumber(sc.nextInt());
			}

				bankapp.add(bank);
				System.out.println(bank);
				break;

			case 2:
				System.out.println("DEPOSITE");
				System.out.println("enter your name");
				name = sc.next();
				System.out.println("enter password");
				pass = sc.next();
				for (int j = 0; j < bankapp.size(); j++) {
					if (bankapp.get(j).getName().equals(name) && (bankapp.get(j).getPassword().equals(pass))) {

						while (true) {
							System.out.println("enter money you want to deposite");
							long i = sc.nextLong();
							if (i > 5000) {
								bank.setMoney(sc.nextLong());
							} else {
								System.out.println("please enter money more than 5000");
							}
							break;
						}

					}

				}

			case 3:
				System.out.println("CHECK BALANCE");
				System.out.println("enter name");
				name = sc.next();
				System.out.println("enter password");
				pass = sc.next();
				for (int j = 0; j < bankapp.size(); j++) {
					if (bankapp.get(j).getName().equals(name) && bankapp.get(j).getPassword().equals(pass)) {
						System.out.println(bankapp);
					} else {
						System.out.println("something went wrong in check balance");
					}

				}
				break;

			case 4:
				System.out.println("You are on Wid section");
				System.out.println("Enter Name:");
				name = sc.next();
				System.out.println("Enter Password:");
				pass = sc.next();
				for (int j = 0; j < bankapp.size(); j++) {
					if (bankapp.get(j).getName().equals(Name) && bankapp.get(j).getPassword().equals(Password)) {

						while (true) {
							System.out.println("Enter how many money you can wid...");
							Money = sc.nextInt();
							Money = (int) (bankapp.get(j).getMoney() - Money);
							if (Money < 5000) {
								System.out.println("Minimum Balance 5000!!!!!!!!!");
							} else {
								bankapp.get(j).setMoney(Money);
								break;
							}
						}

					}
				}
				break;
			case 5: System.exit(0);

			default:
				throw new IllegalArgumentException("Unexpected value: ");
			}

		}

	}

}
