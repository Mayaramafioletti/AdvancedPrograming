package br.com.fiap.pacman;

public class GameObject {
	private int x;
	private int y;
	private int ScreenSize;
	
	public GameObject(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}


	public int getScreenSize() {
		return ScreenSize;
	}


	public void setScreenSize(int ScreenSize) {
		this.ScreenSize = ScreenSize;
	}
		
}

