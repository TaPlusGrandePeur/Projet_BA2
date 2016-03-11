
// import statements

import java.util.ArrayList;
import java.math.*; 	//En g�n�ral ils (les assistants) aiment pas trop qu'on importe toute une librairie � cause 
			//des noms de variables qu'on pourrait utiliser qui appartiendraient d�j� � "math"

public abstract class Character { // Superclass of Monsters and Player

	
	// ################# Declaration of player variable #################### 
	
	protected int level;     // level == 1 for a new game
	protected int hpMax;           // hp Max, relative to player level and skills
	protected int manaMax;         // mana Max, relative to player level and skills 
	// On cr�e des points de mana ou on utilise des sorts qui se rechargent ? Je pr�f�re la deuxi�me option (comme �a le guerrier a pas une barre de mana inutile)
	protected int[] skills;        // skills table {int FORCE(W), int SPEED(W), int DESTRUCTION(M), int HEALING(M)} (W = Warior, M = Mage)
	protected int vision;
	protected int hp; // Je pense que �a devrait �tre public ar modifiable par les monstre notamment (on en reparlera avec mon ULM)
	protected int mana;
	
	// ################# Declaration of variables depending on the equipment #########
	// On devrait pas mettre DPH dans la classe arme ?
	
	public int DPH;              // "Damages per hits", would be used outside of the Player class
	
	// ############### Getters and Setters ##################### //
	
	
	//Getters
	public int get_level() {return this.level;}
	public int get_hpMax() {return this.hpMax;}
	public int get_manaMax() {return this.manaMax;}
	public int[] get_skills() {return this.skills;}
	
	public int get_hp() {return this.hp;}
	public int get_mana() {return this.mana;}
	

	//Setters
	
	private void set_hpMax(int NewhpMax) {this.hpMax = NewhpMax;} //Je pense pas qu'on aura besoin de la m�thode NewhpMax() que tu voulais cr�er
	
	// ############### Simple Attack  ##################### //
	public void simple_Attack(int strength){
		
	}
	
	
	//Pas besoin de constructeur (classe abstraite)
}
	
