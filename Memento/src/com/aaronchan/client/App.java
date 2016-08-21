package com.aaronchan.client;

import com.aaronchan.memento.Man;
import com.aaronchan.memento.ManMementoCareTaker;

public class App {
	private static int index = -1;
	private static ManMementoCareTaker careTaker;

	public static void main(String[] args) {
		careTaker = new ManMementoCareTaker();
		Man man = new Man(10, 10);
		man.attackPowerIncrease(5);
		man.defencePowerDecrease(2);
		save(man);
		man.attackPowerIncrease(50);
		man.defencePowerIncrease(40);
		save(man);
		man.attackPowerDecrease(20);
		man.defencePowerIncrease(30);
		save(man);
		man.attackPowerIncrease(10);
		man.defencePowerDecrease(20);
		save(man);
		
		undo(man);
		undo(man);
		undo(man);
		undo(man);

	}

	private static void save(Man man) {
		index++;
		System.out.println(man.toString());
		careTaker.addManMemento(man.getMemento());
	}

	private static void undo(Man man) {
		man.setMemento(careTaker.getManMemento(index));
		System.out.println(man.toString());
		index--;
	}

}
