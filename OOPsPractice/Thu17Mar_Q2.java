package OOPsPractice;

class Dogs {
    private String name;

    public Dogs(String name)
    {
        this.name = name;
    }

    public boolean equals(String name)
    {
    	if(name==name) {
    		return true;
    	}else
    	
		return false;
        
    }
}

public class Thu17Mar_Q2 {

	 public static void main(String[] args) {
        Dogs d1 = new Dogs("Rufus");
        Dogs d2 = new Dogs("Sally");
        Dogs d3 = new Dogs("Rufus");
        Dogs d4 = new Dogs("Rufus");
        d1 = d2;
        d2 = d3;
        d1 = d3;
        d3 = d4;
        
        System.out.println(d2.equals(d3));
        System.out.println(d1.equals(d3));
        System.out.println(d1.equals(d2));
        System.out.println(d3.equals(d4));
    }
  
}
