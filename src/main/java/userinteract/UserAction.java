package userinteract;

import inputscanner.InputScanner;

import java.util.Scanner;

public class UserAction {
    private String userInput;
    public UserAction() {
        //Setup the userinput
        InputScanner iScanner = new InputScanner();
        Scanner userInput = iScanner.InputScanner();
        this.userInput = userInput.next();
    }

    public String returnUserInput() {
        return userInput;
    }
}
