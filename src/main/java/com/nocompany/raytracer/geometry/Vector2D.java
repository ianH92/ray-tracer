package com.nocompany.raytracer.geometry;

public class Vector2D {
	private double x;
	private double y;
	
	private double length;
	
	/**
	 * Constructs a vector.
	 * 
	 * @param x The x-coordinate of the vector
	 * @param y The y-coordinate of the vector
	 */
	public Vector2D(double x, double y) {
		this.x = x;
		this.y = y;
		
		length = Math.sqrt((x * x) + (y * y));
	}
	
	/**
	 * Return the magnitude of the vector.
	 * 
	 * @return The magnitude of the vector
	 */
	public double length() {
		return length;
	}
	
	/**
	 * Normalizes the vector.
	 */
	public void normalize() {
		x = (x / length);
		y = (y / length);
	}
	
	/**
	 * Return the unit vector for this vector.
	 * 
	 * @return The normalized vector or unit vector
	 */
	public Vector2D getUnitVector() {
		return new Vector2D((x / length), (y / length));
	}
	
	public Double getXCoordinate() {
		return this.x;
	}
	
	public Double getYCoordinate() {
		return this.y;
	}
}
