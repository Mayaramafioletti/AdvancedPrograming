package br.com.fiap.pacman;

import java.util.Timer;
import java.util.TimerTask;

public class Booster extends Item{
	
	private int tamanho;

	public Booster(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	
	public void PlayerInvencivel(Player player) {
		Timer tempo = new Timer();
		
		setVisivel(false);
		player.setInvencivel(true);
		System.out.println("Invencível");
		
		TimerTask turnFair = new TimerTask() {
			 @Override
			    public void run() {
			        player.setInvencivel(false);
				 System.out.println("O Booster acabou. =(");
			   };
		};
		tempo.schedule(turnFair, getTamanho());
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

}
