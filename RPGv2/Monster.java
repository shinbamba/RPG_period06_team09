public class Monster extends Character {
	protected String type;
	
    public Monster(int hp, int str, int def, double atkrating) {
        health = hp;
        strength = (int) (Math.random() * 45 + str);
        defense = def;
        attackRating = atkrating;
    }
	public String toString(){
		return "Type: " + type + System.lineSeparator() + 
				super.toString();
	}
}
