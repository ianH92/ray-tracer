package com.nocompany.raytracer.geometry;

/**
 * Represents a ray in 3D space.
 * 
 * @author ianH92
 */
public class Ray {
	private Point origin;
	private Vector direction;
	
	/**
	 * Constructs a ray given a point of origin and a direction.
	 * 
	 * @param origin The point of origin for the ray
	 * @param direction The direction of the ray
	 */
	public Ray(Point origin, Vector direction) {
		this.origin = origin;
		this.direction = direction;
	}
	
	/**
	 * Return the origin point of the ray.
	 * 
	 * @return The origin of the ray
	 */
	public Point getOrigin() {
		return origin;
	}
	
	/**
	 * Return the direction of the ray.
	 *  
	 * @return The direction of the ray
	 */
	public Vector getDirection() {
		return direction;
	}
}
