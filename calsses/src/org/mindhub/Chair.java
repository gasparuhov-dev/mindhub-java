package org.mindhub;

public class Chair {
	private double weight;
	private Color color;
	private int numberOfLegs;
	private boolean hasBackrest;
	private String material;

	public Chair() {
		this(Color.RED);
		weight = 10;
		numberOfLegs = 4;
		hasBackrest = false;
		material = "wood";
	}
	
	public Chair(Color color) {
		this.color = color;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public boolean isHasBackrest() {
		return hasBackrest;
	}

	public void setHasBackrest(boolean hasBackrest) {
		this.hasBackrest = hasBackrest;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
}
