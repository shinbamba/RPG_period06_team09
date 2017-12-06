public class Character {
    protected int health;
    protected int strength;
    protected int defense;
    protected double attackRating;


	public boolean isAlive() {
        return health > 0;
    }

    public int getDefense() {
        return defense;
    }

   	public void lowerHP(int reduction) {
        health -= reduction;
        if (health < 0) 
        health = 0;
   	}

    public int attack(Character target) {
        int damage = (int)(strength * attackRating - target.getDefense());
        target.lowerHP(damage);
    return damage;
    }
    public String toString() {

        return  "Health  :" + health + System.lineSeparator() +
                "Strength:" + strength + System.lineSeparator() +
                "Defense :" + defense + System.lineSeparator() + 
                "Rating  :" + attackRating + System.lineSeparator();

	}
}
