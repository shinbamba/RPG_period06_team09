public class Protagonist extends Character {
	private String name;
	
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
                super.toString();
    }
                

}
