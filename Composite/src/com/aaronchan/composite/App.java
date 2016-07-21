package com.aaronchan.composite;

public class App {

	public static void main(String[] args) {
		Employee jack = new CommonEmployee("jack");
		Employee lulu = new CommonEmployee("lulu");
		Employee mark = new Leader("mark");

		jack.work();
		jack.addSubordinate(lulu);
		jack.removeSubOrdinate(lulu);

		mark.work();
		mark.addSubordinate(jack);
		mark.addSubordinate(lulu);
		mark.work();
	}

}
