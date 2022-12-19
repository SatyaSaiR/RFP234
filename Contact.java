package Day9;

public class Contact {

	
		public String firstName;
		public String lastName;
		public String address;
		public String state;
		public String city;
		public String zip;
		public String phoneNumber;
		public String email;
		
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
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getZip() {
			return zip;
		}
		public void setZip(String zip) {
			this.zip = zip;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Contact(String firstName, String lastName, String address, String state, String city, String zip,
				String phoneNumber, String email) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			this.state = state;
			this.city = city;
			this.zip = zip;
			this.phoneNumber = phoneNumber;
			this.email = email;
		}
		
		public String printContact() {
			return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", state="
					+ state + ", city=" + city + ", zip=" + zip + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
		}
		
		
	
	}


