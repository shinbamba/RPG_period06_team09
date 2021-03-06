public abstract class Protagonist extends Character {
	protected String name;
    protected String type;
	
	public Protagonist(String charName) {
        name = charName;
    }

   	public abstract void specialize();

    public abstract void normalize();
	
   	public String getName() {
    	return name;
    }
    
    public abstract String toString();
    
    // Protagonist.java:1: error: Protagonist is not abstract and does not override abstract method toString() in Protagonist
// public class Protagonist extends Character {
       // ^
// Protagonist.java:24: error: abstract methods cannot have a body
    // public abstract String toString() {
                           // ^
// 2 errors

    public static void main(String[] args) {
        // Protagonist Tahmid = new Protagonist("Tahmid");
        
        // Protagonist.java:35: error: Protagonist is abstract; cannot be instantiated
        // Protagonist Tahmid = new Protagonist("Tahmid");
                             // ^
// 1 error
                
    }
}
   

