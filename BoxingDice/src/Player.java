import java.util.Random;
public class Player {
	String name;
	int hitPoints;
	
	
	public Player(String name, int hitPoints) {
		this.name = name;
		this.hitPoints = hitPoints;
		
		
		}

public void attack() {
	int attackResult;
	field Field = new field();
	attackResult = Field.diceTotal();
	
}

	
}
