
public class playerCharacter 
{
	int hp;
	int max_hp;
	
	int atk;
	int base_atk;
	
	int def;
	int base_def;
	
	int coins;
	int max_coins;
	
	boolean isValid = true;
	
		public playerCharacter(int max_hp, int base_atk, int base_def, int max_coins) 
	{
		this.max_hp = max_hp;
		this.base_atk = base_atk;
		this.base_def = base_def;
		this.max_coins = max_coins;
		
		hp = max_hp;
		atk = base_atk;
		def = base_def;
		coins = max_coins;
	}
}
