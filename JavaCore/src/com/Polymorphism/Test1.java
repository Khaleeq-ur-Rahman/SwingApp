package com.Polymorphism;

public class Test1 {

	public static void main(String[] args) {
		
		Shap circle = new Circle();
		Shap rectangle = new Rectangle();
		Shap triangle = new Triangle();
		
		circle.draw();
		rectangle.draw();
		triangle.draw();
	}

}
