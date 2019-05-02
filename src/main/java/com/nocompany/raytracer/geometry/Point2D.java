package com.nocompany.raytracer.geometry;

public class Point2D {
	private Double x;
	private Double y;
	
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Double getX() {
		return x;
	}
	
	public void setX(Double x) {
		this.x = x;
	}
	
	public Double getY() {
		return y;
	}
	
	public void setY(Double y) {
		this.y = y;
	}
}
