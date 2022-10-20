package hashmapmvc;

import java.util.regex.Pattern;

public class Validations {

	public static boolean getuser(String email)
	{
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                "[a-zA-Z0-9_+&*-]+)*@" + 
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                "A-Z]{2,7}$"; 
                  
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) {
        	return false; }
        return pat.matcher(email).matches();
	}
	public static boolean getpass(String pass)
		{
			int x=0,y=0,z=0;
			char ch[]=pass.toCharArray();
			for(char i:ch)
			{
				if(Character.isLowerCase(i) || Character.isWhitespace(i))
					continue;
				else if(Character.isUpperCase(i))
					x+=1;
				else if(Character.isDigit(i))
					y+=1;
				else
					z+=1;
			}
			if(x>0 && y>0 && z>0 && ch.length>=8) {
				return true;
			}
			return false;
		}
	
	
	public static boolean checkid(String string) {
	    if(string == null || string.equals("")) {
	        System.out.println("Number is empty....");
	        return false;
	    }
	    
	    try {
	        Integer.parseInt(string);
	        return true;
	    } 
	    catch (NumberFormatException e) {
	        System.out.println("Enter a number!!!!!");
	    }
	    return false;
	}
	static boolean checkname(String n)
	{
		if(n == null || n.equals("")) {
	        System.out.println("Name is null or empty....");
	        return false;
	    }
		char ar[]=n.toCharArray();
		for(char i:ar)
		{
			if(Character.isAlphabetic(i) || i==' ') {
				continue;}
			else {
				System.out.println("Enter correct value without numbers and special characters......");
				return false;
			}
		}
		return true;
	}
}
