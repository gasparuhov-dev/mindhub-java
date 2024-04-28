package org.mindhub.maven;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Person {

	private String name;
	private int age;
	private int height;
	@Getter(AccessLevel.PROTECTED)
	private int weight;
	private String hairColor;

	public int getHeight() {
		return height / 10;
	}
}
