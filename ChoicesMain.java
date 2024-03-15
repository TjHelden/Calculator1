import java.util.Scanner;
import java.util.Random;
public class ChoicesMain {

    private static final int SWORD = 1;
    private static final int GUN = 2;
    private static final int BASEBALL_BAT = 3;

    private static double SWORD_SUCCESS_RATE = 0.7;
    private static double GUN_SUCCESS_RATE = 1.0;
    private static double BASEBALL_BAT_SUCCESS_RATE = 0.8;

    // Scanner object for taking user input
    private static final Scanner scanner = new Scanner(System.in);

    // Main method where the program execution begins
    public static void main(String[] args) {
        // Greeting message
        greet();
        // Variable to control whether to play again
        boolean playAgain = true;

        // Main game loop
        while (playAgain) {
            // Play the game
            playGame();
            // Ask if the player wants to play again
            playAgain = askToPlayAgain();
        }

        // Thank the player for playing before closing the scanner
        System.out.println("Thanks for playing!!!");
        scanner.close();
    }

    // Method to greet the player
    private static void greet() {
        System.out.println("Salutations!");
        System.out.println("You are given a quest to defeat The Lizard King.");
    }

    // Method to play the game
    private static void playGame() {
        // Prompt the player to accept or deny the quest
        System.out.println("Will you accept this quest? Press 1 or 2 then press enter...");
        System.out.println("1. Yes! I would love to defeat that guy!");
        System.out.println("2. No way, I have better things to do.");

        // Get user choice between 1 and 2
        int choice = getUserChoice(1, 2);

        // Act based on the user's choice
        switch (choice) {
            case 1:
                // If the player accepts the quest, proceed with acceptedQuest() method
                acceptedQuest();
                break;
            case 2:
                // If the player denies the quest, proceed with denyQuest() method
                denyQuest();
                break;
        }
    }

    // Method to handle the scenario when the player accepts the quest
    private static void acceptedQuest() {
        // Prompt the player to choose a weapon
        System.out.println("You have accepted the quest.");
        System.out.println("You see three weapons lying in front of you.");
        System.out.println("A sword, a semi-automatic rifle, and a baseball bat.");
        System.out.println("You can only carry one.");
        System.out.println("Which will you choose?");
        System.out.println("1. Sword");
        System.out.println("2. Semi-automatic rifle");
        System.out.println("3. Baseball bat");

        // Get user choice between 1 and 3
        int weaponChoice = getUserChoice(1, 3);

        // Act based on the user's choice of weapon
        switch (weaponChoice) {
            case 1:
                System.out.println("You have chosen the sword. Although, you aren't very skilled using it.");
                break;
            case 2:
                System.out.println("You have chosen the semi-automatic rifle. It doesn't look like there's much ammo...");
                break;
            case 3:
                System.out.println("You have chosen the baseball bat. It reminds you of that time you hit that foul ball in little league.");
                break;
        }

        System.out.println("You are now armed and ready for the quest. Will you venture off into the forest or explore the city?");
        System.out.println("1. Venture off into the forest?");
        System.out.println("2. Explore the city?");

        int locationChoice = getUserChoice(1, 2);

        switch (locationChoice) {
            case 1:
                System.out.println("You have chosen the forest.");
                System.out.println("After wandering around aimlessly you see a shack. Will you go inside?");
                System.out.println("1. Yes, creepy shacks are fun to explore.");
                System.out.println("2. NO WAY!");

                int shackChoice = getUserChoice(1, 2);

                switch (shackChoice) {
                    case 1:
                        System.out.println("You have decided to explore the shack. You find that it isn't as creepy on the inside.");
                        System.out.println("You see that there is a chest. You look inside and find a health potion.");
                        System.out.println("This will come in handy!");
                        System.out.println("There is nothing else left to look at in the shack, so you go outside.");
                        break;
                    case 2:
                        System.out.println("You have decided that the shack is way too creepy.");
                        break;
                }
                System.out.println("You continue your way through the forest.");
                System.out.println("Suddenly, you are attacked by lizard monsters!");
                System.out.println("What will you do?");
                System.out.println("1. Attack!");
                System.out.println("2. Run for your life!");

                int attackFlee = getUserChoice(1, 2);

                switch (attackFlee) {
                    case 1:
                        attack(weaponChoice);
                        break;
                    case 2:
                        System.out.println("You decide to run for your life!");
                        System.out.println("Suddenly, you fall into a hole.");
                        System.out.println("The hole is a tunnel. You follow it and find an underground city.");
                        break;
                }
                break;
            case 2:
                System.out.println("You decide to explore the city...");
                System.out.println("The roads are empty, and the buildings are crumbling.");
                System.out.println("There is a building that use to be a store nearby. Looks like there could be something useful in there.");
                System.out.println("Do you want to check it out?");
                System.out.println("1. Yeah, I think I will.");
                System.out.println("2. No, I think that building is probably filled with lizard monsters.");

                int storeChoice = getUserChoice(1, 2);

                switch (storeChoice) {
                    case 1:
                        System.out.println("You decide to check it out.");
                        System.out.println("It is really dark so it is hard to see, but you think you see a chest under the counter.");
                        System.out.println("You look to see what is inside, and you find that there is a health potion.");
                        System.out.println("This will come in handy!");
                        System.out.println("There seems to be nothing else of use in the store, so you continue through the city.");
                        break;
                    case 2:
                        System.out.println("You decide not to check it out and continue through the city.");
                        break;
                }
                System.out.println("Suddenly, you fall down into the sewer!");
                System.out.println("You walk through the sewer and stumble upon an underground city.");
                break;
        }


        System.out.println("The underground city is filled with lizard monsters.");
        System.out.println("In the center you see a large structure.");
        System.out.println("There are lizard guards at the entrance of the building.");
        System.out.println("Will you attempt to sneak past them or attack?");
        System.out.println("1. Sneak");
        System.out.println("2. ATTACK!");

        int sneak_ATTACK = getUserChoice(1,2);

        switch (sneak_ATTACK) {
            case 1:
                System.out.println("You decide to sneak past the guards");
                System.out.println("There is an opening in the wall that is just big enough for you to fit through.");
                System.out.println("Making your way through, sneaking past all the guards in town, you can hear a loud voice.");
                System.out.println("Sounds like the Lizard King!");
                break;
            case 2:
                System.out.println("ATTACK!!");
                double random = Math.random();
                if (weaponChoice == SWORD) {
                    System.out.println("You slayed the monsters with your sword!");
                } else if (weaponChoice == BASEBALL_BAT) {
                    System.out.println("You bashed one of guards shins in and knocked the others head sky high!");
                    System.out.println(".....FOUL BALL!");
                } else if (weaponChoice == GUN) {
                    System.out.println("You sprayed and prayed!");
                    System.out.println("......now you are out of bullets....");
                }
                System.out.println("You hear a loud voice and its coming closer!");
                System.out.println("It's the Lizard King!");
                break;
        }

        System.out.println("You ready yourself.");
        System.out.println("The fate of the world is in your hands now!");
        System.out.println("The Lizard King sees you and you see him.");
        System.out.println("Who will make the first move?");
        System.out.println("1. I will!");
        System.out.println("2. I will wait for him to make the first move.");

        int firstMove = getUserChoice(1, 2);

        switch (firstMove) {
            case 1:
                System.out.println("You decide to make the first move!");
                if (weaponChoice == SWORD) {
                    System.out.println("You slash at the Lizard King!");
                    System.out.println("He is down, but its not over!");
                    System.out.println("He takes a deep breath and spits out a giant fireball!");
                    System.out.println("You try to dodge, but some of the blast burned your arm.");
                    System.out.println("If you have a health potion it can help you!");
                    System.out.println("No time");
                    System.out.println("The Lizard King throws a punch!");
                    System.out.println("You see the opportunity to slash him");
                    System.out.println("Dodging the punch, you take your sword and slice off the arm of the Lizard King!");
                    System.out.println("The Lizard King screams!");
                    System.out.println("Before you can attack again, the Lizard King escapes!");
                    }
                break;
            case 2:

                }
        }



