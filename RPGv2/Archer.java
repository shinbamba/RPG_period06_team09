public class Archer extends Protagonist {
    
    public Archer (String name) {
        super(name);
        health = 100;
        strength = 90;
        defense = 20;
        attackRating = .75;
    }
    
    public String toString() {
        return "Class   :Archer" + System.lineSeparator() +
                super.toString();
    }
    
}