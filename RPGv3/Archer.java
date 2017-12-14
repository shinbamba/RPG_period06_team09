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
        return "Type    :" + type + System.lineSeparator() +
                super.toString();
    }
    
}