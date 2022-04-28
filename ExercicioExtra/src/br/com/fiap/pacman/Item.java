package br.com.fiap.pacman;

public class Item extends GameObject{
	
	private boolean visivel;

	public Item(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	public boolean visibilidade() {
		return visivel;
	}
	
	public void setVisivel(boolean visivel) {
		if (!visivel) {
			setX(-100);
			setY(-100);
		}
		
		this.visivel = visivel;
	}

}
