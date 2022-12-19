package Day9;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		AddressBook ad = new AddressBook();
		System.out.println("Welcome to Address Book");
		int ch;
		while(true) {
			System.out.println("1. Add a Contact");
			System.out.println("2. Display a Contact");
			System.out.println("3. Edit a Contact");
			System.out.println("4. Delete a Contact");
			System.out.println("Enter 0 to exit");
			System.out.println("Select an OPtion from the menu");
			ch = sc.nextInt();
			switch (ch) {
				case 1: {
						ad.createContact();
						break;
				}
				case 2: {
					ad.display();
					break;
				}
				case 3: {
					System.out.println("Enter Contact's Email to Edit Contact");
					String email = sc.next();
					ad.editContact(email);
					break;
				}
				case 4: {
					System.out.println("Enter Contact's Email to Delete Contact");
					String email = sc.next();
					ad.deleteContact(email);
					break;
				}
				case 0: {
					return;
				}
				default :{
					System.out.println("Select Options Which are given in the list");
				}
			}
		
		}
	
	}

}
