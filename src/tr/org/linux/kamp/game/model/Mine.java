package tr.org.linux.kamp.game.model;

import java.awt.Color;

public class Mine  extends GameObject{

	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	private String mName;
	public Mine(int x, int y, int radius, Color color,String name) {
		super(x, y, radius, color);
	    this.mName=name;
	}

}