    private static void attack(int weaponChoice) {
        double successRate = 0.0;
        switch (weaponChoice) {
            case SWORD:
                successRate = SWORD_SUCCESS_RATE;
                break;
            case GUN:
                successRate = GUN_SUCCESS_RATE;
                break;
            case BASEBALL_BAT:
                successRate = BASEBALL_BAT_SUCCESS_RATE;
                break;
        }

        // Generate a random number between 0 and 1
        double random = Math.random();

        // Check if the attack is successful based on the weapon's success rate
        if (random <= successRate) {
            System.out.println("You successfully fend off the lizard monsters!");
        } else {
            System.out.println("Your attack fails, and you suffer a counterattack!");
            System.out.println("The monsters bash you in the head.");
            System.out.println("You decided it is best to escape.");
            System.out.println("You ran as fast as you could. Suddenly, you fall into a hole.");
            System.out.println("The hole is a tunnel. You follow it and find an underground city.");
        }
    }





    // Method to handle the scenario when the player denies the quest
    private static void denyQuest() {
        System.out.println("You have decided to deny the quest.");
        System.out.println("The Lizard King takes over the world.");
        System.out.println("GAME OVER!");
    }

    // Method to get user choice within a specified range
    private static int getUserChoice(int min, int max) {
        int choice;
        do {
            // Prompt the player to enter a choice
            System.out.print("Enter your choice: ");
            // Loop until a valid integer input is provided within the specified range
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            // Get the user's input
            choice = scanner.nextInt();
        } while (choice < min || choice > max); // Validate the input range
        return choice;
    }

    // Method to ask if the player wants to play again
    private static boolean askToPlayAgain() {
        // Prompt the player to enter 'yes' or 'no'
        System.out.print("Do you want to play again? Enter 'yes' or 'no': ");
        // Read the player's response
        String playAgain = scanner.next().toLowerCase();
        // Return true if the player wants to play again, false otherwise
        return playAgain.equals("yes");
    }
}








