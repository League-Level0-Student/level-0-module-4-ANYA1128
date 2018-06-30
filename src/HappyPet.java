import javax.swing.JOptionPane;

public class HappyPet {
	static String pet;
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
           pet = JOptionPane.showInputDialog(null, "What kind of pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for(int i=0;i<100 ;i++) {
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
          int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Happy Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "food", "water", "take a walk", "groom", "clean up poop" }, null);

        
			// 5. Use user input to call the appropriate method created in step 4.
                if (task == 0) {
                	cuddle();
                }
                else if (task == 1) {
                	food();
                }
                else if (task == 2) {
                	water();
                }
                else if (task == 3) {
                	takeAWalk();
                }
                else if (task == 4) {
                	groom();
                }
                else {
                	cleanUpPoop();
                }
                
                
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
                   if (happinessLevel==500) {
                	   JOptionPane.showMessageDialog(null, "You love your pet");
                	   break;
                   }
	}
	}
	static // 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	void cuddle() {
		JOptionPane.showMessageDialog(null, pet + " will feel loved.");
	    happinessLevel = happinessLevel + 10;
	    
	    
	    
	    
	}
	static void food() {
		JOptionPane.showMessageDialog(null, pet + " will be very happy.");
	    happinessLevel = happinessLevel + 20;
	}
	static void water() {
		JOptionPane.showMessageDialog(null, pet + " will be grateful to you for not letting it die from lack of water.");
	    happinessLevel = happinessLevel + 30;
	}
	static void takeAWalk() {
		JOptionPane.showMessageDialog(null, pet + " will thank you for the exersise that you don't get enough of.");
	    happinessLevel = happinessLevel + 40;
	}
	static void groom() {
		JOptionPane.showMessageDialog(null, pet + " will be happy about this.");
	    happinessLevel = happinessLevel + 50;
	}
	static void cleanUpPoop() {
		JOptionPane.showMessageDialog(null, pet + " will be eternally grateful for not making them eat the poop.");
	    happinessLevel = happinessLevel + 100;
	}
	
	

}
