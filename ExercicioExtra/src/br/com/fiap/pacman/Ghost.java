package br.com.fiap.pacman;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Ghost extends GameObject{
	
	private int Direction;
	
	public Ghost(int x, int y, int Direction) {
		super(x, y);
	}
	
	public boolean movimento() {
		
		if(getDirection() == 0) {
			if(getX() > 0) {
				return true;
			}

			setDirection(2);
			return false;
		}
		else if(getDirection() == 1) {
			if(getY() > 0) {
				return true;
			}

			setDirection(3);
			return false;

		}  else if(getDirection() == 2) {
			if(getX() < getScreenSize()) {
				return true;
			}

			setDirection(0);
			return false;

		} else if(getDirection() == 3) {
			if(getY() < getScreenSize()) {
				return true;
			}

			setDirection(1);
			return false;
		}

		return false;
	}
	
	public void mover() {
		
		Timer tempo = new Timer();
		
		TimerTask changeDirection = new TimerTask() {
			 @Override
			    public void run() {
				 	Random random = new Random();
					setDirection(random.nextInt(4));
			   };
		};
		
		tempo.schedule(changeDirection, 2000);

		if(movimento()) {
			if(getDirection() == 0) {
				setX(getX() - 10);
			}
			if(getDirection() == 1) {
				setY(getY() - 10);
			}
			if(getDirection() == 2) {
				setX(getX() + 10);
			}
			if(getDirection() == 3) {
				setY(getY() + 10);
			}
		}
		
	}
	
	
	
	public static void dano(Player player) {
		if(player.isInvencivel()) {
			player.setLife(player.getLife() - 1);
		}
	}

	public int getDirection() {
		return Direction;
	}

	public void setDirection(int direction) {
		Direction = direction;
	}
	
	

}
