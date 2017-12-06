public class Protagonist extends Character {
	protected String name;
    protected String type;
	
	public Protagonist(String charName) {
        name = charName;
    }

   	public void specialize() {
     	defense -= 10;
  		strength += 10;
   	}

    public void normalize() {
       	defense += 10;
       	strength -= 10;
   	}

	
   	public String getName() {
    	return name;
    }
    
    public String toString() {
        return  "Name    :" + charName + System.lineSeparator() +
                "Type    :" + type + Syste.lineSeparator() +
                super.toString();
    }
                

}
