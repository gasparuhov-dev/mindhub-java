package org.mindhub.inheritance;

import java.util.Objects;

public class Programming extends Class {
	private String lesson;
	public int hours;

	public Programming() {
		super(10);
		lesson = "Java";
	}

	public void setHours(int hours) {
		hours = 5;
		super.hours = hours;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Programming other = (Programming) obj;
		return hours == other.hours && Objects.equals(lesson, other.lesson);
	}

	@Override
	public String toString() {
		return "Programming [lesson=" + lesson + ", hours=" + super.hours + "]";
	}
	
		

}
