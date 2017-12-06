public class Knight extends Protagonist {
    
    public Knight (String name) {
        super(name);
        health = 125;
        strength = 100;
        defense = 25;
        attackRating = .5;
    }
    
    public String toString() {
        return "Class   :Knight" + System.lineSeparator() +
                super.toString();
    }
        
    
}