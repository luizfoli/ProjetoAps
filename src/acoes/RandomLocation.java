package acoes;

import java.util.Random;

/**
 * 
 * @author Luiz Felipe Oliveira
 * 
 *         Classe respons�vel por gerar localiza��es de forma aleat�ria.
 *
 */

public class RandomLocation extends MouseAction {

	private static Random random = new Random();

	public int getRandomX() {
		return random.nextInt(500) + 50;
	}

	public int getRandomY() {
		return random.nextInt(350) + 10;
	}
}
