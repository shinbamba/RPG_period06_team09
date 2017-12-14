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
    
}