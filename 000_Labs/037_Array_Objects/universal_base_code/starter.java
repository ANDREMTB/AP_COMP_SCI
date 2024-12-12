/*
 *	Author:  Andre Sookazian
 *  Date: 11/15/24
*/

import pkg.*;
import java.util.*;

class starter {
        public static void main(String[] args) {
        Warrior[] warriors = new Warrior[100];
        Wizard[] wizards = new Wizard[100];

        
        for (int i = 0; i < 100; i++) {
            warriors[i] = new Warrior("Warrior " + (i + 1)     );
            wizards[i] = new Wizard("Wizard " + (i + 1)  );
        }

        int warriorNumber = 0;
        int wizardNumber = 0;
        int lastWarriors = 100;
        int lastWizards = 100;

        
        while (lastWarriors > 0 && lastWizards > 0) {
          Warrior currentWarrior = warriors[warriorNumber];
           
            
            
            Wizard currentWizard = wizards[wizardNumber];

            
            if (!currentWizard.isDead()) {
                currentWizard.attack(currentWarrior);
              
              
              
              
            if (currentWarrior.isDead()) {
                    System.out.println(currentWarrior.getName() + " has dieddd!!!!!!!!");
                    warriorNumber++;     
                    lastWarriors--;       
                }
            }

           
          if (!currentWarrior.isDead()) {
                currentWarrior.attack(currentWizard);
               
               
               
               
               
              if (currentWizard.isDead()) {
                    System.out.println(currentWizard.getName() + " has died now!!!!! ");
                    wizardNumber++;      
                    lastWizards--;       
                }
            }
        }

        
        if (lastWarriors == 0) {
            System.out.println("Wizards won the war! " + lastWizards + " have wizards are left.");
      
      
      
        } else {
            System.out.println("The Warriors won the war! " + lastWarriors + " are warriors are left.");
        }
    }
}	
		
		
		
		
		

	

