package Day9;

	import java.util.ArrayList;
	import java.util.Scanner;

		public class AddressBook {
			ArrayList<Contact> contacts;

			public AddressBook() {
				contacts = new ArrayList<Contact>();
			}
			
			//Create Contact
			public void createContact() {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter FirstName : ");
				String fisrtName = sc.next();
				System.out.println("Enter lastName : ");
				String lastName = sc.next();
				System.out.println("Enter address : ");
				String address = sc.next();
				System.out.println("Enter state : ");
				String state = sc.next();
				System.out.println("Enter city : ");
				String city = sc.next();
				System.out.println("Enter zip : ");
				String zip = sc.next();
				System.out.println("Enter phoneNumber : ");
				String phoneNumber = sc.next();
				System.out.println("Enter email : ");
				String email = sc.next();
				Contact ct = new Contact(fisrtName, lastName, address, state, city, zip, phoneNumber, email);
				contacts.add(ct);
				System.out.println("Contact Inserted Successfully");
			}
			
			//display AddressBook
			public void display() {
				for(int i = 0; i<contacts.size(); i++) {
					System.out.println("First Name : " + contacts.get(i).getFirstName());
					System.out.println("Last Name : " + contacts.get(i).getLastName());
					System.out.println("Address : " + contacts.get(i).getAddress());
					System.out.println("State : " + contacts.get(i).getState());
					System.out.println("City : " + contacts.get(i).getCity());
					System.out.println("Zip: " + contacts.get(i).getZip());
					System.out.println("Email: " + contacts.get(i).getEmail());
					System.out.println("phone number : " + contacts.get(i).getPhoneNumber());
				}
			}
			
			
			//edit Contact
			public void editContact(String editEmail) {
				int index = 0;
				boolean found = false;
				for(int i = 0; i<contacts.size(); i++) {
					String email = contacts.get(i).getEmail();
					if(email.equals(editEmail)) {
						found = true;
						index = i;
					}
				}
				if(found) {
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter FirstName : ");
					String fisrtName = sc.next();
					System.out.println("Enter lastName : ");
					String lastName = sc.next();
					System.out.println("Enter address : ");
					String address = sc.next();
					System.out.println("Enter state : ");
					String state = sc.next();
					System.out.println("Enter city : ");
					String city = sc.next();
					System.out.println("Enter zip : ");
					String zip = sc.next();
					System.out.println("Enter phoneNumber : ");
					String phoneNumber = sc.next();
					System.out.println("Enter email : ");
					String email = sc.next();
					
					contacts.get(index).setFirstName(fisrtName);
					contacts.get(index).setLastName(lastName);
					contacts.get(index).setAddress(address);
					contacts.get(index).setEmail(email);
					contacts.get(index).setCity(city);
					contacts.get(index).setState(state);
					contacts.get(index).setPhoneNumber(phoneNumber);
					contacts.get(index).setZip(zip);
					
					System.out.println("Updates Successfully");
				}
			}
			
			//delete Contact
			public void deleteContact(String deleteEmail) {
				boolean deleted = false;
				for(int i = 0; i<contacts.size(); i++) {
					String email = contacts.get(i).getEmail();
					if(email.equals(deleteEmail)) {
						contacts.remove(i);
						deleted = true;
					}
				}
				if(deleted) {
					System.out.println("Deleted Successfully");
				}
				else {
					System.out.println("Email Not Found");
				}
			}
			
		}
