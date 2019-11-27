package fr.brickbreaker.ns.blocks;

/**
 * @author Al Moamar
 * @author Sublino
 * @author David
 * @author Gonzales
 * @author Mohammed
 * 
 */
import java.awt.Color;

import fr.brickbreaker.ns.textures.Textures;

public class DefaultBlock extends Block{

	public DefaultBlock(int x, int y) {
		super(x, y, BlockType.DEFAULT_BLOCK, new Color(255, 255, 0));
		super.setTexture(Textures.DEFAULT_BLOCK);
	}

}
