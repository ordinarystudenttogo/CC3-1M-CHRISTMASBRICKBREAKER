package fr.brickbreaker.ns.blocks;

/**
 * @author Al Moamar
 * @author Sublino
 * @author David
 * @author Gonzales
 * @author Mohammed
 * 
 */
public enum BlockType {
	
	DEFAULT_BLOCK(0, 20, 1, 2, 3);

	private final int id, scores, multUp, multSide, multCorner;
	
	private BlockType(int id, int scores, int multUp, int multSide, int multCorner){
		this.id = id;
		this.scores = scores;
		this.multUp = multUp;
		this.multSide = multSide;
		this.multCorner = multCorner;
	}
	
	public int getId() {
		return id;
	}
	
	public int getScores() {
		return scores;
	}
	
	public int getMultUp() {
		return multUp;
	}
	
	public int getMultSide() {
		return multSide;
	}
	
	public int getMultCorner() {
		return multCorner;
	}
}
