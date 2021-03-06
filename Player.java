
// import statements

import java.util.ArrayList;
import java.math.*; 	//En g�n�ral ils (les assistants) aiment pas trop qu'on importe toute une librairie � cause 
			//des noms de variables qu'on pourrait utiliser qui appartiendraient d�j� � "math"
import java.util.Random; //utile pour les points de skills lorsqu'on monte d'un niveau (ligne 30)

public class Player extends Character {
	
	/*
	 * Player class, when a new game is launched, a new instance of the player is created, all skills, and inventory
	 */ 
	
	// ################# Declaration of player variable #################### 
	
	private int xp;               // Experience points
		
	// ########################### level UP SYSTEM #########################
	
	private void Newlevel(int xp_brought){
		/*
		 * DESC : Private method which will regulate the level-up system regarding the current xp the player has, the leveling system
		 * follow a linear progression (prototype!!!)
		 */
		
		int Next_level_req = 50 + 10*(level -1);
		
		if(this.xp + xp_brought >= Next_level_req) {
			this.level ++;                             // level UP!
			this.xp = (this.xp + xp_brought) - Next_level_req  ;  // We don't want to lose the remaining xp earned
			Random rand = new Random();
			int skillsPoints = rand.nextInt(8) + 3; // nombre entre 3 et 10 de points de skills � distibuer (le random te fais un petit coup de stress bonus quand tu montes de lvl)
		}
		
		else {
			this.xp += xp_brought;                    //Simple addition of xp's 
			
		}
		
	}
	
	// Constructor
	
	//ce que tu avais �crit c'est pour le main il me semble, check les lignes ci-dessous
	public Player(){
		this.level = 1;
		this.hpMax = 50;
		this.manaMax = 50;
		//this.skills = {0,0,0};
		this.xp = 0;
		this.hp = this.hpMax;
		this.mana = this.manaMax;
		this.vision = 3; //Cercle de 3 de rayon qui grandit avec lumi�re
	
	}
		/*
		 * Player construction method, by default will put all the player's skills to "1", and level to "1", the default heath and 
		 * mana are both "50" points
		 */
		
}
	
// j'ai supprimer Player devant level pour que ce soit plus g�n�ral --> superclasse character'