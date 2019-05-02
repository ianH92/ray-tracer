package com.nocompany.raytracer.geometry;

/**
 * Class representing a mathematical vector.
 * 
 * @author ianH92
 */
public class Vector {
	
	private Double x;
	private Double y;
	private Double z;
	
	private Double length;
	
	/**
	 * Constructs a vector.
	 * 
	 * @param x The x-coordinate of the vector
	 * @param y The y-coordinate of the vector
	 * @param z The z-coordinate of the vector
	 */
	public Vector(Double x, Double y, Double z) {
		this.x = x;
		this.y = y;
		this.z = z;
		
		this.length = Math.sqrt((x * x) + (y * y) + (z * z));
	}
	
	/**
	 * Return the magnitude of the vector.
	 * 
	 * @return The magnitude of the vector
	 */
	public Double length() {
		return this.length;
	}
	
	/**
	 * Normalizes the vector.
	 */
	public void normalize() {
		x = (x / length);
		y = (y / length);
		z = (z / length);
	}
	
	/**
	 * Return the unit vector for this vector.
	 * 
	 * @return The normalized vector or unit vector
	 */
	public Vector getUnitVector() {
		return new Vector((x / length), (y / length), (z / length));
	}
	
	public Double getXCoordinate() {
		return this.x;
	}
	
	public Double getYCoordinate() {
		return this.y;
	}
	
	public Double getZCoordinate() {
		return this.z;
	}
}
