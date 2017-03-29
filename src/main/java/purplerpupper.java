import purplepupper.Pupper;

import purplepupper.PupperTypes;
import userinteract.UserAction;

public class purplerpupper {


    public static void main(String[] args) {
        //Introduction
        System.out.println("Welcome to Pupper App");
        System.out.println("Please provide a pupper:");

        UserAction gettingPupper = new UserAction();
        if (PupperTypes.isPupperType(gettingPupper.returnUserInput().toUpperCase())) {
            System.out.println("Nice!");
            PupperTypes type = PupperTypes.valueOf(gettingPupper.returnUserInput().toUpperCase());
            Pupper pupper = new Pupper(type);
            System.out.println("Your pupper is: " + pupper.getPupperType());
            System.out.println("And your pupper is currently: " + pupper.getPupperStatus());

            System.out.println("------------------------------------------");

            System.out.println("Now what would you like to do, possible actions ");
            System.out.println(" - Walk Pupper");
            System.out.println(" - Make Pupper Bork");
            System.out.println(" - Check Pupper Type");
            System.out.println(" - Check Pupper Status");

            UserAction getAction = new UserAction();
            System.out.println(getAction.returnUserInput());
        } else {
            System.out.println("That's no pupper I ever heard off, get out of here");
            System.exit(1);
        }
    }
}
