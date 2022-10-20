package hashmapmvc;

import java.util.Iterator;

public class Userview {

	public static void printer(String emails)
	{
	      Usermodel o=(Usercontroller.m).get(emails);
		System.out.println("\nName: "+o.getname()+"\nDetails:\n");
		System.out.println("Id: "+o.getid());
		System.out.println("Age: "+o.getage());
		System.out.println("Gender: "+o.getgender());
		System.out.println("City: "+o.getcity()+"\n");
	}
	
	public void display(int choice)
	{
		Usermodel obj=(Usercontroller.m).get(Usercontroller.email1);
		switch(choice)
		{
		case 1:
			System.out.println("Your id: "+obj.getid());
			break;
		case 2:
			System.out.println("Your name: "+obj.getname());
			break;
		case 3:
			System.out.println("Your age: "+obj.getage());
			break;
		case 4:
			System.out.println("Gender: "+obj.getgender());
			break;
		case 5:
			System.out.println("Your city: "+obj.getcity());
			break;
		default:
			System.out.print("Enter values 1-5");
			break;
		}
	}
	public void displayall()
	{
		Iterator <String> it =(Usercontroller.m).keySet().iterator();      
		while(it.hasNext())  
		{  
		String key=it.next();  
		System.out.println("Username: "+key);
		printer(key);
		}  
	}
}
