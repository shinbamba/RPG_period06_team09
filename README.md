# RPG_period06_team09
### Michael, Shin, Tahmid

Character class
* Fields: health, strength, defense, and attackRating
* Methods: getDefense(), isAlive(), lowerHP(reduction), attack(target)
* toString tells health, strength, defense, rating

Protagonist class (extends Character)
* Constuctors: Protagonist(charName)
* Fields: name, type
* Methods: specialize(), normalize(), getName()
* toString tells name and type (super.toString())

Protagonist subClasses
health | strength | defense | attackRating | type
--- | --- | --- | --- | ---
100 | 90 | 20 | .75 | Archer
125 | 100 | 25 | .5 | Knight
90 | 80 | 15 | .9 | Mage

Monster class (extends Character)
* Constructors: Monster(hp,str,def,atkRating)
* Fields: type
* toString tells type (super.toString())

Monster subClasses
health | strength | defense | attackRating | type
--- | --- | --- | --- | ---
50 | 75 | 30 | .75 | Goblin
250 | 50 | 15 | 1 | Ogre
125 | 100 | 15 | .5 | Zombie

YoRPG class

Difficulty of game ranges from 1-3.
Allows user to make name and choose class of knight, mage, or archer.
Based on difficulty, there is a "chance" to fight Goblin.
Asks user if he/she feels lucky. If "Nay," specialize attack, if "Aye," normalize attack. Repeats until one is dead.
