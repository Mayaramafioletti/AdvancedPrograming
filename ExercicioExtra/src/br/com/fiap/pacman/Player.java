package br.com.fiap.pacman;

public class Player extends GameObject {

	private int Direction;
	private int Life;
	private boolean invencivel;
	
	public Player(int x, int y, int Direction) {
		super(x, y);
		this.Direction = Direction;
	}

	
	public boolean podeMover(){
		if(getDirection() == 0)
			return getX() > 0;
			else if(getDirection() == 90)
				return getY() > getScreenSize();
				else if(getDirection() == 180)
					return getX() < getScreenSize();
				else if (getDirection() == 270)
					return getY() < 0;
		return false;
	}
	
	public void mover() {
		
		if(podeMover() == true)
			if(getDirection() == 0)
				 setY(getY() - 10);
			if(getDirection() == 90)
				setX(getX() + 10);
			if(getDirection() == 180)
				setY(getY() + 10);
			if (getDirection() == 270)
				setX(getX() - 10);
	}
	
	public boolean colisao(GameObject obj) {
		return getX() == obj.getX() && getY() == obj.getY();
	}

	public int getLife() {
		return Life;
	}

	public void setLife(int Life) {
		this.Life = Life;
	}

	public boolean isInvencivel() {
		return invencivel;
	}

	public void setInvencivel(boolean invencivel) {
		this.invencivel = invencivel;
	}


	public int getDirection() {
		return Direction;
	}


	public void setDirection(int direcao) {
		this.Direction = direcao;
	}

}
