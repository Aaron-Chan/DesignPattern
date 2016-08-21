package com.aaronchan.memento;

import java.util.ArrayList;
import java.util.List;

public class ManMementoCareTaker {

	private List<ManMemento> list = new ArrayList<>();

	public void addManMemento(ManMemento manMemento) {
		list.add(manMemento);
	}

	public ManMemento getManMemento(int index) {
		return list.get(index);
	}

}
