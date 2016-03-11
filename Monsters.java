
// import statements

import java.util.ArrayList;
import java.math.*; 	//En général ils (les assistants) aiment pas trop qu'on importe toute une librairie à cause 
			//des noms de variables qu'on pourrait utiliser qui appartiendraient déjà à "math"
import java.util.Random; //utile pour les points de skills lorsqu'on monte d'un niveau (ligne 30)

public class Monsters extends Character {
	
	/*
	 * Player class, when a new game is launched, a new instance of the player is created, all skills, and inventory
	 */ 
	
	// ################# Declaration of player variable #################### 
	
	private int XP;               // Experience points
		
	// ########################### level UP SYSTEM #########################
	
	private void Newlevel(int XP_brought){
		/*
		 * DESC : Private method which will regulate the level-up system regarding the current XP the player has, the leveling system
		 * follow a linear progression (prototype!!!)
		 */
		
		int Next_level_req = 50 + 10*(level -1);
		
		if(this.XP + XP_brought >= Next_level_req) {
			this.level ++;                             // level UP!
			this.XP = (this.XP + XP_brought) - Next_level_req  ;  // We don't want to lose the remaining XP earned
			Random rand = new Random();
			int skillsPoints = rand.nextInt(8) + 3; // nombre entre 3 et 10 de points de skills à distibuer (le random te fais un petit coup de stress bonus quand tu montes de lvl)
		}
		
		else {
			this.XP += XP_brought;                    //Simple addition of XP's 
			
		}
		
	}
	
	// Constructor
	
	//ce que tu avais écrit c'est pour le main il me semble, check les lignes ci-dessous
	public Monsters(int level, int hpMax, int manaMax, int[]skills, int vision){
		this.level = level;
		this.hpMax = hpMax;
		this.manaMax = manaMax;
		this.vision = vision;
		//this.skills = {0,0,0};
		this.XP = 0;
		this.hp = this.hpMax;
		this.mana = this.manaMax;
		
	
	}
		/*
		 * Player construction method, by default will put all the player's skills to "1", and level to "1", the default heath and 
		 * mana are both "50" points
		 */
		
}
	
// j'ai supprimer Player devant level pour que ce soit plus général --> superclasse character'