public class Protagonist extends Character {
	private String name;
	
	public Protagonist(String charName) {
        name = charName;
        health = 125;
        strength = 100;
        defense = 25;
        attackRating = .5;
    }
public String toString() {
return "Name: " +name +System.lineSeparator() +" health: " +health +System.lineSeparator() +" strength: " +strength +System.lineSeparator() +" defense: " +defense +System.lineSeparator() +" attackRating: " +attackRating;  
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

}
