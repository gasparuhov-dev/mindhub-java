package shapes;

import impl.Shape;

public class Circle extends Shape {
	Point center = new Point();
	int r;

	public Circle(Point center) {
		this.center = center;
	}
	
	@Override
	public double getArea() {
		return 0;
	}

	@Override
	public double getPerimeter() {
		return 0;
	}
}