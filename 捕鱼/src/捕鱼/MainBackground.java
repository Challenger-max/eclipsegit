package ≤∂”„;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MainBackground {
//2222
	private Image img;
	private int x;
	private int y;
	public MainBackground() {
		// TODO Auto-generated constructor stub
		try {
			img=ImageIO.read(new File("images/bg.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void paintBackground(Graphics g) {
		g.drawImage(img, x, y, null);
	}

}
