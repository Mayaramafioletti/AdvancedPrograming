package br.com.fiap.pacman;

public class Ghost extends GameObject{
	private int Direction;
	public Ghost(int x, int y, int Direction) {
		super(x, y);
	}
	
	public boolean mover() {
		if(getDirection() == 0)
			return getY() - 10 > 0;
		if(getDirection() == 90)
			return getX() + 10 < getScreenSize();
		if(getDirection() == 180)
			return getY() + 10 < getScreenSize();
		if (getDirection() == 270)
			return getX() + 10 > 0;
		return false;
	}
	public void movimento() {
		if(mover() == true)
			if(getDirection() == 0)
				 setY(getY() - 10);
			if(getDirection() == 90)
				setX(getX() + 10);
			if(getDirection() == 180)
				setY(getY() + 10);
			if (getDirection() == 360)
				setX(getX() + 10);
		
	}

	public int getDirection() {
		return Direction;
	}

	public void setDirection(int direction) {
		Direction = direction;
	}
	
	

}
