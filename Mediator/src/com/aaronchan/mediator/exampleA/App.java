package com.aaronchan.mediator.exampleA;

public class App {

	public static void main(String[] args) {

		ShowImpl show = new ShowImpl();
		Leading leading = new Leading();
		Enemy enemy = new Enemy();
		GoodFriend goodFriend = new GoodFriend();

		show.setLeading(leading);
		show.setGoodFriend(goodFriend);
		show.setEnemy(enemy);

		leading.act(Action.GET_GOOD_MARKS);
		enemy.act(Action.GET_GOOD_MARKS);
		goodFriend.act(Action.GET_GOOD_MARKS);

		leading.act(Action.CRY);
		enemy.act(Action.CRY);
		goodFriend.act(Action.CRY);
	}

}
