package tr.org.linux.kamp.game.model;

import java.awt.Color;
import java.awt.Graphics2D;

public class Enemy extends GameObject{

	
	private int speed;
	public String getEnemyname() {
		return Enemyname;
	}
	public void setEnemyname(String enemyname) {
		Enemyname = enemyname;
	}
	private String Enemyname;
	public Enemy(int x, int y, int radius, Color color, int speed,String Enemyname) {
		super(x, y, radius, color);
		this.speed = speed;
		this.Enemyname=Enemyname;
	
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	  @Override
		public void setRadius(int radius) {
			// TODO Auto-generated method stub
			super.setRadius(radius);
			if(getRadius()<5) {
				setRadius(5);
			}else if(getRadius()>250) {
				setRadius(250);
			}
			
		}
	@Override
	public void draw(Graphics2D g2d) {
		// TODO Auto-generated method stub
		super.draw(g2d);
	}
}
