/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;
import java.util.Scanner;
/**
 *
 * @author Ocean
 */
public class FactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
	         
	        EnemyShipFactory shipFactory = new EnemyShipFactory();
	        EnemyShip theEnemy= null; 
	        Scanner userInput = new Scanner(System.in);
	         
	        System.out.print("What type of ship? (U / R / B)");
	         
	        if (userInput.hasNextLine()){
	             
	            String typeOfShip = userInput.nextLine();
	         
                    theEnemy = shipFactory.makeEnemyShip(typeOfShip);
	             
	        if(theEnemy != null){
	                 
	            doStuffEnemy(theEnemy);	                 
	            }
                else System.out.print("Please enter U, R, or B next time");
	         
	        }
    }
                
       public static void doStuffEnemy(EnemyShip anEnemyShip){
	         
	        anEnemyShip.displayEnemyShip();
	         
	        anEnemyShip.followHeroShip();
	         
	        anEnemyShip.enemyShipShoots();
	         
	    }
}