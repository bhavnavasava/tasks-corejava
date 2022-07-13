package task1To10.task3;

import java.util.Scanner;

public class Levis {
	String name;
	 int price;
	 int category;
	 double tax;
	 double amount;
	 String s;

	 void input() {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Select a Category you want");
	  System.out.println("1) Men");
	  System.out.println("2) Female");
	  System.out.println("3) Student");
	  category = sc.nextInt();
	  System.out.println(" Enter name and Price of Task3 you Want");
	  name = sc.next();
	  price = sc.nextInt();
	 }
	 void print() {
	  System.out.println(name + "\t" + price + "\t"+s+"\t"+tax+"\t"+amount);
	 }
	 Levis() {
	  input();
	  if(category == 1) {
	   tax = price * 0.15;
	   s = "Men";
	  }else if(category==2) {
	   tax = price * 0.10;
	   s = "Female";
	  }else {
	   tax = price * 0.5;
	   s = "Student";
	  }
	  System.out.println("---> " + tax);
	  amount = price + tax;
	 }

	 public static void main(String[] args) {
	  Levis L1 = new Levis();
	  L1.print();
	  }

}
