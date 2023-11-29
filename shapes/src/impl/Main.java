package impl;

import java.util.ArrayList;
import java.util.List;

import shapes.Circle;
import shapes.Point;
import shapes.Rectangle;

public class Main {

	public static void main(String[] args) {
		List<Circle> circles = new ArrayList<Circle>();
		List<Triangle> triangles = new ArrayList<Triangle>();
		List<Rectangle> rectangles = new ArrayList<Rectangle>();
		
		Circle c = new Circle(new Point());
		circles.add(c);
		Triangle t = new Triangle();
//		circles.add(t);
		
		Shape s = new Shape();

		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(c);
		shapes.add(t);
		
		for(Shape s : shapes) {
			System.out.println(s.getArea());
		}
	}

}
