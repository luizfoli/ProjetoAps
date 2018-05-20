package acoes;

import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;

/**
 * 
 * @author Luiz Felipe Oliveira
 * 
 *         Classe respons�vel pela a��o que verifica se houve uma coliss�o entre
 *         os elementos da tela.
 *
 */

public class CollisionElement extends ElementScreen {

	public boolean isCollision(Circle c, ImageView img) {
		return c.intersects(img.getTranslateX(), img.getTranslateY(), img.getFitWidth(), img.getFitHeight());
	}

}

