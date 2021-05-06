package Abstract;

import Entity.Game;

public  class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun baþarýyla eklendi "+ game.getName());
}
}
