package fightingTask;

public class War {

    public static void fight(Warrior...warriors) {
        while (true) {
            if (warriors[0].getHealth() == 0 | warriors[1].getHealth() == 0) {
                if (warriors[0].getHealth() > 0) {
                    System.out.println(warriors[0] + " одержал победу!");
                } else {
                    System.out.println(warriors[1] + " одержал победу!");
                }
                break;
            }
            if(warriors[0].getHealth() > 0 | warriors[1].getHealth() > 0) {
                int n = (int)Math.floor(Math.random() * warriors.length);
                switch (n) {
                    case 0:
                        warriors[0].doAttack(warriors[0], warriors[1]);
                        break;
                    case 1:
                        warriors[1].doAttack(warriors[1], warriors[0]);
                }
            }
        }
    }
}