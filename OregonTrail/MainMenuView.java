/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260oregontrail.view;

import OregonTrail.OregonTrail;
import byui.cit260.oregontrail.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author MasterCraft Computer
 */
public class MainMenuView 
{
    private String menu;
    private String value;
    private String helpMenu;
    private boolean done;
    
    public void displayMainMenuView()
    {
        boolean done = false;
        do
        {
            //MainMenuView mainMenuView = new MainMenuView();
            //mainMenuView.displayMainMenuView();
            System.out.println(this.menu);
            String menuOption = this.getMenuOption();
            if(menuOption.toUpperCase().equals("Q"))
                return;
            this.doAction(menuOption);
            done = false;
        } while (!done);
    }
        private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            
            value = keyboard.nextLine();
            value = value.trim();
            break;
        }
        
        return value;
    }

    private boolean doAction(String choice) 
    {
        choice = choice.toUpperCase();
        switch (choice)
        {
            case "N":
                this.startNewGame();
                break;
            case "G":
                this.startExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "S":
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }
    public MainMenuView()
    {
        this.menu = "\n"
                + "\n -----------------------"
                + "\n | Main Menu            |"
                + "\n -----------------------"
                + "\nN - Start new game"
                + "\nG - Get and start saved game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save Game"
                + "\nQ - Quit"
                + "---------------------------";
        done = true;
    }

    private void startNewGame() 
    {
        GameControl.createNewGame(OregonTrail.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() 
    {
        System.out.println("\n*** startExistingGame() function called ***");
    }

    private void displayHelpMenu() 
    {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
        
    }

    private void saveGame() 
    {
        System.out.println("\n*** getMenuOption() function called ***");
    }
}

    
