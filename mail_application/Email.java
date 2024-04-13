package mail_application;
import java.util.*;
public class Email {
	
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private String email;
	private String alternateEmail;
	private String companySuffix="xyz.com";
	private int mailboxCapacity=500;
	private int defaultPasswordLength=10;
	
	public Email(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		//System.out.println("Email created : "+this.firstname+" "+this.lastname);
		
		this.department=setDepartment();
		//System.out.println(this.department);
		
		this.password=randomPassword(defaultPasswordLength);
		//System.out.println("Password is : "+this.password);
		
		email=firstname.toLowerCase()+"."+lastname.toLowerCase()+"@"+department+"."+companySuffix;
		//System.out.println("Email is : "+email);
	}
	
	private String setDepartment() {
		System.out.println("Enter department code\n1: Sales\n2: Development\n3: Accounting\n");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice) {
		case 1: return "Sales";
		case 2: return "Development";
		case 3: return "Accounting";
		default: return "Staff";
				
		}
	}
	
	private String randomPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890.#$%&*";
		char password[]=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	public void setMailBoxCapacity(int capacity) {
		this.mailboxCapacity=capacity;
	}
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail=altEmail;
	}
	
	public void changePassword(String password) {
		this.password=password;
	}
	
	public int getMailBoxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword( ) {
		return password;
	}
	
	public void showInfo() {
		System.out.print("NAME : "+firstname+" "+lastname+"\n"
						+ "DEPARTMENT : "+department+"\n"
						+ "COMPANY EMAIL : "+email+"\n"
						+ "PASSWORD : "+password+"\n"
						
						);
		
	}

}
