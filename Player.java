// import statements

import java.util.ArrayList;
import java.math.*;




public class Player {
	
	/*
	 * Player class, when a new game is launched, a new instance of the player is created, all skills, and inventory
	 */ 
	
	// ################# Declaration of player variable #################### 
	
	private int PlayerLevel;     // Level == 1 for a new game
	private int HPMax;           // HP Max, relative to player level and skills
	private int ManaMax;         // Mana Max, relative to player level and skills
	private int[] Skills;        // Skills table {int FORCE(W), int SPEED(W), int DESTRUCTION(M), int HEALING(M)} (W = Warior, M = Mage)
	private int XP;               // Experience points

	private int HP;
	private int Mana;
	
	// ################# Declaration of variables depending on the equipment #########
	
	
	public int DPH;              // "Damages per hits", would be used outside ouf the Player class
	public int SkillPoints;      // Skill point to be distributed by the player
			

	
	// ############### Getters and Setters ##################### //
	
	
	//Getters
	public int get_Playerlevel() {return this.PlayerLevel;}
	public int get_HPMax() {return this.HPMax;}
	public int get_ManaMax() {return this.ManaMax;}
	public int[] get_Skills() {return this.Skills;}
	
	public int get_HP() {return this.HP;}
	public int get_Mana() {return this.Mana;}
	

	//Setters
	
	private void set_HPMax() { HPMax = NewHPMax();}
	public set_XP(int XP_brought) {NewLevel(XP_brought);}
	
	

	
	
	
	
	
	// ########################### LEVEL UP SYSTEM #########################
	
	private void NewLevel(int XP_brought){
		/*
		 * DESC : Private method which will regulate the level-up system regarding the current XP the player has, the leveling system
		 * follow a linear progression (prototype!!!)
		 */
		
		int Next_level_req = 50 + 10*(PlayerLevel -1);
		
		if(XP + XP_brought >= Next_level_req) {
			this.PlayerLevel ++;                             // LEVEL UP!
			this.XP = (XP + XP_brought) - Next_level_req  ;  // We don't want to lose the remaining XP earned
			
		}
		
		else {
			this.XP = (XP + XP_brought);                    //Simple addition of XP's 
			
		}
		
		
		
	}
	
	// Constructor
	
	private void Player(String Args[]) {
		/*
		 * Player construction method, by default will put all the player's skills to "1", and level to "1", the default heath and 
		 * mana are both "50" points
		 */
		
	}
	
	
	
	
	
}
