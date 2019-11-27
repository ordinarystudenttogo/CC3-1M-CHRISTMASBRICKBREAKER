package fr.brickbreaker.ns.game;

/**
 *
 * @author Sublino
 * @author David
 * @author Al Moamar
 * @author Gonzales
 * @author Mohammed
 * 
 */
import fr.brickbreaker.ns.game.level.DefaultLevel;

public enum LevelType {

	DEFAULT(0, new DefaultLevel());
	
	private final int id;
	private final Level level;
	
	private LevelType(int id, Level level) {
		this.id = id;
		this.level = level;
	}
	
	public int getId() {
		return id;
	}
	
	public Level getLevel() {
		return level;
	}
	
	public static Level getLevel(int id){
		for(LevelType level : LevelType.values()){
			if(level.getId() == id) return level.getLevel().newLevel();
		}
		return DEFAULT.getLevel().newLevel();
	}
}
