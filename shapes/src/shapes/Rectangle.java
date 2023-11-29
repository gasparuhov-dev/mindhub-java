package shapes;

import impl.Shape;

public class Rectangle extends Shape {
	Point point1 = new Point();
	Point point2 = new Point();

	@Override
	public double getArea() {
		double area;
		area = sidea() * sideb();
		return area;
	}

	@Override
	public double getPerimeter() {
		double parameter;
		parameter = sidea() * 2 + sideb() * 2;
		return parameter;
	}

	private double sidea() {
		int a;
		a = Math.abs(point1.x - point2.x);
		return a;
	}

	private double sideb() {
		int b;
		b = Math.abs(point1.y - point2.y);
		return b;
	}

}
