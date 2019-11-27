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
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Arrays;
import java.util.List;

import fr.brickbreaker.ns.audio.Sound;
import fr.brickbreaker.ns.button.Button;

import fr.brickbreaker.ns.button.menu.ExitButton;
import fr.brickbreaker.ns.button.menu.StartButton;
import fr.brickbreaker.ns.textures.Textures;

public final class Menu {

	private final List<Button> buttons = Arrays.asList(new StartButton(),
														
														new ExitButton());
	
	public Menu() {
		
	}
	
	public void update(){
		Sound.MENU_SOUND.start();
		for(Button button : buttons) button.update();
	}
	
	public void render(Graphics2D gdd){
		gdd.setColor(new Color(0,0,0));
		gdd.fill3DRect(40, 20, 640, 415, true);
		for(Button button : buttons) button.render(gdd);
		gdd.drawImage(Textures.LOGO, 130, 50, 500, 150, null);
	}
}
