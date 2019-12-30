import java.security.acl.Owner;
import java.util.*;

public class usercoroller {
	public register()
    {
    }
    /*public Boolean CheckExist (NormalUser u, Vector<NormalUser> n) {
		for(int i=0;i<n.size();i++) {
			if(u.UserName==n.get(i).UserName)
				return true;
		}
		
		return false;
	}	
    */
	public int LogInAsNormal( String Name ,String PassWord , Vector <NormalUser> n_user)
    {
    	boolean check=false;
    	for(int i=0;i<n_user.size();i++)
    	{
    		if(Name.equals(n_user.get(i).UserName) &&PassWord.equals(n_user.get(i).getPassword()))
    		{
    			check=true ;
    			System.out.println(" Wlecome Again : " + n_user.get(i).UserName );
    			return i;
    		}
    		else if(Name.equals(n_user.get(i).UserName) && PassWord.equals(n_user.get(i).getPassword())==false)
    		{
    			System.out.println(" I think there is something wrong in your password " + n_user.get(i).UserName +" \n");
    			System.out.println("Click '1' if you want to re enter password and '2' if you forgot It ");
    			Scanner n = new Scanner(System.in);
    			int choice=n.nextInt();
    			switch(choice)
    			{
    			case 1 :
	    			{
	    				System.out.println("Re-Enter your password");

	    				Scanner s = new Scanner(System.in);
	    				String ReEntered=s.nextLine();
	    				if(ReEntered.equals(n_user.get(i).getPassword()))
	    				{
	    					check=true;
	    					System.out.println(" Wlecome Again : " + n_user.get(i).UserName );
	    				}
	        			return i;

	    			}
    			case 2 :
	    			{
	    				System.out.println("Enter youe Email");
	    				Scanner s = new Scanner(System.in);
	    				String ReEntered=s.nextLine();
	    				if(ReEntered.equals(n_user.get(i).getEmail()))
	    				{
	    					check=true;
	    					System.out.println("Your PassWord is  " + n_user.get(i).getPassword() );
	    					
	    					System.out.println(" Wlecome Again : " + n_user.get(i).UserName );
	    					
	    	    			return i;

	    				}
	    				else
	    				{
	    					System.out.println("Sorry Failed "+check );
	    				}
	    			//	return -1;
	    			}
    			
    			}
    		}
    		/*else 
    		{
    			continue; 
    		}*/
    		
    	}
    	
    	
    	if(check==false)
    	{
    		System.out.println("Sorry Log In Failed !!" );
    	}
		return -1;
    	
    }

}
