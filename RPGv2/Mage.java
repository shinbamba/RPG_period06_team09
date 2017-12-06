public class Mage extends Protagonist {
    
    public Mage (String name) {
        super(name);
        health = 90;
        strength = 80;
        defense = 15;
        attackRating = .9;
    }
    
    public String toString() {
        return "Class   :Mage" + System.lineSeparator() +
                super.toString();
    }
    
}