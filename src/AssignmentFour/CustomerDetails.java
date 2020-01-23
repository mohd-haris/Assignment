package assignmentFour;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.CallableStatement;

public class CustomerDetails {

	Connection con;
	PreparedStatement pre;
	Statement stat;
	ResultSet res;
	int id;
	String fname;
	String lname;
	String address;
	String email;
	public  CustomerDetails(){
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/customerdetails","harry","khuljasimsim");
            System.out.println("Database Connected....");
//            CallableStatement stat=(CallableStatement) con.prepareCall("create table customerslist (id int(11), "
//                    + "fname varchar(20),lname varchar(25), address varchar(100),email varchar(20))");
//            boolean result = stat.execute();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void insert()

	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Customer ID: ");
			id=sc.nextInt();
			System.out.println("Enter Customer First Name: ");
			fname=sc.next();
			System.out.println("Enter Customer Last Name: ");
			lname=sc.next();
			System.out.println("Enter Customer Address: ");
			address=sc.next();
			System.out.println("Enter Customer Email: ");
			email=sc.next();
			
			pre=con.prepareStatement("insert into customers values(?,?,?,?,?)");
			pre.setInt(1, id);
			pre.setString(2, fname);
			pre.setString(3, lname);
			pre.setString(4, address);
			pre.setString(5, email);
			int ra=pre.executeUpdate();
			if(ra>0)
				System.out.println("Customer's Details Committed..");
			else
				System.out.println("Customer's Details are Not Committed..");
			pre.close();
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void showdetails() {
		
		try {
			stat=con.createStatement();
			res=stat.executeQuery("select * from customersList");
			
			while(res.next()) {
				System.out.println("Customer's ID: "+res.getInt("id"));
				
				System.out.println("Customer's First name: "+res.getString("fname"));
				System.out.println("Customer's Last name: "+res.getString("lname"));
				System.out.println("Customer's address: "+res.getString("address"));
				System.out.println("Customer's email: "+res.getString("email"));
				

			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	public void deleteCustomerDetails() {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Customer's Id you want to delete:");
			id = sc.nextInt();
			pre = con.prepareStatement("delete from customerslist where customerid=?");
			pre.setInt(1, id);
			int ra = pre.executeUpdate();
			if (ra > 0)
				System.out.println("Record Deleted!");
			else
				System.out.println("Record has not Deleted!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void updateCustomerDetails() {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Customer Id:");
			id = sc.nextInt();
			System.out.println("Enter First Name:");
			fname = sc.next();
			System.out.println("Enter Last Name:");
			lname = sc.next();
			System.out.println("Enter Email:");
			email = sc.next();
			System.out.println("Enter Address:");
			address = sc.next();
			pre = con.prepareStatement("Update customers set fname=?,lname=?,email=?,address=?  where customerid=?");
			
			pre.setString(1, fname); 
			pre.setString(2, lname);
			pre.setString(3, email); 
			pre.setString(4, address); 
			pre.setInt(5, id);
			int ra = pre.executeUpdate();
			if (ra > 0)
				System.out.println("Name updated");
			else
				System.out.println("Name is not updated..");
			pre.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner sc = new Scanner(System.in);
		CustomerDetails customers = new CustomerDetails();

		while (true) {
			System.out.println(
					"Enter your choice(1-5):\n1.Insert Cutomer\n2.Update Customer\n3.Delete Customer\n4.Print Customer\n5.Exit Application");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				customers.insert();
				break;
			case 2:
				customers.updateCustomerDetails();
				break;
			case 3:
				customers.deleteCustomerDetails();
				break;
			case 4:
				customers.showdetails();
				break;
			case 5:
				System.out.println("Exiting now!");
				System.exit(0);
				break;
			default:
				System.out.println("Enter a valid choice");

			}}
	}

}
