package com.designPattern.Creational.FactoryPattern;

public class TestShapeFactory {
	public static void main(String[] args) {
		Shape shapeCircle = ShapeFactory.getShape("Circle");
		shapeCircle.draw();
	}

}
