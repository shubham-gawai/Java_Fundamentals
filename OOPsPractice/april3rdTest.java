package OOPsPractice;

class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    @Override
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has 11 players in " + getName() );
    }
}

public class april3rdTest {

    public static void main(String[] args) {
        
        Sports spo = new Sports();
        System.out.println(spo.getName());
        spo.getNumberOfTeamMembers();
        
        Sports soc = new Soccer();
        System.out.println(soc.getName());
        soc.getNumberOfTeamMembers();
    }
}