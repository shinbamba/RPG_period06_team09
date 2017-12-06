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
        return "Type    :" + type + System.lineSeparator() +
                super.toString();
    }
        
    
}