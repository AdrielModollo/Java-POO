package br.com.adriel;

public class Startup {
	public static void main(String[] args) {
		Video v[] = new Video[3];
		v[0] = new Video("O Senhor dos Anéis");
		v[1] = new Video("Vingadores");
		v[2] = new Video("Spider Man");
		
		Usuario g[] = new Usuario[2];
		g[0] = new Usuario("Marina", 16, "F", "Mah");
		g[1] = new Usuario("Adriel", 26, "M", "Dri");
		
		System.out.println(v[0].toString());
	}
}
