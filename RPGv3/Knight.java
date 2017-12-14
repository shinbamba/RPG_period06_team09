public class Knight extends Protagonist {
    
    public Knight (String name) {
        super(name);
        health = 125;
        strength = 100;
        defense = 25;
        attackRating = .5;
        type = "Knight";
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
	defense -= 10; 
	strength += 10; 
	} 
	public void normalize() { 
		defense += 10; 
		strength -= 10; 
	}
}