public class Monster extends Character {
	protected String type;
    
	
    public Monster(int hp, int str, int def, double atkRating) {
        health = hp;
        strength = (int) (Math.random() * 45 + str);
        defense = def;
        attackRating = atkRating;
    }
    
	public String toString(){
        return  "Type    :" + type + System.lineSeparator() +
                super.toString();
	}
}
