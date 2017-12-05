public class Monster extends Character {
    public Monster() {
        health = 100;
        strength = (int) (Math.random() * 45 + 20);
        defense = 25;
        attackRating = .5;
    }
}
