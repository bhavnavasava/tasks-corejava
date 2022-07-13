package task11To22.task11;

import java.util.Scanner;


public class Insurance {
	String   place, health, gender;
	int age, insurance;

	public void person() {

	}

	public void input() {
		Scanner sc = new Scanner(System.in);

		System.out.println("your health is excellent or poor?(excellnt or poor)");
		health = sc.next();
		System.out.println("enter your age"); 
		age = sc.nextInt();
		System.out.println("where you live? (city or village)");
		place=sc.next();
		System.out.println("enter your gender (male or female)" );
		gender = sc.next();

	}

	public void display() {
		if (health.equals("excellent") && age >= 27 && age <= 35 && place.equals("city") && gender.equals("male")) {
			System.out.println("your insurance is rs. 4 per thousand");

		} else if (health.equals("excellent") && age >= 27 && age <= 35 && place.equals("city") && gender.equals("female")) {
			System.out.println("your insurance is rs. 3 per thousand");

		} else if (health.equals("poor") && age >= 27 && age <= 35 && place.equals("village") && gender.equals("male")) {
			System.out.println("your insurance is rs. 6 per thousand");
		} else {
			System.out.println("not eligible for insurance");
		}

	}

	public static void main(String[] args) {

		Insurance i = new Insurance();
		i.input();
		i.display();

	}

}
