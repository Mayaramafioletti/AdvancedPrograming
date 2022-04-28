package br.com.fiap.pacman;

public class Bomb extends Item{
	
	private boolean explodir;

	public Bomb(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
		
	public void explode(Player player) {
		if(!isExplodir()) {
			if(!player.isInvencivel()){
				player.setLife(player.getLife() - 1);
			}
			
			setExplodir(true);
			setVisivel(false);
		}
	}

	public boolean isExplodir() {
		return explodir;
	}

	public void setExplodir(boolean explodir) {
		this.explodir = explodir;
	}

}
