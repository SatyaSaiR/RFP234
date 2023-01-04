package Day19;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Registration {

	public static boolean isValidFirstName(String str) {

				Pattern ptrn = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
				Matcher match = ptrn.matcher(str);
				return match.matches();
			}

			public static boolean isValidLastName(String lastname) {

				Pattern ptrn = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
				Matcher match = ptrn.matcher(lastname);
				return match.matches();
			}

			public static boolean isValidEmail(String email) {
				Pattern ptrn = Pattern.compile("^[a-zA-Z0-9+_.]+@[a-zA-Z0-9.]+$");
				Matcher matcher = ptrn.matcher(email);
				return matcher.matches();
			}

			public static boolean isValidMobileNo(String number) {

				Pattern ptrn = Pattern.compile("(91)?[6-9][0-9]{9}");
				Matcher match = ptrn.matcher(number);
				return match.matches();
			}

			public static boolean isValidPassword(String password) {

				String regex = "^(?=\\S+$).{8,}$";
				Pattern pattern = Pattern.compile(regex);
				if (password == null) {
					return false;
				}
				Matcher m = pattern.matcher(password);
				return m.matches();
			}


			public static void main(String args[]) {

				System.out.println("Enter First Name");
				Scanner sc = new Scanner(System.in);
				String str = sc.next();
				if (isValidFirstName(str))
					System.out.println("It is a valid First Name.");
				else
					System.out.println("Entered Name Is Invalid.");
				System.out.println();

				System.out.println("Enter last name");
				Scanner s = new Scanner(System.in);
				String lastname = s.next();

				if (isValidLastName(lastname))
					System.out.println("it is valid last name");
				else
					System.out.println("Enter Name Is Invalid");
				System.out.println();

				System.out.println("Enter EmailId");
				Scanner sc1 = new Scanner(System.in);
				String email = sc1.next();
				if (isValidEmail(email)) {
					System.out.println("It is a valid EmailId.");
				} else {
					System.out.println("Entered EmailId Is Invalid.");
				}

				System.out.println("Enter Phone number");
				Scanner sc2 = new Scanner(System.in);
				String number = sc2.next();
				if (isValidMobileNo(str))
					System.out.println("It is a valid mobile number.");
				else
					System.out.println("Entered mobile number is invalid.");

				System.out.println("Enter PassWord");
				Scanner sc3 = new Scanner(System.in);
				String password = sc2.nextLine();
				if (isValidPassword(password))
					System.out.println("It is a valid mobile number.");
				else
					System.out.println("Entered mobile number is invalid.");


			}

}


