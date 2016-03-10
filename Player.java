// import statements

import java.util.ArrayList;
import java.math.*; 	//En général ils (les assistants) aiment pas trop qu'on importe toute une librairie à cause 
			//des noms de variables qu'on pourrait utiliser qui appartiendraient déjà à "math"
import java.util.Random; //utile pour les points de skills lorsqu'on monte d'un niveau (ligne 30)

public class Player {
	
	/*
	 * Player class, when a new game is launched, a new instance of the player is created, all skills, and inventory
	 */ 
	
	// ################# Declaration of player variable #################### 
	
	private int PlayerLevel;     // Level == 1 for a new game
	private int HPMax;           // HP Max, relative to player level and skills
	private int ManaMax;         // Mana Max, relative to player level and skills 
	// On crée des points de Mana ou on utilise des sorts qui se rechargent ? Je préfère la deuxième option (comme ça le guerrier a pas une barre de Mana inutile)
	private int[] Skills;        // Skills table {int FORCE(W), int SPEED(W), int DESTRUCTION(M), int HEALING(M)} (W = Warior, M = Mage)
	private int XP;               // Experience points

	private int HP; // Je pense que ça devrait être public ar modifiable par les monstre notamment (on en reparlera avec mon ULM)
	private int Mana;
	
	// ################# Declaration of variables depending on the equipment #########
	// On devrait pas mettre DPH dans la classe arme ?
	
	public int DPH;              // "Damages per hits", would be used outside ouf the Player class
	Random rand = new Random();
	private static int SkillsPoints = rand.nextInt(8) + 3; // nombre entre 3 et 10 de points de skills à distibuer (le random te fais un petit coup de stress bonus quand tu montes de lvl)
			

	
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
		
		if(this.XP + XP_brought >= Next_level_req) {
			this.PlayerLevel ++;                             // LEVEL UP!
			this.XP = (this.XP + XP_brought) - Next_level_req  ;  // We don't want to lose the remaining XP earned
		}
		
		else {
			this.XP += XP_brought;                    //Simple addition of XP's 
			
		}
		
		
		
	}
	
	// Constructor
	
	//ce que tu avais écrit c'est pour le main il me semble, check les lignes ci-dessous
	public Player(){
		this.PlayerLevel = 1;
		this.HPMax = 50;
		this.ManaMax = 50;
		for (int i = 0; i < length(this.Skills); i++){ //Je ne sais pas si la fonction length existe et si elle renvoie 1 ou 0 pour un seul élément (ce qui change la condition sur i)
		this.Skills[i] = 1; // on peut remplacer ces 2 lignes par this.skills = [1, 1, 1, ..., 1] mais là on peut modifier le nb de slills comme on veut	
		} 
		this.XP = 0
		this.HP = this.HPMax;
		this.Mana = this.ManaMax;
	
	}
		/*
		 * Player construction method, by default will put all the player's skills to "1", and level to "1", the default heath and 
		 * mana are both "50" points
		 */
		
	}
	
	
	
	
	
}
