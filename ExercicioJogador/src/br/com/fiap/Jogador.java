package br.com.fiap;

public abstract class Jogador implements Visual{
	private String nome;
	private int xp;
	private int hp;
	private boolean envenenado;
	
	
	public Jogador(String nome) {
		this.nome = nome;
	}
	
	public int getXp() {
		return this.xp;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public boolean isEnvenenado() {
		return this.envenenado;
	}
	
	public void receberDano(int pontos) {
		this.hp -= pontos;
	}
	public void receberCura(int pontos) {
		this.hp += pontos;
	}
	public void ganharExperiencia(int pontos) {
		this.xp += pontos;
	}
	public boolean receberAntidoto() {
		return this.envenenado == false;
	}

}
