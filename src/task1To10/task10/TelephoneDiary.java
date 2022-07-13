package task1To10.task10;

import java.util.Scanner;

public class TelephoneDiary {
	String firstName;
	String lastName;
	long mobileNo;
	private static void EditContact(TelephoneDiary[] u) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.println("Enter the FirstName you want to Edit");
		String s = sc.next();
		for(int i=0;i<u.length;i++) {
			if(u[i]!=null) {
					if(u[i].firstName.equals(s)){
				count++;
					}
		}
	}
		if(count==1) {
			for(int i=0;i<u.length;i++) {
				if(u[i]!=null) {
				if(u[i].firstName.equals(s)){
					System.out.println("1)FirstName");
					System.out.println("2)LastName");
					System.out.println("3)MobileNo");
					System.out.println("Choose which value you want to edit");
					int key = sc.nextInt();
					switch(key) {
					case 1: System.out.println("Enter New Firstname");
					String s1= sc.next();
					u[i].setFirstName(s1);
					break;
					case 2: System.out.println("Enter New Lastname");
					String s2= sc.next();
					u[i].setLastName(s2);
					break;
					case 3: System.out.println("Enter New MobileNumber");
					long s3= sc.nextLong();
					u[i].setMobileNo(s3);
					default : System.out.println("Enter valid choice");
					}
				}}
				}
		}else {
			for(int i=0;i<u.length;i++) {
				if(u[i]!=null) {
						if(u[i].firstName.equals(s)) {
					System.out.println(i+" "+u[i].getFirstName()+" |"
							+u[i].getLastName()+" |"+u[i].getMobileNo()
						);
				}}
			}
			System.out.println("Enter the index Value you want to edit");
			int index=sc.nextInt();
			System.out.println("1)FirstName");
			System.out.println("2)LastName");
			System.out.println("3)MobileNo");
			System.out.println("Choose which value you want to edit");
			int key = sc.nextInt();
			switch(key) {
			case 1: System.out.println("Enter New Firstname");
			String s1= sc.next();
			u[index].setFirstName(s1);
			break;
			case 2: System.out.println("Enter New Lastname");
			String s2= sc.next();
			u[index].setLastName(s2);
			break;
			case 3: System.out.println("Enter New MobileNumber");
			long s3= sc.nextLong();
			u[index].setMobileNo(s3);
			default : System.out.println("Enter valid choice");
			}
			}
	}
		
	private static void SearchContact(TelephoneDiary[] u) throws NullPointerException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the FirstName you want to Search number for");
		String s = sc.next();
		for(int i=0;i<u.length;i++) {
			if(u[i].firstName.equals(s)){
			System.out.println(u[i].getFirstName()+" |"
							+u[i].getLastName()+" |"+u[i].getMobileNo()
						);break;
			}else if(u[i]==null) {
				System.out.println("NotFound");
			}
		}
	}
	private static void DeleteContact(TelephoneDiary[] u) throws NullPointerException {
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.println("Enter the FirstName you want to delete");
		String s = sc.next();
		for(int i=0;i<u.length;i++) {
			if(u[i]!=null) {
					if(u[i].firstName.equals(s)){
				count++;
					}
		}
	}
		if(count==1) {
			for(int i=0;i<u.length;i++) {
				if(u[i]!=null) {
				if(u[i].firstName.equals(s)){
					u[i]=u[i+1];
				}}
				}
		}else {
			for(int i=0;i<u.length;i++) {
				if(u[i]!=null) {
						if(u[i].firstName.equals(s)) {
					System.out.println(i+" "+u[i].getFirstName()+" |"
							+u[i].getLastName()+" |"+u[i].getMobileNo()
						);
				}}
			}
			System.out.println("Enter the index of value you want to delete");
			int key = sc.nextInt();
			for(int i=key;i<u.length;i++) {
				if(u[i]!=null) {
				u[i]=u[i+1];
			}}
		} 
	}
	public static void AddContact(TelephoneDiary[] u) throws NullPointerException {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++){
			if(u[i]==null){
			u[i] = new TelephoneDiary();
			System.out.println("Enter FirstName");
			String s = sc.next();
			u[i].setFirstName(s);
			System.out.println("Enter LastName");
			String s1 = sc.next();
			u[i].setLastName(s1);
			System.out.println("Enter MobileNo");
			long n = sc.nextLong();
			u[i].setMobileNo(n);
			break;
			}
			}
			}
	public static void  Display(TelephoneDiary[] u) throws NullPointerException {
			for(int i=0;i<u.length;i++) {
				if(u[i]!=null) {System.out.println(i+" "+u[i].getFirstName()+" |"
						+u[i].getLastName()+" |"+u[i].getMobileNo()
					);
			}}
	}
	public static  void Menu() {
		TelephoneDiary[] u = new TelephoneDiary[10];
		byte choice ,flag=1;
		Scanner sc = new Scanner(System.in);
		while(flag!=0){
			System.out.println("======================================================");
			System.out.println("1)Add New Contact");
			System.out.println("2)Edit Contact");
			System.out.println("3)Search Contact");
			System.out.println("4)Delete Contact");
			System.out.println("5)Display");
			System.out.println("6)Exit from App");
			System.out.println("======================================================");
			System.out.println("Enter your Choice");
			choice = sc.nextByte();
			switch(choice) {
			case 1: AddContact(u);
			break;
			case 2: EditContact(u);
			break;
			case 3: SearchContact(u);
			break;
			case 4: DeleteContact(u);
			break;
			case 5: Display(u);
			break;
			case 6: flag=0;
			default: System.out.println("Enter valid Choice");
			}
			}
	}
	
public static void main(String[] args) {
	Menu();
	System.out.println("App Closed");
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
	
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public long getMobileNo() {
	return mobileNo;
}
public void setMobileNo(long n) {
	this.mobileNo = n;
}

}
