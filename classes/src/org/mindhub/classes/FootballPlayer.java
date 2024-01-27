package org.mindhub.classes;

public class FootballPlayer implements Player {

	public FootballPlayer() {
//		name is final, because it is defined in interface
//		name = "asdasd";
	}

	@Override
	public void play() {
		System.out.println("I am playing football!");

	}

}
