package entities;

public class Rectangle {
	
	public double w;
	public double h;
	
	public double area() {
		return w * h;
	}
	
	public double perimeter() {
		return w*2 + h*2;
	}
	
	public double diagonal() {
		return Math.sqrt(w*w + h*h);
	}
}
