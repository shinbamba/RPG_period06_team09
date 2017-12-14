public class UserOfRPGv2 {
	public static void main(String[] args){
		// Character[] agents = {
		// 	new Protagonist("Protagonist"),
		// 	new Mage("Shin"),
		//	new Knight("Bamba"),
		//	new Archer("Bobby"),
		//	new Monster(100,25,50,.5),
		//	new Goblin(),
		//	new Ogre(),
		//	new Zombie()};
		
		// Problem 2
		
		//This will fail during compilation because, in an array of Monsters, you cannot put in an 
		//instance of type Protagonist as a unit.
		
		// UserOfRPGv2.java:17: error: incompatible types: Protagonist cannot be converted to Monster
        //                new Protagonist("Protagonist"),
		Monster[] agents = {
		 	new Protagonist("Protagonist"),
		 	new Mage("Shin"),
			new Knight("Bamba"),
			new Archer("Bobby"),
			new Monster(100,25,50,.5),
			new Goblin(),
			new Ogre(),
			new Zombie()};

		for(int count = 0;count < agents.length; count += 1)
			System.out.println(agents[count]);
		
		// Problem 3
		
		//The error will occur during compilation because their is not such method called getName() in
		//the Monster class
		
		//UserOfRPGv2.java:32: error: cannot find symbol
        //                System.out.println(agents[count].getName());

		for(int count = 0;count < agents.length; count += 1)
		 	System.out.println(agents[count].getName());

	}
}