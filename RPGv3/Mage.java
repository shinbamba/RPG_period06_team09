public class Mage extends Protagonist {
    
    public Mage (String name) {
        super(name);
        health = 90;
        strength = 80;
        defense = 15;
        attackRating = .9;
        type = "Mage";
    }
    
    public String toString() {
        return  "Type    :" + type + System.lineSeparator() +
                "Name    :" + name + System.lineSeparator() +
                "Health  :" + health + System.lineSeparator() +
                "Strength:" + strength + System.lineSeparator() +
                "Defense :" + defense + System.lineSeparator() + 
                "Rating  :" + attackRating + System.lineSeparator();
    }
    
    // Mage.java:1: error: Mage is not abstract and does not override abstract method toString() in Protagonist
// public class Mage extends Protagonist {
       // ^
// 1 error
    
	public void specialize(){ 
		defense -= 5; 
		strength += 5; 
	} 
	public void normalize() { 
		defense += 5; 
		strength -= 5; 
	}
}