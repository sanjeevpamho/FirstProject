package com.designPattern.Creational.FactoryPattern;

public class ShapeFactory {

	public static Shape getShape(String input) {
		switch (input) {
		case "Circle":
			return new CircleShape();
		case "Rectangle":
			return new RectangleShape();
		default:
			return null;
		}
	}
}
