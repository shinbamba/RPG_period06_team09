public class Archer extends Protagonist {
    
    public Archer (String name) {
        super(name);
        health = 100;
        strength = 90;
        defense = 20;
        attackRating = .75;
        type = "Archer";
    }
    
    public String toString() {
        return  "Type    :" + type + System.lineSeparator() +
                "Name    :" + name + System.lineSeparator() +
                "Health  :" + health + System.lineSeparator() +
                "Strength:" + strength + System.lineSeparator() +
                "Defense :" + defense + System.lineSeparator() + 
                "Rating  :" + attackRating + System.lineSeparator();
    }
    
	public void specialize(){ 
		defense -= 15; 
		strength += 15; 
	} 
	public void normalize() { 
		defense += 15; 
		strength -= 15;
	}
	
}