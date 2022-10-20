package hashmapmvc;

import java.util.HashMap;


import java.util.*;


public class Usercontroller {
	public static String zz="------".repeat(10);
	static String email;
	static String email1;
	HashMap<String,String> map=new HashMap<>();
	static HashMap<String,Usermodel> m=new HashMap<>();

	static Scanner s=new Scanner(System.in);
	public void controller()
	{
		 int choice=0;
	     System.out.println(zz+"WELCOME"+zz);
	     while(choice!=3) {
	     System.out.println("->Sign Up: Enter 1\n->Log in: Enter 2\n->Exit: Enter 3");
	     choice=s.nextInt();
	     System.out.println(zz);
	     switch(choice)
	     {
	     case 1:
	    	 signup();
	    	 detail();
	    	 break;
	     case 2:
	    	 boolean q=loguser();
	    	 if(q==false)
	    		 break;
	    	 break;
	     case 3:
	    	 System.out.println("\t\t\tTHANK YOU");
	    	 break;
	     default:
	    	 System.out.println("Please enter correct choice\n");
	     }
	     }
	}
	     
	     public void signup(){     //sign up user name
	    	 
	    	 System.out.println("Enter your email-id");
	    	 email=s.next();
	    	 boolean y=Validations.getuser(email);
	    	 while(y==false) {
	    		 System.out.println("Enter valid email-id");
	       	 email=s.next();
	    		 y=Validations.getuser(email);
	    	 }
	    	 
	    	 signpass(email);
	     }
	     public void signpass(String email) {    //sign up password
	    	 
	    	 System.out.println(zz+"\nEnter password");
	    	 String pass=s.next();
	    	 boolean y=Validations.getpass(pass);
	    	 while(y==false) {
	    		 System.out.println("Password should be of 8 characters with atleast one \n\t*uppercase alphabet\n\t*number\n\t*special character");
	    		 System.out.println("Enter valid password: ");
	    		 pass=s.next();
	    		 y=Validations.getpass(pass);
	    		 }
	    	 map.put(email,pass);
	    	 System.out.println(zz);
	     }
	     public static void detail()
	 	{
	 		System.out.println("Please fill your details...\n");
	 		int id1=0;
	 		String name1="";
	 		boolean y=false;
	 		System.out.print("Enter your id: ");
	 		s.nextLine();
	 		while(true) {
	 		String tid=s.nextLine();
	 		y=Validations.checkid(tid);
	 		if(y==true) {
	 			id1=Integer.parseInt(tid);
	 			break;
	 		}
	 		}
	 		System.out.print("Enter your Name: ");
	 		while(true) {
	 			name1=s.nextLine();
	 			y=Validations.checkname(name1);
	 			if(y==true) {
	 				break;
	 			}
	 		}
	 		System.out.print("Enter your age: ");
	 		int age1=0;
	 		while(true) {
	 		String tage=s.nextLine();
	 		y=Validations.checkid(tage);
	 		if(y==true) {
	 			age1=Integer.parseInt(tage);
	 			break;
	 		}
	 		}
	 		System.out.print("Enter your Gender:(m or f) ");
	 		char gender1=' ';
	 		while(true) {
	 		gender1=s.nextLine().charAt(0);
	 		if(gender1=='m' || gender1=='f') {
	 			break;
	 		}
	 		else {
	 			System.out.println("Enter either m or f!!");
	 		}
	 		}
	 		String city1="";
	 		System.out.print("Enter your City: ");
	 		while(true) {
	 			city1=s.nextLine();
	 			y=Validations.checkname(city1);
	 			if(y==true) {
	 				break;
	 			}
	 		}
	 		
	 		Usermodel ob=new Usermodel(id1,name1,age1,gender1,city1);
	 		m.put(email,ob);
	 		System.out.println("\t\tYou have filled your details successfully\n");
	 		System.out.println(zz);
	 	}
	     public boolean loguser()       //login user name
		 {
			 System.out.println("Enter your email-id");
			 email1=s.next();
			 boolean y=Validations.getuser(email1);
			 while(y==false) {
				 System.out.println("Enter valid email-id");
		   	     email1=s.next();
				 y=Validations.getuser(email1);
			 }
			 if(map.containsKey(email1)) {
				 logpass(email1);
			     return true;
			 }
			 else {
				 System.out.println("You haven't singed up yet\n"+zz);
				 return false;}
		 }
		 public void logpass(String email) {       //login password
			 System.out.println(zz+"\nEnter password");
			 String pass=s.next();
			 boolean y=Validations.getpass(pass);
			 while(y==false) {
				 System.out.println("Enter correct password");
				 pass=s.next();
				 y=Validations.getpass(pass);
				 }
			 if(pass.equals(map.get(email))) {
				 executeLogin();
			 }
			 else {
				 System.out.println("Password Mismatch\n"+zz);
			 }
			 }
		 public static void executeLogin() {
				
				int choice=0;
				while(choice!=5) {
				System.out.println("Display all details: Enter 1\nUpdate any detail: Enter 2\nDisplay a single detail: Enter 3\n"
						          +"Display every users along with details: Enter 4\nLog Out: Enter 5");
				choice=s.nextInt();
				Userview ob=new Userview();
				switch(choice)
				{
				case 1:
					Userview.printer(email1);
					System.out.println(zz);
					break;
				case 2:
					editor();
					System.out.println(zz);
					break;
				case 3:
					System.out.println("Hello!! What detail do you want to display?");
					System.out.println("\tDisplay id: Enter 1\n\tDisplay name: Enter 2\n\tDisplay age: Enter 3\n\tDisplay gender: Enter 4\n\tDisplay city: Enter 5");
					int ch=s.nextInt();
					ob.display(ch);
					System.out.println(zz);
					break;
				case 4:
					ob.displayall();
					System.out.println(zz);
					break;
				case 5:
					System.out.println(zz);
					break;
				default:
					System.out.println("Enter values 1-5");
				}
				}
			}
		 public static void editor()
			{
				Usermodel o=m.get(email1);
				System.out.println("Hello "+o.getname()+"!! What detail do you want to change?");
				System.out.println("\tEdit id: Enter 1\n\tEdit name: Enter 2\n\tEdit age: Enter 3\n\tEdit gender: Enter 4\n\tEdit city: Enter 5");
				int choice=s.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter new id: ");
					o.setid(s.nextInt());
					break;
				case 2:
					System.out.println("Enter new name: ");
					s.nextLine();
					o.setname(s.nextLine());
					break;
				case 3:
					System.out.println("Enter new age: ");
					o.setage(s.nextInt());
					break;
				case 4:
					System.out.println("Enter your gender: ");
					s.nextLine();
					o.setgender(s.nextLine().charAt(0));
					break;
				case 5:
					System.out.println("Enter new city: ");
					s.nextLine();
					o.setcity(s.nextLine());
					break;
				default:
					System.out.print("Enter values 1-5");
					break;	
				}
			}
}
