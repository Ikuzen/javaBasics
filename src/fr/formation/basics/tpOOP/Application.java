package fr.formation.basics.tpOOP;

import fr.formation.basics.tpOOP.Cowboy;

import java.util.Random;

public class Application {

    public static void main(String[] args) {
	Cowboy luckyLuke = createLuckyLuke();
	Cowboy joeDalton = createJoeDalton();
	System.out.println("Before shooting:");
	print(luckyLuke, joeDalton);
	shootUntilDeath(luckyLuke, joeDalton);
	System.out.println("After shooting:");
	print(luckyLuke, joeDalton);
    }

    /**
     * Les cowboys en paramètres se tirent dessus aléatoirement jusqu'à la mort
     * de l'un des deux.
     * <p>
     * Note: plusieurs solutions possibles pour implémenter un tire aléatoire,
     * aller au plus simple.
     */
    private static void shootUntilDeath(Cowboy luckyLuke, Cowboy joeDalton) {
	// To be implemented
		int firstShooter;
		int lastShooter;
		Random random = new Random();
		Cowboy[] cowboys = {luckyLuke, joeDalton};
		while(true) {
			firstShooter = random.nextInt(2);
			lastShooter = Math.abs(firstShooter - 1);
			cowboys[firstShooter].shoot(cowboys[lastShooter]);
			if (cowboys[lastShooter].isDead()) {
				break;
			}
		}
	}

    private static Cowboy createLuckyLuke() {
	// To be implemented
	return new Cowboy("Lucky LUKE",10 ,new Weapon("Colt 5",5,2));
    }

    private static Cowboy createJoeDalton() {
	// To be implemented
		return new Cowboy("Joe DALTON",10 ,new Weapon("Colt 7",7,1));
    }

    private static void print(Cowboy luckyLuke, Cowboy joeDalton) {
	System.out.println(luckyLuke);
	System.out.println(joeDalton);
	System.out.println();
    }
}
