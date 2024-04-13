package mail_application;
import java.util.*;
public class EmailApp {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee firstname and lastname");
		String firstname=sc.nextLine();
		String lastname=sc.nextLine();
		Email em1=new Email(firstname,lastname);
		em1.showInfo();
		
		em1.setAlternateEmail(firstname.toLowerCase()+"."+lastname.toLowerCase()+"@xyz.com");
		System.out.println("ALTERNATE EMAIL : "+em1.getAlternateEmail());
		
		System.out.println("Do you want to change email capacity(Y/N)?");
		String response1=sc.nextLine();
		if(response1.equals("Y")||response1.equals("y")){
			System.out.println("Enter capacity");
			int capacity=sc.nextInt();
			em1.setMailBoxCapacity(capacity);
		}
		System.out.println("MAILBOX CAPACITY : "+em1.getMailBoxCapacity());
		
		System.out.println("Do you want to change password?");
		String response2=sc.nextLine();
		if(response2.equals("Y")||response2.equals("y")){
			System.out.println("Enter new password");
			String newPassword=sc.nextLine();
			em1.changePassword(newPassword);
			System.out.println("NEW PASSWORD : "+em1.getPassword());
		}
		else {
			System.out.println("PASSWORD : "+em1.getPassword());
		}
		
		
		
	}

}
