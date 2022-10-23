package OOPs;

class Sports {
	
    String getName() 
    	{
        	return "Generic Sports";
    	}
    
    void getNumberOfTeamMembers() 
    	{
        	System.out.println( "Each team has n players in " + getName() );
    	}
}
 
class Soccer extends Sports {
     
    @Override
    
    void getNumberOfTeamMembers() {
    	// TODO Auto-generated method stub
    	super.getNumberOfTeamMembers();
    }
    String getName() 
    	{
    	
        	return "Soccer Class";
    	}
}

public class Fri18Mar_Q2 {
	public static void main(String args[]) {
		
		Sports sp = new Sports();
		System.out.println(sp.getName());
		sp.getNumberOfTeamMembers();
		
		Soccer s = new Soccer();
		System.out.println(s.getName());
		s.getNumberOfTeamMembers();
		
	}
}
/* OP :
 * Generic Sports 
 * Each team has n players in Generic Sports 
 * Soccer Class 
 * Each team has 11 players in Soccer Class
 */
